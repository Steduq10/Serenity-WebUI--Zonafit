package stepdefinitions.pedidoexitoso;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import questions.PedidoQuestions;
import setup.SetUp;
import stepdefinitions.pedido.PedidoSteps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.CarritoComprasTask.carritoCompras;
import static tasks.FillForm.fillForm;
import static tasks.OpenLandingPage.openLandingPage;
import static tasks.PedidoTask.pedidoTask;

public class PedidoExitosoSteps extends SetUp {

    private static final Logger LOGGER = Logger.getLogger(PedidoExitosoSteps.class);
    private static final String ACTOR_NAME = "Steven";
    private static final Actor actor = new Actor(ACTOR_NAME);
    private DataTable dataTable;

    @Dado("a que el usuario esta en el menu principal de la pagina zonafit.co")
    public void aQueElUsuarioEstaEnElMenuPrincipalDeLaPaginaZonafit() {
        try{
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(openLandingPage());

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }

    }

    @Cuando("va a la seccion de ofertas y agrega productos al carrito de compras")
    public void vaA_LaSeccionDeOfertasYAgregaProductosAlCarritoDeCompras() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    carritoCompras()
            );
            LOGGER.info("El usuario agregó productos al carrito");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }


    }

    @Y("diligencia el formulario de pago y envio completamente")
    public void diligencioElFormularioDePagoYEnvioCompletamente(DataTable userData) {
        try{
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

            LOGGER.info("El usuario diligenció el formulario correctamente");
            theActorInTheSpotlight().attemptsTo(
                    pedidoTask());
            LOGGER.info("El usuario ingresó a la zona final del pedido");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }
    }

    @Entonces("el usuario ve el detalle del pedido realizado de forma exitosa")
    public void elUsuarioVeElDetalleDelPedidoRealizadoDeFormaExitosa() {
        try{
            theActorInTheSpotlight().asksFor(PedidoQuestions.pedidoQuestions()).equals(true);
            LOGGER.info("El usuario ve el detalle del pedido realizado de forma exitosa");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }

    }


}
