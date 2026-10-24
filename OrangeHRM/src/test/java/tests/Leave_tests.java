
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login_Page;
import pages.Leave_Page;

public class Leave_tests extends BaseTest {

    @Test
    public void openApplyLeavePageTest() {

        // Step 1: Login
        Login_Page login = new Login_Page(driver);
        login.login(username, password);

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/dashboard"),
            "Login failed"
        );

        // Step 2: Open Leave module
        Leave_Page leave = new Leave_Page(driver);
        leave.openLeave();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/leave/"),
            "Leave module did not open"
        );

        // Step 3: Open Apply Leave
        leave.openApplyLeave();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/leave/applyLeave"),
            "Apply Leave page did not open"
        );

        System.out.println("Apply Leave page opened successfully!");
    }
}
