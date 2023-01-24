package bankGuru.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import pageObjects.user.nopCommerce.UserHomePageObject;


public class HomePageSteps {
    WebDriver driver;
    UserHomePageObject homePage;

    public HomePageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getPageGeneratorManager().getUserHomePage(driver);
    }

    @Given("Open Register Page")
    public void clickToRegister() {
        homePage.clickToRegister();
    }

    @Then("^Home page displayed$")
    public void homePageDisplayed() {
        Assert.assertEquals(homePage.getSuccessLogin(), "My account");
    }


}
