package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;
import commons.BasePage;

public class UserLoginPageObject extends BasePage {
	WebDriver driver;

	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserLoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, pageUIs.user.LoginPageUI.LOGIN_LINK);
		clickToElement(driver, pageUIs.user.LoginPageUI.LOGIN_LINK);
		return new UserLoginPageObject(driver);
	}

	public String getIncorrectMessage() {
		waitForElementVisible(driver, pageUIs.user.LoginPageUI.INCORRECT_MESSAGE);
		return getElementText(driver, pageUIs.user.LoginPageUI.INCORRECT_MESSAGE);
	}

	public String getErrorMessage() {
		waitForElementVisible(driver, pageUIs.user.LoginPageUI.ERROR_MESSAGE);
		return getElementText(driver, pageUIs.user.LoginPageUI.ERROR_MESSAGE);
	}

	public void inputToEmailTextbox(String emailAdreess) {
		waitForElementVisible(driver, pageUIs.user.LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.LoginPageUI.EMAIL_TEXTBOX, emailAdreess);

	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(driver, pageUIs.user.LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, pageUIs.user.LoginPageUI.LOGIN_BUTTON);
		return new UserHomePageObject(driver);

	}

	public void inputToPasswordTextbox(String passWord) {
		waitForElementVisible(driver, pageUIs.user.LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, pageUIs.user.LoginPageUI.PASSWORD_TEXTBOX, passWord);

	}

	public UserHomePageObject loginAsUser(String emailAdreess, String passWord) {
		inputToEmailTextbox(emailAdreess);
		inputToPasswordTextbox(passWord);
		return clickToLoginButton();

	}

	public boolean isConfirmEmailAddressTextboxUndisplayed() {
		waitForElementInUndisplayed(driver, getErrorMessage());
		return false;
	}

}
