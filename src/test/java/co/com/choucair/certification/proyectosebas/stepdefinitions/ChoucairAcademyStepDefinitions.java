package co.com.choucair.certification.proyectosebas.stepdefinitions;

import co.com.choucair.certification.proyectosebas.model.AcademyChoucairData;
import co.com.choucair.certification.proyectosebas.questions.Answer;
import co.com.choucair.certification.proyectosebas.tasks.Login;
import co.com.choucair.certification.proyectosebas.tasks.OpenUp;
import co.com.choucair.certification.proyectosebas.tasks.Search;
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
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than omar wants to learn automation at the academy Choucair$")
    public void thanOmarWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
            OnStage.theActorCalled("Omar").wasAbleTo(OpenUp.thePage(), (Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(academyChoucairData.get(0).getStrCourse())));
    }

}
