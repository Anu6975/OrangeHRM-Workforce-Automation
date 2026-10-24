package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("button[type='submit']");
    By errorMessage = By.cssSelector(".oxd-alert-content-text");

    // Enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    // Click Login
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Complete login
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    // Get login error message
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
