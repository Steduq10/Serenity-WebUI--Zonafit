package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterfaces.Pedido.*;

public class PedidoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Scroll.to(DESCRIPCIONPRODUCTO),

              Scroll.to(PRECIOPRODUCTO),
              Scroll.to(SUBTOTAL),
              Scroll.to(TOTAL)
      );



    }
    public static PedidoTask pedidoTask(){
        return new PedidoTask();
    }
}
