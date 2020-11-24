package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.choucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login OnThePage(String strUser, String strPassword){
        return Tasks.instrumented (Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (choucairLoginPage.BTN_ENTER_START),
                Enter.theValue(strUser).into(choucairLoginPage.INPUT_USER),
                Enter.theValue (strPassword).into (choucairLoginPage.INPUT_PASSWORD),
                Click.on (choucairLoginPage.BTN_ENTER_LOGIN));
    }
}
