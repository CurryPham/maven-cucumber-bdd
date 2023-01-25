package nopCommerce.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserRegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
    WebDriver driver;
    static String firstName, lastName, email, password;
    UserRegisterPageObject registerPage;
    DataHelper dataTest;
    TextContext textContext;

    public RegisterPageSteps(TextContext textContext) {
        this.driver = Hooks.openAndQuitBrowser();
        this.textContext = textContext;
        registerPage = PageGeneratorManager.getPageGeneratorManager().getUserRegisterPage(driver);
        dataTest = DataHelper.getDataHelper();
        firstName = dataTest.getFirstName();
        lastName = dataTest.getLastName();
        email = dataTest.getEmailAddress();
        password = dataTest.getPassword();
    }

    @When("^Input to First name textbox$")
    public void inputToFirstnameTextbox() {
        registerPage.inputToFirstnameTextBox(firstName);
    }

    @And("^Input to Last name textbox$")
    public void inputToLastnameTextbox() {
        registerPage.inputToLastnameTextBox(lastName);
    }
    @And("^Input to Email textbox$")
    public void inputToEmailTextbox() {
        registerPage.inputToEmailTextBox(email);
    }
    @And("^Input to Password textbox$")
    public void inputToPasswordTextbox() {
        registerPage.inputToPasswordTextBox(password);
    }
    @And("^Input to Confirm Password textbox$")
    public void inputToConfirmPasswordTextbox() {
        registerPage.inputToConfirmPasswordTextBox(password);
    }

    @And("^Click to Submit$")
    public void clickToSubmit() {
        registerPage.clickToRegisterButton();

    }

    @Then("^Verify Register success$")
    public void getRegisterSuccessMessage() {
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(),"Your registration completed");

    }
}
