package com.heroku.tests;

import com.heroku.pages.DropdownPage;
import com.heroku.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).dropdown();
    }
        @Test
        public void selectOptionTest() {
            new DropdownPage(driver).selectOptionByVisibleText("Option 1");

    }






}
