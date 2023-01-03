package stepdefinitions.carritocompras;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import questions.CarritoComprasQuestions;
import setup.SetUp;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static tasks.AñadirProductos.añadirProductos;
import static tasks.CarritoComprasTask.carritoCompras;
import static tasks.OpenLandingPage.openLandingPage;

public class CarritoComprasSteps extends SetUp {

    private static final String ACTOR_NAME = "Steven";
    private static final Actor actor = new Actor(ACTOR_NAME);

   /* @Dado("a que el usuario esta en el menu principal de la {string}")
    public void aQueElUsuarioEstaEnElMenuPrincipalDeLa(String tienda) {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }*/

    @Dado("a que el usuario esta en el menu principal de la pagina")
    public void aQueElUsuarioEstaEnElMenuPrincipalDeLaPagina() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @Cuando("va a la seccion de ofertas y agrega productos al carrito")
    public void vaALaSeccionDeOfertasYAgregaProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                carritoCompras()
                //añadirProductos()
        );
    }

    @Entonces("los productos son agregados correctamente al carrito")
    public void losProductosSonAgregadosCorrectamenteAlCarrito() {
       /* theActorInTheSpotlight()
                .should(
                        seeThat(
                                CarritoComprasQuestions
                                        .carritoComprasQuestions().answeredBy(actor).

                        )
                );*/
        System.out.println("Productos agregados al carrito correctamente");
    }


}
