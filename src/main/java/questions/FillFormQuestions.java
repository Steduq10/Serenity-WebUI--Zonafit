package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.DetallesPago;

import static userinterfaces.DetallesPago.*;


public class FillFormQuestions implements Question<Boolean> {

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

    public FillFormQuestions llenadoConDocumento(String documento){
        this.documento = documento;
        return this;
    }

    public FillFormQuestions yConEmail(String email){
        this.email = email;
        return this;
    }

    public FillFormQuestions yConNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public FillFormQuestions yConApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public FillFormQuestions yConDepartamento(String departamento){
        this.departamento = departamento;
        return this;
    }

    public FillFormQuestions yConMunicipio(String municipio){
        this.municipio = municipio;
        return this;
    }

    public FillFormQuestions yConDireccion1(String direccion1){
        this.direccion1 = direccion1;
        return this;
    }

    public FillFormQuestions yConDireccion2(String direccion2){
        this.direccion2 = direccion2;
        return this;
    }

    public FillFormQuestions yConCelular(String celular){
        this.celular = celular;
        return this;
    }

    public FillFormQuestions yConNotas(String notas){
        this.notas = notas;
        return this;
    }

    public FillFormQuestions is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (DOCUMENTO.resolveFor(actor).containsOnlyText(documento)
                && EMAIL.resolveFor(actor).containsOnlyText(email)
                && NOMBRE.resolveFor(actor).containsOnlyText(nombre)
                && APELLIDO.resolveFor(actor).containsOnlyText(apellido)
                //Pendiente completar el resto de datos
        );
    }

    public static FillFormQuestions fillFormQuestions(){
        return new FillFormQuestions();
    }
}
