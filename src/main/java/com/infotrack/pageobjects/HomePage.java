package com.infotrack.pageobjects;

import com.infotrack.util.ConfigurationLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    static Properties properties = ConfigurationLoader.loadProperties();

    public void enterUserName(String username) {
        WebElement emailOrPhoneField = locateEmailOrPhoneField();
        if (emailOrPhoneField != null) {
            emailOrPhoneField.sendKeys(username);
        }
    }

    public void clickEmailOrPhoneField() {
        WebElement emailOrPhoneField = locateEmailOrPhoneField();
        if (emailOrPhoneField != null) {
            emailOrPhoneField.click();
        }
    }

    public WebElement locateEmailOrPhoneField() {
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        for (WebElement inputElement : inputElements) {
            String typeAttribute = inputElement.getAttribute("type");
            if ("email".equals(typeAttribute)) {
                return inputElement;
            }
        }
        return null;
    }

    public void clickOnNextButton() {
        List<WebElement> buttonElements = driver.findElements(By.tagName("button"));
        for (WebElement buttonElement : buttonElements) {
            String jsControllerAttr = buttonElement.getAttribute("jscontroller");
            String jsNameAttr = buttonElement.getAttribute("jsname");
            if ("soHxf".equals(jsControllerAttr) && "LgbsSe".equals(jsNameAttr)) {
                buttonElement.click();
                break;
            }
        }
    }

    public void enterPasswordAndSubmit() {
        String password = properties.getProperty("google.password");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password]")));
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys(Keys.ENTER);

    }

    public String getErrorMsg() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("o6cuMc")));
        WebElement errorMessageDiv = driver.findElement(By.className("o6cuMc"));
        return errorMessageDiv.getText();
    }

    public String getLoginSuccessMsg() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("x7WrMb")));
        WebElement welcomeMsgDiv = driver.findElement(By.className("x7WrMb"));
        return welcomeMsgDiv.getText();

    }


}
