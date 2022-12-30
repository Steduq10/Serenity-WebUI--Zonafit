package tasks;


import interactions.Click;
import interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static userinterfaces.CarritoCompras.*;

public class CarritoCompras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.scrollTo(OFERTAS),
                Click.clickOn(OFERTAS),


                Scroll.scrollTo(PRODUCTO_01),
                Click.clickOn(PRODUCTO_01),

                Scroll.scrollTo(CLOSEBUTTON),
                Click.clickOn(CLOSEBUTTON),

                Scroll.scrollTo(PRODUCTO_02),
                Click.clickOn(PRODUCTO_02),

                Scroll.scrollTo(CLOSEBUTTON),
                Click.clickOn(CLOSEBUTTON),

                Scroll.scrollTo(PRODUCTO_03),
                Click.clickOn(PRODUCTO_03),

                Scroll.scrollTo(CLOSEBUTTON),
                Click.clickOn(CLOSEBUTTON),

                Scroll.scrollTo(PRODUCTO_04),
                Click.clickOn(PRODUCTO_04),

                Scroll.scrollTo(CLOSEBUTTON),
                Click.clickOn(CLOSEBUTTON)
        );
    }
    public static CarritoCompras carritoCompras(){
        return new CarritoCompras();
    }
}
