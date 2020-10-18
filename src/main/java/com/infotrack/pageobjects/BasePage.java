package com.infotrack.pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

        protected WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }

        public void goToUrl(String url) {
            driver.get(url);
        }

        public String getCurrentPageUrl() {
            String currentUrl = driver.getCurrentUrl();
            return currentUrl;
        }
}
