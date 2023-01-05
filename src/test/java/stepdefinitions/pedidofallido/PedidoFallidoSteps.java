package stepdefinitions.pedidofallido;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import questions.MensajeAlerta;
import setup.SetUp;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.CarritoComprasTask.carritoCompras;
import static tasks.FillForm.fillForm;
import static tasks.OpenLandingPage.openLandingPage;


public class PedidoFallidoSteps extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(PedidoFallidoSteps.class);
    private static final String ACTOR_NAME = "Steven";
    private static final Actor actor = new Actor(ACTOR_NAME);
    private DataTable dataTable;

    @Dado("a que el usuario esta en el menu principal de la pagina")
    public void aQueElUsuarioEstaEnElMenuPrincipalDeLaPagina() {
        try{
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(openLandingPage());

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }

    }

    @Cuando("va a la seccion de ofertas y agrega productos al carrito")
    public void vaA_LaSeccionDeOfertasYAgregaProductosAlCarrito() {
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

    @Y("diligencio el formulario de pago y envio con un formato de email no valido")
    public void diligencioElFormularioDePagoYEnvioConUnFormatoDeEmailNoValido(DataTable userData) {
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

            LOGGER.info("El usuario diligenció el formulario incorrectamente");

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }
    }

    @Entonces("el usuario ve que su pedido no se completa hasta que corriga el error")
    public void elUsuarioVeQueSuPedidoNoSeCompletaHastaQueCorrigaElError() {
        try{
            theActorInTheSpotlight().asksFor(MensajeAlerta.mensajeAlerta()).equals(true);
            LOGGER.info("El usuario ve un mensaje de alerta indicando que el correo electronico no es válido");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }

    }
}
