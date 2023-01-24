package bankGuru.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver;

    public HomePageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Then("^Home page displayed$")
    public void homePageDisplayed() {


    }
}
