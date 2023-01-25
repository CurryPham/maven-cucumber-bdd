package nopCommerce.stepDefinitions;

import commons.CommonPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import utilities.DataHelper;

public class CommonPageStep {
    WebDriver driver;
    CommonPageObject commentPage;
    DataHelper dataFaker;
    String email;

    public CommonPageStep() {
        this.driver = Hooks.openAndQuitBrowser();
        commentPage = PageGeneratorManager.getPageGeneratorManager().getCommonPage(driver);
        dataFaker = DataHelper.getDataHelper();
        email = dataFaker.getEmailAddress();
    }

    @Given("^Open \"([^\"]*)\" page$")
    public void openPage(String pageName)  {
       commentPage.clickToDynamicLink(driver);
        
    }
    @Given("^Open \"([^\"]*)\" navbar page$")
    public void openNavBarPage(String pageName)  {
       commentPage.clickToDynamicNavBar(driver);

    }

    @When("^Click to \"([^\"]*)\" radion button$")
    public void clickToRadionButton(String radioLabelName) {
        commentPage.clickToRadioButtonByLabel(driver, radioLabelName);
    }

    @When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
    public void inputToTextboxWithValue(String fieldName, String inputValue)  {
        if (fieldName.equals("Email")){
            inputValue = email;
        }
       commentPage.inputToTextboxByID(driver, fieldName, inputValue);
        
    }

    @When("^Select to \"([^\"]*)\" dropdown list with value \"([^\"]*)\"$")
    public void selectToDropdownListWithValue(String fieldName, String inputValue)  {
       commentPage.selectedDropdownByName(driver, fieldName, inputValue);
        
    }

    @When("^Input to \"([^\"]*)\" checkbox$")
    public void inputToCheckboxWithValue(String checkboxValue)  {
       commentPage.clickToCheckboxByLabel(driver, checkboxValue);
        
    }

    @When("^Click to \"([^\"]*)\" button$")
    public void clickToButton(String buttonValue)  {
       commentPage.clickToButtonByText(driver, buttonValue);
        
    }

    @Then("^Success message displayed with \"([^\"]*)\"$")
    public void successMessageDisplayedWith(String expectedMessage)  {
        Assert.assertEquals(commentPage.getElemenetTextSuccess(driver), expectedMessage);
    }

    @Then("^The valid value displayed at \"([^\"]*)\" with \"([^\"]*)\"$")
    public void theValidValueDisplayedAtWith(String rowName, String expectedValue)  {
        if (rowName.equals("Email")){
            expectedValue = email;
        }
        Assert.assertEquals(commentPage.getTexboxValueByID(driver, rowName), expectedValue);
    }

    @Then("^The valid value by name displayed at \"([^\"]*)\" with \"([^\"]*)\"$")
    public void theValidValueByNameDisplayedAtWith(String rowName, String expectedValue)  {

        Assert.assertEquals(commentPage.getDropdownByName(driver, rowName), expectedValue);
    }

}
