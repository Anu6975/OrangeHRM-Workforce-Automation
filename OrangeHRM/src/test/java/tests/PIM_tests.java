
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login_Page;
import pages.PIM_Page;

public class PIM_tests extends BaseTest {

    @Test
    public void addEmployeeTest() {

        Login_Page login = new Login_Page(driver);
        PIM_Page pim = new PIM_Page(driver);

        // Step 1: Login
        login.login(username, password);

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/dashboard"),
            "Login failed"
        );

        // Step 2: Open PIM
        pim.openPIM();

        // Step 3: Open Add Employee
        pim.openAddEmployee();

        // Step 4: Enter unique employee details
        String first = "Test" + System.currentTimeMillis();
        String last = "Employee";

        pim.enterEmployeeDetails(first, "", last);

        // Step 5: Save employee
        pim.saveEmployee();

        // Step 6: Verify profile page opened
        WebElement profileName = driver.findElement(
            By.xpath("//h6[contains(@class,'orangehrm-main-title')]")
        );

        Assert.assertTrue(
            profileName.isDisplayed(),
            "Employee profile did not open after saving"
        );

        System.out.println("Employee added successfully!");
    }
}
