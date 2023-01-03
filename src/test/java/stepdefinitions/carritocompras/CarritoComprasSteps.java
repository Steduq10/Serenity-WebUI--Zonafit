package stepdefinitions.carritocompras;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.ensure.Ensure;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import questions.CarritoComprasQuestions;
import setup.SetUp;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.CarritoComprasTask.carritoCompras;
import static tasks.OpenLandingPage.openLandingPage;

public class CarritoComprasSteps extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(CarritoComprasSteps.class);
    private static final String ACTOR_NAME = "Steven";
    private static final Actor actor = new Actor(ACTOR_NAME);


    @Dado("a que el usuario esta en el menu principal de la pagina")
    public void aQueElUsuarioEstaEnElMenuPrincipalDeLaPagina() {
       try{
           setUpLog4j2();
           actorSetupTheBrowser(ACTOR_NAME);
           theActorInTheSpotlight().wasAbleTo(
                   openLandingPage()
           );
           LOGGER.info("Usuario ingresó al menú principal de la página");
       }catch (Exception e){
           LOGGER.error("Error en la ejecución del test: " + e.getMessage());
           Assertions.fail("Error en la ejecución del test: " + e.getMessage());
       }

    }

    @Cuando("va a la seccion de ofertas y agrega productos al carrito")
    public void vaALaSeccionDeOfertasYAgregaProductosAlCarrito() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    carritoCompras()
            );
            LOGGER.info("Se agregaron productos al carrito");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }
    }

    @Entonces("los productos son agregados correctamente al carrito")
    public void losProductosSonAgregadosCorrectamenteAlCarrito() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    Ensure.that(CarritoComprasQuestions.carritoComprasQuestions().answeredBy(actor)).isTrue()
            );
            LOGGER.info("productos agregados al carrito correctamente");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
        }
    }


}
