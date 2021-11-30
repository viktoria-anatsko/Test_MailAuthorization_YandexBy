import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseClass {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this);
    }
}
