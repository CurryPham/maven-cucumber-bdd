package bankGuru.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {
    WebDriver driver;


    public RegisterPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @When("^Input to Email textbox$")
    public void inputToEmailTextbox() {


    }

    @When("^Click to Submit$")
    public void clickToSubmit() {


    }

    @Then("^Get User and password infor$")
    public void getUserAndPasswordInfor() {


    }

    @When("^Submit valid infor to login form$")
    public void submitValidInforToLoginForm() {


    }
}
