
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM_Page {

    WebDriver driver;

    public PIM_Page(WebDriver driver) {
        this.driver = driver;
    }

    // PIM navigation
    By pimMenu = By.xpath("//span[text()='PIM']");

    // Add Employee page
    By addEmployeeButton =
            By.xpath("//a[contains(@href,'pim/addEmployee')]");

    By firstName = By.name("firstName");
    By middleName = By.name("middleName");
    By lastName = By.name("lastName");

    By employeeId =
            By.xpath("//label[text()='Employee Id']/../following-sibling::div//input");

    By saveButton =
            By.xpath("//button[@type='submit']");

    // Employee list and search
    By employeeList =
            By.xpath("//a[contains(@href,'pim/viewEmployeeList')]");

    By searchEmployeeId =
            By.xpath("//label[text()='Employee Id']/../following-sibling::div//input");

    By searchButton =
            By.xpath("//button[@type='submit']");

    By employeeRecords =
            By.xpath("//div[@role='row']");

    // Navigate to PIM
    public void openPIM() {
        driver.findElement(pimMenu).click();
    }

    // Open Add Employee page
    public void openAddEmployee() {
        driver.findElement(addEmployeeButton).click();
    }

    // Enter employee details
    public void enterEmployeeDetails(
            String first,
            String middle,
            String last) {

        driver.findElement(firstName).sendKeys(first);
        driver.findElement(middleName).sendKeys(middle);
        driver.findElement(lastName).sendKeys(last);
    }

    // Save employee
    public void saveEmployee() {
        driver.findElement(saveButton).click();
    }

    // Open Employee List
    public void openEmployeeList() {
        driver.findElement(employeeList).click();
    }

    // Search employee using ID
    public void searchByEmployeeId(String id) {
        driver.findElement(searchEmployeeId).clear();
        driver.findElement(searchEmployeeId).sendKeys(id);
        driver.findElement(searchButton).click();
    }

    // Return employee table rows
    public int getEmployeeRowCount() {
        return driver.findElements(employeeRecords).size();
    }
}
