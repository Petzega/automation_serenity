package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePageUI extends PageObject {
    public static final Target BUTTON_SIGN_IN = Target.the("Input para ingresar nuevo usuario")
            .located(By.xpath("//a[@id='signin2']"));
    public static final Target INPUT_SIGN_USERNAME = Target.the("Input para ingresar nuevo usuario")
            .located(By.xpath("//input[@id='sign-username']"));
    public static final Target INPUT_SIGN_PASSWORD = Target.the("Input para ingresar nueva contraseña")
            .located(By.xpath("//input[@id='sign-password']"));
    public static final Target BUTTON_CLOSE_FORM = Target.the("Boton para cerar el formulario")
            .located(By.xpath("//div[@id='signInModal']/descendant::button[@class='btn btn-secondary']"));
    public static final Target BUTTON_ACCEPT_FORM = Target.the("Boton para acpetar el formulario")
            .located(By.xpath("//div[@id='signInModal']/descendant::button[@class='btn btn-primary']"));
}
