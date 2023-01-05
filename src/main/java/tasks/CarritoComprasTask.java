package tasks;



import interactions.Click;
import interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.support.ui.Wait;

import static userinterfaces.CarritoCompras.*;
import static userinterfaces.DetallesPago.FINALIZAR;

public class CarritoComprasTask implements Task {





    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Scroll.scrollTo(OFERTAS),
                DoubleClick.on(OFERTAS),

                Scroll.scrollTo(ACERCADE),
                Scroll.scrollTo(ACERCADE),


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

                //Scroll.scrollTo(CARRITO),
                //Click.clickOn(CARRITO)

                Scroll.scrollTo(FINALIZAR),
                Click.clickOn(FINALIZAR)
        );
    }
    public static CarritoComprasTask carritoCompras(){

        return new CarritoComprasTask();
    }
}
