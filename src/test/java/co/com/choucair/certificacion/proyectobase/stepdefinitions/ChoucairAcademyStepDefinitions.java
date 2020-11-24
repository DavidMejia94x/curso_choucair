package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.choucairAcademyData;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage (new OnlineCast ());
    }
    @Given("^than david wants to learn automation at the academy Choucar$")
    public void thanDavidWantsToLearnAutomationAtTheAcademyChoucar(List<choucairAcademyData> choucarAcademyData) throws Exception {
        OnStage.theActorCalled("David").wasAbleTo(OpenUp.thePage(),
                Login.OnThePage(choucarAcademyData.get(0).getStrUser(),choucarAcademyData.get(0).getStrPassword()));
    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<choucairAcademyData> choucarAcademyData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(choucarAcademyData.get(0).getCourse()));
    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<choucairAcademyData> choucarAcademyData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat (Answer.toThe(choucarAcademyData.get(0).getCourse())));
    }
}
