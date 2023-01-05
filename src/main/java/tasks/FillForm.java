package tasks;

import interactions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import userinterfaces.DetallesPago;

import static interactions.Click.clickOn;
import static interactions.Scroll.scrollTo;
import static userinterfaces.CarritoCompras.OFERTAS;
import static userinterfaces.DetallesPago.*;

public class FillForm implements Task {

    private String documento;
    private String email;
    private String nombre;
    private String apellido;
    private String departamento;
    private String municipio;
    private String direccion1;
    private String direccion2;
    private String celular;
    private String notas;

    public FillForm usandoDocumento(String documento){
        this.documento = documento;
        return this;
    }

    public FillForm usandoEmail(String email){
        this.email = email;
        return this;
    }

    public FillForm usandoNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public FillForm usandoApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public FillForm usandoDepartamento(String departamento){
        this.departamento = departamento;
        return this;
    }

    public FillForm usandoMunicipio(String municipio){
        this.municipio = municipio;
        return this;
    }

    public FillForm usandoDireccion1(String direccion1){
        this.direccion1 = direccion1;
        return this;
    }

    public FillForm usandoDireccion2(String direccion2){
        this.direccion2 = direccion2;
        return this;
    }

    public FillForm usandoCelular(String celular){
        this.celular = celular;
        return this;
    }

    public FillForm yUsandoNotas(String notas){
        this.notas = notas;
        return this;
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Scroll.to(DIRECCION1),
                Clear.field(DIRECCION1),
                Enter.theValue(direccion1).into(DIRECCION1),

                Scroll.to(OPCIONDEPARTAMENTO),
                MoveMouse.to(OPCIONDEPARTAMENTO).andThen(actions -> actions.click()),

                MoveMouse.to(DEPARTAMENTO).andThen(actions -> actions.click()),
                Clear.field(DEPARTAMENTO),
                Enter.theValue(departamento).into(DEPARTAMENTO),

                MoveMouse.to(CORRECTODEPARTAMENTO).andThen(actions -> actions.click()),


                Scroll.to(OPCIONMUNICIPIO),
                MoveMouse.to(OPCIONMUNICIPIO).andThen(actions -> actions.click()),

                MoveMouse.to(MUNICIPIO).andThen(actions -> actions.click()),
                Clear.field(MUNICIPIO),
                Enter.theValue(municipio).into(MUNICIPIO),

                MoveMouse.to(CORRECTOMUNICIPIO).andThen(actions -> actions.click()),


                Scroll.to(DIRECCION2),
                Clear.field(DIRECCION2),
                Enter.theValue(direccion2).into(DIRECCION2),

                Scroll.to(DOCUMENTO),
                Clear.field(DOCUMENTO),
                Enter.theValue(documento).into(DOCUMENTO),

                Scroll.to(EMAIL),
                Clear.field(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(NOMBRE),
                Clear.field(NOMBRE),
                Enter.theValue(nombre).into(NOMBRE),

                Scroll.to(APELLIDO),
                Clear.field(APELLIDO),
                Enter.theValue(apellido).into(APELLIDO),





                Scroll.to(CELULAR),
                Clear.field(CELULAR),
                Enter.theValue(celular).into(CELULAR),

                Scroll.to(NOTAS),
                Clear.field(NOTAS),
                Enter.theValue(notas).into(NOTAS),

               // Scroll.to(PAGOBALOTO),
               // MoveMouse.to(PAGOBALOTO).andThen(actions -> actions.click()),

                Scroll.to(TERMINOS),
                net.serenitybdd.screenplay.actions.Click.on(TERMINOS),

                scrollTo(ORDEN),
                net.serenitybdd.screenplay.actions.Click.on(ORDEN)
        );
    }

    public static FillForm fillForm(){
        return new FillForm();
    }
}
