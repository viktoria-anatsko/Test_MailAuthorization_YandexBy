import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.properties.ConfProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private WebDriver driver;
    public static AuthMailPage authMailPage;
    public static ProfilePage profilePage;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        authMailPage = new AuthMailPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterMethod
    protected void afterMethod() {
        profilePage.accountMenu();
        driver.quit();
    }
}
