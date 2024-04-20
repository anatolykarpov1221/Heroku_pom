package com.heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement SelectAnOption;

    public DropdownPage selectOptionByVisibleText(String option) {
        Select select=new Select(SelectAnOption);;
        pause(1500);
        select.selectByVisibleText(option);

        List<WebElement> options = select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText() + " is first");
        System.out.println("*********************************************************");

        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }
}



