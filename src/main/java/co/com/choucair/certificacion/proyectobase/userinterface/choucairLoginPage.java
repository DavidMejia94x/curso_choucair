package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class choucairLoginPage extends PageObject {
    public static final Target BTN_ENTER_START =
            Target.the("BUTTON THAT SHOWS US THE FORM TO LOGIN").located(By.xpath ("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER =
            Target.the("WHERE DO WE WRITE THE USER").located(By.id("username"));
    public static final Target INPUT_PASSWORD =
            Target.the("WHERE DO WE WRITE THE PASSWORD").located(By.id("password"));
    public static final Target BTN_ENTER_LOGIN =
            Target.the("BUTTON TO CONFIRM LOGIN").located(By.xpath("//button[contains(text(),'Acceder')]"));
}
