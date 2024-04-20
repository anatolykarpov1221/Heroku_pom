package com.heroku.tests;
import com.heroku.pages.UploadFilePage;
import com.heroku.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFileTests extends TestBase{
    @BeforeMethod
    public void precondition() {
       new HomePage(driver).Upload();
    }
    @Test
    public void uploadFileTest() {
        String filePath = "/Users/anatolykarpovMAC15/tools/1.jpg";
        // Замените на путь к вашему файлу
       new UploadFilePage(driver).uploadFile(filePath);    }


}
