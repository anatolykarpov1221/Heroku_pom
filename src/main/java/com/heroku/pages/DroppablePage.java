package com.heroku.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage{

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement dragAch;

    @FindBy(id = "column-b")
    WebElement dropBch;

    public DroppablePage actionDragAch() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragAch, dropBch).perform();
        String text = dropBch.getText();
        if (text.equals("A")) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }
        return this;
    }

    public DroppablePage actionDragAchBy() {
        Actions actions = new Actions(driver);
        pause(1500);

        int xOffset1 = dragAch.getLocation().getX();
        int yOffset1 = dragAch.getLocation().getY();
        System.out.println("xOffset1 --> " + xOffset1 + " yOffset1 " + yOffset1);

        int xOffset = dragAch.getLocation().getX();
        int yOffset = dragAch.getLocation().getY();
        System.out.println("xOffset --> " + xOffset + " yOffset " + yOffset);

        xOffset = (xOffset - xOffset1) +0;
        yOffset = (yOffset - yOffset1) + 0;
        actions.dragAndDropBy(dragAch, xOffset, yOffset).perform();

        String text = dropBch.getText();
        if (text.equals("A")) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }

        return this;
    }
}

