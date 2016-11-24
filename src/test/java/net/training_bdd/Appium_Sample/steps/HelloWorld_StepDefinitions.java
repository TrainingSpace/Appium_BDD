package net.training_bdd.Appium_Sample.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.training_bdd.Appium_Sample.pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;

import static net.training_bdd.Appium_Sample.CommonMethods.StartWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Fernanda on 11/23/2016.
 */
public class HelloWorld_StepDefinitions {

    WebDriver driver;
    GoogleHomePage googleHomePage;

    @Given("^the user navigates to Google home page$")
    public void theUserIsOnTheGoogleHomePage() throws Throwable {

        driver = StartWebDriver();
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.LoadPage();

    }

    @When("^the user performs a search for Cucumber BDD$")
    public void theUserPerformsASearchByKeyword() {

        googleHomePage.PerformSearch("Cucumber BDD");

    }

    @Then("^they should see that the search was performed$")
    public void theyShouldSeeThatTheSearchWasPerformed() {

        assertThat(driver.getTitle().contains("Google Search"));
        driver.quit();

    }
}
