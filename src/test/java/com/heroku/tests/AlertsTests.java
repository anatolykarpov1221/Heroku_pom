package com.heroku.tests;

import com.heroku.pages.AlertsPage;
import com.heroku.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
      @BeforeMethod
    public void precondition(){
          new HomePage(driver).selectJavaScriptAlertsMenu();
      }
      @Test
    public void alertWithOkTest(){
          new AlertsPage(driver).alertWithOk();
      }
      @Test
    public void alertWithSelectTest(){
          new AlertsPage(driver).selectConfirm("Cancel").verifyResult("Cancel");
      }
      @Test
    public void alertWithPromptTest(){
          new AlertsPage(driver).alertWithPrompt("Hello Trump").verifyMessage("Hello Trump");

      }

}
