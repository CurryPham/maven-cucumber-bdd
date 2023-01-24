package bankGuru.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserHomePageObject;
import pageObjects.user.nopCommerce.UserLoginPageObject;

public class LoginPageSteps {

    WebDriver driver;
    String loginPageUrl;
    UserLoginPageObject loginPage;

    public LoginPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getPageGeneratorManager().getUserLoginPage(driver);

    }
    @Given("^Get Login Page Url$")
    public void getLoginPageUrl() {
        loginPageUrl = loginPage.getPageUrl(driver);
    }

    @Given("^Open Login Page$")
    public void openLoginPage() {
        loginPage.clickToLoginLink();
    }

    @When("^Submit valid infor to login form$")
    public void submitValidInforToLoginForm() {
        loginPage.inputToEmailTextbox(RegisterPageSteps.email);
        loginPage.inputToPasswordTextbox(RegisterPageSteps.password);
        loginPage.clickToLoginButton();
    }
}
