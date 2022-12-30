package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static interactions.Click.clickOn;
import static interactions.Scroll.scrollTo;
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

                Scroll.to(DEPARTAMENTO),
                Clear.field(DEPARTAMENTO),
                Enter.theValue(departamento).into(DEPARTAMENTO),

                Scroll.to(MUNICIPIO),
                Clear.field(MUNICIPIO),
                Enter.theValue(municipio).into(MUNICIPIO),

                Scroll.to(DIRECCION1),
                Clear.field(DIRECCION1),
                Enter.theValue(direccion1).into(direccion1),

                Scroll.to(DIRECCION2),
                Clear.field(DIRECCION2),
                Enter.theValue(direccion2).into(DIRECCION2),

                Scroll.to(CELULAR),
                Clear.field(CELULAR),
                Enter.theValue(celular).into(CELULAR),

                Scroll.to(NOTAS),
                Clear.field(NOTAS),
                Enter.theValue(notas).into(NOTAS),

                scrollTo(ORDEN),
                clickOn(ORDEN)
        );
    }

    public static FillForm fillForm(){
        return new FillForm();
    }
}
