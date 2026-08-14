package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

    @Test
    void shouldLoginSuccessfully() {
        WebDriver driver = DriverFactory.createDriver();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        driver.quit();
    }
}