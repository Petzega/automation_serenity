package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewUserTask implements Task {

    private List<String> data;
    public NewUserTask(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("//a[@id='signin2']"),
                Enter.theValue(data.get(0)).into("//input[@id='sign-username']"),
                Enter.theValue(data.get(1)).into("//input[@id='sign-password']"),
                Click.on("//button[contains(text(), 'Sign up')]/following-sibling::button[contains(text(), 'Close')]")
        );
    }

    public static NewUserTask createNewUser(List<String> data) {

        return instrumented(NewUserTask.class, data);
    }
}
