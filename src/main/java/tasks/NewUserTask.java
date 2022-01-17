package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePageUI.*;

public class NewUserTask implements Task {

    private List<String> data;
    public NewUserTask(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(BUTTON_SIGN_IN).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(
                    Click.on(BUTTON_SIGN_IN),
                    Enter.theValue(data.get(0)).into(INPUT_SIGN_USERNAME),
                    Enter.theValue(data.get(1)).into(INPUT_SIGN_PASSWORD),
                    Click.on(BUTTON_ACCEPT_FORM)
            );
        }
    }

    public static NewUserTask createNewUser(List<String> data) {
        return instrumented(NewUserTask.class, data);
    }
}
