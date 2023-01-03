package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.Pedido.*;

public class PedidoQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                DESCRIPCIONPRODUCTO.resolveFor(actor).isDisplayed()
                &&PRECIOPRODUCTO.resolveFor(actor).isDisplayed()
                        &&SUBTOTAL.resolveFor(actor).isDisplayed()
                        &&SUBTOTALVALOR.resolveFor(actor).isDisplayed()
                        &&DESCUENTO.resolveFor(actor).isDisplayed()
                        &&DESCUENTOVALOR.resolveFor(actor).isDisplayed()
                        &&ENVIO.resolveFor(actor).isDisplayed()
                        &&ENVIOVALOR.resolveFor(actor).isDisplayed()
                        &&METODOPAGO.resolveFor(actor).isDisplayed()
                        &&METODOPAGOVALOR.resolveFor(actor).isDisplayed()
                        &&TOTAL.resolveFor(actor).isDisplayed()
                        &&TOTALVALOR.resolveFor(actor).isDisplayed()
                );
    }
    public static PedidoQuestions pedidoQuestions(){
        return new PedidoQuestions();
    }
}
