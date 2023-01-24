package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import io.qameta.allure.Step;

public class UserRegisterPageObject extends BasePage {

	private WebDriver driver;

	public UserRegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Click to Register button")
	public UserHomePageObject clickToRegisterButton() {
		waitForElementClickable(driver, pageUIs.user.RegisterPageUI.REGISTER_LINK);
		clickToElement(driver, pageUIs.user.RegisterPageUI.REGISTER_LINK);
		return PageGeneratorManager.getPageGeneratorManager().getUserHomePage(driver);
	}

	@Step("Enter to First name textbox value is {0}")
	public void inputToFirstnameTextBox(String firstName) {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	@Step("Enter to Last name textbox value is {0}")
	public void inputToLastnameTextBox(String lastName) {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
	}

	@Step("Enter to Email textbox value is {0}")
	public void inputToEmailTextBox(String emailAddress) {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.RegisterPageUI.EMAIL_TEXTBOX, emailAddress);

	}

	@Step("Enter to Passowrd textbox value is {0}")
	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.RegisterPageUI.PASSWORD_TEXTBOX, password);

	}

	public void inputToConfirmPasswordTextBox(String confirmPassword) {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);

	}

	public String getErrorMessageAtFirstnameTextbox() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastnameTextbox() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMessageAtConfirmPasswordTextbox() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	@Step("Verify Register success")
	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(driver, pageUIs.user.RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
