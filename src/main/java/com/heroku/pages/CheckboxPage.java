package com.heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="input[type='checkbox']:nth-of-type(1)")
    WebElement checkbox1;
    @FindBy(css="input[type='checkbox']:nth-of-type(2)")
    WebElement checkbox2;
    public CheckboxPage selectCheckbox1() {
        click(checkbox1);
        return this;
    }
    public CheckboxPage selectCheckbox2() {
        click(checkbox2);
        click(checkbox2);
        return this;
    }
    public boolean areCheckboxesSelected() {
        boolean checkbox1Selected = checkbox1.isSelected();
        boolean checkbox2Selected = checkbox2.isSelected();
        return checkbox1Selected && checkbox2Selected;
    }

}



