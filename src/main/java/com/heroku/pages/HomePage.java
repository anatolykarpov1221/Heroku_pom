package com.heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement jsalerts;

    public HomePage selectJavaScriptAlertsMenu() {
        click(jsalerts);
        return new HomePage(driver);
    }
    @FindBy(css="a[href='/windows']")
    WebElement MultipleWindowsButton;

    public HomePage selectMultipleWindows() {
        click(MultipleWindowsButton);
        return this;
    }
    @FindBy(css="a[href='/checkboxes']")
    WebElement CheckBoxes;
    public HomePage openCheckBoxesPage() {
        click(CheckBoxes);
        return this;
    }
}
