package stepdefinitions.pedido;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.PedidoQuestions;
import setup.SetUp;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.FillForm.fillForm;
import static tasks.OpenLandingPage.openLandingPage;
import static tasks.PedidoTask.pedidoTask;

public class PedidoSteps extends SetUp {

    private static final String ACTOR_NAME = "Steven";
    private static final Actor actor = new Actor(ACTOR_NAME);
    private DataTable dataTable;

    @Dado("a que el usuario ya agrego productos al carrito de compras y diligencio el formulario de pago y envio")
    public void aQueElUsuarioYaAgregoProductosAlCarritoDeComprasYDiligencioElFormularioDePagoYEnvio(DataTable userData) {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

        dataTable = userData;
        theActorInTheSpotlight().attemptsTo(
                fillForm().usandoDocumento(userData.row(0).get(1))
                        .usandoEmail(userData.row(1).get(1))
                        .usandoNombre(userData.row(2).get(1))
                        .usandoApellido(userData.row(3).get(1))
                        .usandoDepartamento(userData.row(4).get(1))
                        .usandoMunicipio(userData.row(5).get(1))
                        .usandoDireccion1(userData.row(6).get(1))
                        .usandoDireccion2(userData.row(7).get(1))
                        .usandoCelular(userData.row(8).get(1))
                        .yUsandoNotas(userData.row(9).get(1))
        );
    }

    @Cuando("ingresa a la zona de pedido completado")
    public void ingresaALaZonaDePedidoCompletado() {
        theActorInTheSpotlight().attemptsTo(
                pedidoTask()
        );

    }

    @Entonces("el usuario ve el detalle del pedido realizado de forma exitosa")
    public void elUsuarioVeElDetalleDelPedidoRealizadoDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(PedidoQuestions.pedidoQuestions().answeredBy(actor)).isTrue()
        );
        System.out.println("Pedido en orden");
    }
}
