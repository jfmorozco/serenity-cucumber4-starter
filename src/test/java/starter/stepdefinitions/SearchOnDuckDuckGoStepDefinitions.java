package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.titles.TitlesOverview;
import starter.titles.TitlesData;
import starter.empleos.AccessEmpleos;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the home page")
    public void is_on_the_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("he access {string}")
    public void he_access(String term) {

        withCurrentActor(
                AccessEmpleos.withoutCredentials()
        );
    }

    @Then("all the titles should be correct")
    public void all_the_titles_should_be_correct() {
        theActorInTheSpotlight().should(
                seeThat("The first displayed title is", TitlesData.firstTitle(), equalTo("SER CHOUCAIR")),
                seeThat("The second title is", TitlesData.secondTitle(), equalTo("CONVOCATORIAS")),
                seeThat("The last titles is", TitlesData.thirdTitle(), equalTo("PREPARARSE PARA APLICAR"))
        );
    }
}
