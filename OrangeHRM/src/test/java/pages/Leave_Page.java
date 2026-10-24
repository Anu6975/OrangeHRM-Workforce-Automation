
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leave_Page {

    WebDriver driver;

    public Leave_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Leave module
    By leaveMenu = By.xpath("//span[text()='Leave']");

    // Apply Leave page
    By applyLeaveMenu =
            By.xpath("//a[contains(@href,'leave/applyLeave')]");

    // Leave form
    By leaveType = By.xpath(
            "//label[text()='Leave Type']/../following-sibling::div"
    );

    By fromDate = By.xpath(
            "//label[text()='From Date']/../following-sibling::div//input"
    );

    By toDate = By.xpath(
            "//label[text()='To Date']/../following-sibling::div//input"
    );

    By comment = By.xpath(
            "//label[text()='Comments']/../following-sibling::div//textarea"
    );

    By submitButton =
            By.xpath("//button[@type='submit']");

    // Page title
    By pageTitle =
            By.xpath("//h6[contains(@class,'orangehrm-main-title')]");

    public void openLeave() {
        driver.findElement(leaveMenu).click();
    }

    public void openApplyLeave() {
        driver.findElement(applyLeaveMenu).click();
    }

    public void selectLeaveType(String type) {
        driver.findElement(leaveType).click();

        driver.findElement(
            By.xpath("//div[@role='option']//span[text()='" + type + "']")
        ).click();
    }

    public void enterFromDate(String date) {
        driver.findElement(fromDate).clear();
        driver.findElement(fromDate).sendKeys(date);
    }

    public void enterToDate(String date) {
        driver.findElement(toDate).clear();
        driver.findElement(toDate).sendKeys(date);
    }

    public void enterComment(String text) {
        driver.findElement(comment).sendKeys(text);
    }

    public void submitLeave() {
        driver.findElement(submitButton).click();
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }
}
