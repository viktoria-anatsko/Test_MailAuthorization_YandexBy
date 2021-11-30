import org.junit.Assert;
import org.properties.ConfProperties;
import org.testng.annotations.Test;

public class AuthMailTest extends BaseTest {

    @Test
    public void loginTest() {
        authMailPage.inputLogin(ConfProperties.getProperty("login"))
                .clickSignInButton()
                .inputPassword(ConfProperties.getProperty("password"))
                .clickSignInButton();

        String user = profilePage.getUserName();

        Assert.assertEquals(ConfProperties.getProperty("login"), user);
    }
}
