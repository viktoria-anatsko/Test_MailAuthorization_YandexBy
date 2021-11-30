import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BaseClass{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class = 'personal-info-login']")
    private WebElement accountName;

    public String getUserName() {
        String userName = accountName.getText();
        return userName;
    }

    public void accountMenu() {
        accountName.click();
    }
}
