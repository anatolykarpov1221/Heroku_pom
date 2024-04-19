package com.heroku.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[.='Click for JS Alert']")
    WebElement alertOkButton;

    public AlertsPage alertWithOk() {
        click(alertOkButton);

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            // Handle the case when no alert is present
        }
      return this;
    }

     @FindBy(xpath = "//button[.='Click for JS Confirm']")
        WebElement confirmButton;


    public AlertsPage selectConfirm(String confirm) {
        click(confirmButton);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }

        return this;
    }
    @FindBy(id = "result")
    WebElement confirmResult;
    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));

        return this;
    }
    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement promptButton;

    public AlertsPage alertWithPrompt(String string) {
        click(promptButton);
        if(string !=null){
            driver.switchTo().alert().sendKeys(string);
            driver.switchTo().alert().accept();
        }

        return this;
    }
    @FindBy(id="result")
    WebElement promptResult;
    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }
}