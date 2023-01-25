package nopCommerce.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserLoginPageObject;

public class LoginPageSteps {

    WebDriver driver;
    UserLoginPageObject loginPage;
    TextContext textContext;

    public LoginPageSteps(TextContext textContext) {
        this.driver = Hooks.openAndQuitBrowser();
        this.textContext = textContext;
        loginPage = PageGeneratorManager.getPageGeneratorManager().getUserLoginPage(driver);

    }
    @Given("^Get Login Page Url$")
    public void getLoginPageUrl() {
        textContext.getDataContext().setContext(Context.LOGIN_URL, loginPage.getPageUrl(driver));
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
