package com.heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[.='Click for JS Alert']")
    WebElement alertOkButton;



    public AlertsPage alertWithOk() {
        click(alertOkButton);
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;

    }
}
