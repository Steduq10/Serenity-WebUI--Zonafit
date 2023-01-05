package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.Pedido.*;

public class PedidoQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (
                DESCRIPCIONPRODUCTO.resolveFor(actor).isPresent()
                &&PRECIOPRODUCTO.resolveFor(actor).isPresent()
                        &&SUBTOTAL.resolveFor(actor).isPresent()
                        &&SUBTOTALVALOR.resolveFor(actor).isPresent()
                        &&DESCUENTO.resolveFor(actor).isPresent()
                        &&DESCUENTOVALOR.resolveFor(actor).isPresent()
                        &&ENVIO.resolveFor(actor).isPresent()
                        &&ENVIOVALOR.resolveFor(actor).isPresent()
                        &&METODOPAGO.resolveFor(actor).isPresent()
                        &&METODOPAGOVALOR.resolveFor(actor).isPresent()
                        &&TOTAL.resolveFor(actor).isPresent()
                        &&TOTALVALOR.resolveFor(actor).isPresent()
                );
    }
    public static PedidoQuestions pedidoQuestions(){
        return new PedidoQuestions();
    }
}
