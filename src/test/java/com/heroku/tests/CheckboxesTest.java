package com.heroku.tests;

import com.heroku.pages.CheckboxPage;
import com.heroku.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openCheckBoxesPage();
    }
    @Test    public void testCheckboxes() throws InterruptedException {
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.selectCheckbox1();
        Thread.sleep(1000);
        // Пауза в 1 секунду чоб увидеть два клика
        checkboxPage.selectCheckbox2();
        // Проверка состояния обоих
        boolean areCheckboxesSelected = checkboxPage.areCheckboxesSelected();
        Assert.assertTrue(areCheckboxesSelected, "Checkboxes are selected as expected.");    }
}
