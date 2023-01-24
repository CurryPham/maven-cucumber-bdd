package bankGuru.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {

    WebDriver driver;

    public LoginPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }
    @Given("^Open Register Page$")
    public void openRegisterPage() {

    }

    @When("^Submit valid infor to login form$")
    public void submitValidInforToLoginForm() {


    }
}
