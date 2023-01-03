package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static userinterfaces.CarritoCompras.*;

public class CarritoComprasQuestions implements Question<Boolean> {

   /* private Target producto01;
    private Target producto02;
    private Target producto03;
    private Target producto04;

    public CarritoComprasQuestions producto01Present(Target producto01){
        this.producto01 = producto01;
        return this;
    }

    public CarritoComprasQuestions andproducto02Present(Target producto02){
        this.producto02 = producto02;
        return this;
    }

    public CarritoComprasQuestions andproducto03Present(Target producto03){
        this.producto03 = producto03;
        return this;
    }

    public CarritoComprasQuestions andproducto04Present(Target producto04){
        this.producto04 = producto04;
        return this;
    }*/

    public CarritoComprasQuestions is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return(
                PRODUCTO_01_VALIDACION.resolveFor(actor).isPresent()
                        &&PRODUCTO_02_VALIDACION.resolveFor(actor).isVisible()
                        &&PRODUCTO_03_VALIDACION.resolveFor(actor).isVisible()
                        &&PRODUCTO_04_VALIDACION.resolveFor(actor).isVisible()
                );
    }

    public static CarritoComprasQuestions carritoComprasQuestions(){
        return new CarritoComprasQuestions();
    }

}
