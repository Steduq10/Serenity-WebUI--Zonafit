package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static userinterfaces.CarritoCompras.*;

public class CarritoComprasQuestions implements Question<Boolean> {


    public CarritoComprasQuestions is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return(
                PRODUCTO_01_VALIDACION.resolveFor(actor).isDisplayed()
                        &&PRODUCTO_02_VALIDACION.resolveFor(actor).isDisplayed()
                        &&PRODUCTO_03_VALIDACION.resolveFor(actor).isDisplayed()
                        &&PRODUCTO_04_VALIDACION.resolveFor(actor).isDisplayed()
                );
    }

    public static CarritoComprasQuestions carritoComprasQuestions(){
        return new CarritoComprasQuestions();
    }

}
