package co.com.certification.banistmo.stepdefinitions;

import co.com.certification.banistmo.questions.ValidateDocument;
import co.com.certification.banistmo.taks.OpenDocument;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.*;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.certification.banistmo.utils.Constans.URL;

public class DocumentTestStepDefinition {
    @Managed
    (driver = "chrome")
    protected WebDriver browser;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
        OnStage.theActorCalled("Actor");
    }

    @Given("The user enters the page")
    public void theUserEntersThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @When("Navigate the page until you reach suppliers")
    public void navigateThePageUntilYouReachSuppliers() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenDocument.openDocument());
    }

    @Then("Validate that the pop-up screen is correct")
    public void validateThatThePopUpScreenIsCorrect() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateDocument.validateDocument(),Matchers.is(true)));
    }
}
