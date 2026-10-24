
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login_Page;

public class Login_tests extends BaseTest {

    @Test
    public void validLoginTest() {

        Login_Page loginPage = new Login_Page(driver);

        loginPage.login(username, password);

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/dashboard"),
            "Login failed: Dashboard was not opened"
        );

        System.out.println("OrangeHRM login successful!");
    }
}
