package stepDefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.NewUserTask;
import userInterfaces.HomePageUI;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actions.Hit.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class DemoblazeStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("Client");
    private HomePageUI homePageUI = new HomePageUI();

    @Dado("^Que un cliente no existente accede a la web$")
    public void queUnClienteNoExistenteAccedeALaWeb() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(homePageUI));
    }

    @Cuando("^Ingresa a la opcion de registro de usuario completar el formulario de registro de manera correcta$")
    public void ingresaALaOpcionDeRegistroDeUsuarioCompletarElFormularioDeRegistroDeManeraCorrecta(List<String> data) {
        actor.wasAbleTo(
                NewUserTask.createNewUser(data)
        );
    }

    @Entonces("^Se crea la cuenta correctamente$")
    public void seCreaLaCuentaCorrectamente() {
//        actor.should(seeThat(the(), isPresent()));
    }
}
