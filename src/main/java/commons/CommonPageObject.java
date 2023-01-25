package commons;

import org.openqa.selenium.WebDriver;
import pageUls.nopCommerce.user.BasePageUI;
import pageUls.nopCommerce.user.RegisterPageUI;

public class CommonPageObject extends BasePage {
    private WebDriver driver;

    public CommonPageObject(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * Click to dynamic Textbox by ID
     *
     * @param driver
     * @param textboxID
     * @param value
     */
    public void inputToTextboxByID(WebDriver driver, String textboxID, String value) {
        waitForElementVisible(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
        sendkeyToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, value, textboxID);
    }

    /**
     * Click to dynamic Button by text
     *
     * @param driver
     * @param buttonText
     */
    public void clickToButtonByText(WebDriver driver, String buttonText) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_TEXT, buttonText);
        clickToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_TEXT, buttonText);
    }

    /**
     * Select item in dropdown by Name attribute
     *
     * @param driver
     * @param dropdownAttributeName
     * @param itemValue
     */
    public void selectedDropdownByName(WebDriver driver, String dropdownAttributeName, String itemValue) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownAttributeName);
        selectItemInDefaultDropdown(driver, BasePageUI.DYNAMIC_DROPDOWN_BY_NAME, itemValue, dropdownAttributeName);
    }

    public String getDropdownByName(WebDriver driver, String dropdownAttributeName) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownAttributeName);
        return getElementAttribute(driver, BasePageUI.DYNAMIC_DROPDOWN_BY_NAME, "value", dropdownAttributeName);
    }

    /**
     * Click to dynamic radio button by label name
     *
     * @param driver
     * @param radioLabelName
     */
    public void clickToRadioButtonByLabel(WebDriver driver, String radioLabelName) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_RADIO_BUTTON_BY_LABEL, radioLabelName);
        checkToDefaultCheckboxOrRadio(driver, BasePageUI.DYNAMIC_RADIO_BUTTON_BY_LABEL, radioLabelName);
    }

    /**
     * Click to dynamic checkbox by label name
     *
     * @param driver
     * @param checkboxLabelName
     */
    public void clickToCheckboxByLabel(WebDriver driver, String checkboxLabelName) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
        checkToDefaultCheckboxOrRadio(driver, BasePageUI.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
    }

    /**
     * Get value in textbox by textboxID
     *
     * @param driver
     * @param textboxID
     * @return
     */
    public String getTexboxValueByID(WebDriver driver, String textboxID) {
        waitForElementVisible(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
        return getElementAttribute(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, "value", textboxID);
    }

    public void clickToDynamicLink(WebDriver driver) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_LINK);
        clickToElement(driver, BasePageUI.DYNAMIC_LINK);
    }

    public void clickToDynamicNavBar(WebDriver driver) {
        waitForElementClickable(driver, BasePageUI.DYNAMIC_MESSAGE_SUCCESS_LINK);
        clickToElement(driver, BasePageUI.DYNAMIC_MESSAGE_SUCCESS_LINK);
    }

    public String getElemenetTextSuccess(WebDriver driver) {
        waitForElementVisible(driver, BasePageUI.MESSAGE_SUCCESS);
        return getElementText(driver, BasePageUI.MESSAGE_SUCCESS);
    }

}
