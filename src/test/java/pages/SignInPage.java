package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private final By emailInputLocator = By.cssSelector("");
    private final By passwordInputLocator = By.cssSelector("");
    private final By showPasswordButtonLocator = By.cssSelector("");
    private final By hidePasswordButtonLocator = By.cssSelector("");
    private final By forgotYourPasswordLinkLocator = By.cssSelector("");
    private final By signInButtonLocator = By.cssSelector("");
    private final By noAccountCreateOneLinkLocator = By.cssSelector("");

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
    public SelenideElement getForgotYourPasswordLink() {
        return $(forgotYourPasswordLinkLocator);
    }
    public SelenideElement getSignInButton() {
        return $(signInButtonLocator);
    }
    public SelenideElement getNoAccountCreateOneLink() {
        return $(noAccountCreateOneLinkLocator);
    }
}
