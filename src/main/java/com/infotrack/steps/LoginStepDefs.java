package com.infotrack.steps;

import com.infotrack.factory.WebDriverProviderFactory;
import com.infotrack.pageobjects.HomePage;
import com.infotrack.util.ConfigurationLoader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepDefs {

    public static Properties properties;
    private static HomePage homePage;

    @Before
    public void setUp() {
        properties = ConfigurationLoader.loadProperties();
        WebDriver webDriver = WebDriverProviderFactory.getBrowser();
        homePage = new HomePage(webDriver);
    }

    @After
    public void after() {
        WebDriverProviderFactory.quitDriver();
    }

    @Given("^Navigate to google account login screen$")
    public void navigateToGoogleAccountLoginScreen() {
        String homePageUrl = properties.getProperty("google.home.page.url");
        homePage.goToUrl(homePageUrl);
    }


    @When("^User logged in using valid username and password$")
    public void userLoggedInUsingValidUsernameAndPassword() {
        //get username and password from properties file
        String username = properties.getProperty("google.username");
        homePage.enterUserName(username);
        homePage.clickOnNextButton();
        homePage.enterPasswordAndSubmit();
    }

    @Then("^User should be navigated to home page$")
    public void userShouldBeNavigatedToHomePage() {
        String loginSuccessMsg = homePage.getLoginSuccessMsg();
        String expectedSuccessMsg = properties.getProperty("google.login.success.msg");
        Assert.assertEquals("Success msg doesn't match", expectedSuccessMsg, loginSuccessMsg);
    }


    @Given("^User is on the google account login screen$")
    public void userIsOnTheGoogleAccountLoginScreen() {
        String homePageUrl = properties.getProperty("google.home.page.url");
        homePage.goToUrl(homePageUrl);
    }

    @When("^User enter invalid username$")
    public void userEnterInvalidUsername() {
        String username = properties.getProperty("google.InvalidUsername");
        homePage.enterUserName(username);
        homePage.clickOnNextButton();
    }

    @Then("^user should get an error message and should not be allowed to proceed further$")
    public void userShouldGetAnErrorMessageAndShouldNotBeAllowedToProceedFurther() {
        String errorMsg = homePage.getErrorMsg();
        Assert.assertEquals("error message should be", "Couldn't find your Google Account", errorMsg);
    }


    @Given("^User try to login with empty data$")
    public void userTryToLoginWithEmptyData() {
        String homePageUrl = properties.getProperty("google.home.page.url");
        homePage.goToUrl(homePageUrl);
    }

    @When("^User do not enter any data in the 'email or phone' field$")
    public void userDoNotEnterAnyDataInTheEmailOrPhoneField() {
        homePage.clickEmailOrPhoneField();
    }

    @And("^User click on next button$")
    public void userClickOnNextButton() {
        homePage.clickOnNextButton();
    }

    @Then("^user should get an error message also should not be allowed to proceed further$")
    public void userShouldGetAnErrorMessageAlsoShouldNotBeAllowedToProceedFurther() {
        String errorMsg = homePage.getErrorMsg();
        Assert.assertEquals("error message should be", "Enter an email or phone number", errorMsg);
    }


}