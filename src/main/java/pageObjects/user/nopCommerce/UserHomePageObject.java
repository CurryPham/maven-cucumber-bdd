package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;

	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Navigate to Register page")
	public UserRegisterPageObject clickToRegister() {
		waitForElementClickable(driver, pageUIs.user.HomePageUI.REGISTER_LINK);
		clickToElement(driver, pageUIs.user.HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getPageGeneratorManager().getUserRegisterPage(driver);
	}

	@Step("Verify Login success")
	public String getSuccessLogin() {
		waitForElementVisible(driver, pageUIs.user.HomePageUI.MY_ACCOUNT_LINK);
		return getElementText(driver, pageUIs.user.HomePageUI.MY_ACCOUNT_LINK);
	}

	@Step("Navigate to Login page")
	public UserLoginPageObject openLoginPage() {
		clickToElement(driver, pageUIs.user.HomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getPageGeneratorManager().getUserLoginPage(driver);
	}

	@Step("Navigate to Customer infor page")
	public UserCustomerInforPageObject clickToCustomerInfor() {
		clickToElement(driver, pageUIs.user.HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getPageGeneratorManager().getUserCustomerInforPage(driver);
	}

}
