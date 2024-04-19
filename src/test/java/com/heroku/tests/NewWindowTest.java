package com.heroku.tests;

import com.heroku.pages.HomePage;
import com.heroku.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectMultipleWindows();
    }
    @Test
    public void newWindowTest(){
        new MultipleWindowsPage(driver).switchToNextWindow(1)
                .verifyNewWindowMessage("New Window");
    }

}
