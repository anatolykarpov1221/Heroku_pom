package com.heroku.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadFilePage extends BasePage{

    public UploadFilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement ChooseFile;
    @FindBy(id="file-submit")
    WebElement Upload;

    public UploadFilePage uploadFile(String filePath) {
       // click(ChooseFile);
        // Нажатие на элемент
        //driver.findElement(By.id("file-upload")).click();

// Явное ожидание появления другого элемента после выбора файла
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-submit")));


        ChooseFile.sendKeys(filePath);
        click(Upload);


    return this;
    }
}
