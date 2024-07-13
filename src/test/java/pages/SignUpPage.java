package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SignUpPage {

    private final By socialTitleInputLocator = By.cssSelector("");
    private final By firstNameInputLocator = By.cssSelector("#field-firstname");
    private final By lastNameInputLocator = By.cssSelector("#field-lastname");
    private final By emailInputLocator = By.cssSelector("#field-email");
    private final By passwordInputLocator = By.cssSelector("#field-password");
    private final By showPasswordButtonLocator = By.cssSelector("");
    private final By hidePasswordButtonLocator = By.cssSelector("");
    private final By birthdateInputLocator = By.cssSelector("#field-birthday");
    private final By receiveOffersCheckboxLocator = By.cssSelector("");
    private final By agreeToTheTermsCheckboxLocator = By.cssSelector("");
    private final By signUpForNewsletterCheckboxLocator = By.cssSelector("");
    private final By customerDataPrivacyCheckboxLocator = By.cssSelector("");
    private final By saveButtonLocator = By.cssSelector("");

    public ElementsCollection getSocialTitleInput() {
        return $$(socialTitleInputLocator);
    }
    public SelenideElement getFirstNameInput() {
        return $(firstNameInputLocator);
    }
    public SelenideElement getLastNameInput() {
        return $(lastNameInputLocator);
    }
    public SelenideElement getEmailInput() {
        return $(emailInputLocator);
    }
    public SelenideElement getPasswordInput() {
        return $(passwordInputLocator);
    }
    public SelenideElement getShowPasswordButton() {
        return $(showPasswordButtonLocator);
    }
    public SelenideElement getHidePasswordButton() {
        return $(hidePasswordButtonLocator);
    }
    public SelenideElement getBirthdateInput() {
        return $(birthdateInputLocator);
    }
    public SelenideElement getReceiveOffersCheckbox() {
        return $(receiveOffersCheckboxLocator);
    }
    public SelenideElement getAgreeToTheTermsCheckbox() {
        return $(agreeToTheTermsCheckboxLocator);
    }
    public SelenideElement getSignUpForNewsletterCheckbox() {
        return $(signUpForNewsletterCheckboxLocator);
    }
    public SelenideElement getCustomerDataPrivacyCheckbox() {
        return $(customerDataPrivacyCheckboxLocator);
    }
    public SelenideElement getSaveButton() {
        return $(saveButtonLocator);
    }



}
