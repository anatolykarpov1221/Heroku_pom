package com.heroku.tests;

import org.testng.annotations.BeforeMethod;
import com.heroku.pages.DroppablePage;
import com.heroku.pages.HomePage;

import org.testng.annotations.Test;

public class DroppableTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDragAndDrop();

    }

    @Test
    public void actionDragMeTest() {
        //new DroppablePage(driver).hideIframes();
        new DroppablePage(driver).actionDragAch();
    }

    @Test
    public void actionDragMeByTest() {
        new DroppablePage(driver).actionDragAchBy();
    }

}

