import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthMailPage extends BaseClass {
    public AuthMailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwordField;

    public AuthMailPage inputLogin(String login) {
        loginField.sendKeys(login);
        return new AuthMailPage(getDriver());
    }

    public AuthMailPage inputPassword(String password) {
        passwordField.sendKeys(password);
        return new AuthMailPage(getDriver());
    }

    public AuthMailPage clickSignInButton() {
        signInButton.click();
        return new AuthMailPage(getDriver());
    }
}
