package com.heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(css="a[href='/windows/new']")
    WebElement OpeningNewWindow;
    public MultipleWindowsPage switchToNextWindow(int index) {
        click(OpeningNewWindow);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));

        return this;
    }
    @FindBy(css="h3")
    WebElement NewWindowHeading;
    public MultipleWindowsPage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(NewWindowHeading,text,7));
        return this;
    }
}
