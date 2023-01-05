package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.DetallesPago.*;
import static userinterfaces.DetallesPago.APELLIDO;

public class MensajeAlerta implements Question<Boolean> {

    private String mensajeAlerta;

    public MensajeAlerta presenteMensajeAlerta(String mensajeAlerta){
        this.mensajeAlerta = mensajeAlerta;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (MENSAJEALERTA.resolveFor(actor).isVisible()
        );
    }

    public static MensajeAlerta mensajeAlerta(){
        return new MensajeAlerta();
    }
}
