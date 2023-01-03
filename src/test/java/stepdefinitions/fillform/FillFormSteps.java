package stepdefinitions.fillform;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.hamcrest.CoreMatchers;
import setup.SetUp;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static questions.FillFormQuestions.fillFormQuestions;
import static tasks.FillForm.fillForm;
import static tasks.OpenLandingPage.openLandingPage;

public class FillFormSteps extends SetUp {

    private static final String ACTOR_NAME = "Steven";
    private DataTable dataTable;

    @Dado("a que el usuario ya agrego productos al carrito de compras")
    public void aQueElUsuarioYaAgregoProductosAlCarritoDeCompras() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @Cuando("diligencia el formulario de pago y envio")
    public void diligenciaElFormularioDePagoYEnvio(DataTable userData) {
        dataTable = userData;
        theActorInTheSpotlight().attemptsTo(
                fillForm().usandoDocumento(userData.row(0).get(1))
                        .usandoEmail(userData.row(1).get(1))
                        .usandoNombre(userData.row(2).get(1))
                        .usandoApellido(userData.row(3).get(1))
                        .usandoDepartamento(userData.row(4).get(1))
                        .usandoMunicipio(userData.row(5).get(1))
                        .usandoDireccion1(userData.row(6).get(1))
                        .usandoDireccion2(userData.row(7).get(1))
                        .usandoCelular(userData.row(8).get(1))
                        .yUsandoNotas(userData.row(9).get(1))
        );
    }

    @Entonces("el usuario que su informacion de pago y envio se guardo")
    public void elUsuarioQueSuInformacionDePagoYEnvioSeGuardo() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                fillFormQuestions().llenadoConDocumento(dataTable.row(0).get(1))
                                        .yConEmail(dataTable.row(1).get(1))
                                        .yConNombre(dataTable.row(2).get(1))
                                        .yConApellido(dataTable.row(3).get(1))
                                        .is(), CoreMatchers.equalTo(true)
                        )
                );
    }
}
