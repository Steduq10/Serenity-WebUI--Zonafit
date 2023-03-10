package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.landingpage.LandingPage;

public class OpenLandingPage implements Task {

    private LandingPage landingPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(landingPage)
        );
    }

    public static OpenLandingPage openLandingPage(){
        return new OpenLandingPage();
    }
}
