package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.tests.BaseTest;

import LoginPage.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("student", "Password123");
        
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login verification failed!");
    }
}