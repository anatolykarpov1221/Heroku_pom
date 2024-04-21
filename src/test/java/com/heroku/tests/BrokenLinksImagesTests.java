package com.heroku.tests;



import com.heroku.pages.BrokenLinksImagesPage;
import com.heroku.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class BrokenLinksImagesTests extends TestBase{

        @BeforeMethod
        public void precondition(){
            new HomePage(driver).selectBrokenLinksImages();

        }

        @Test
        public void checkBrokenLinksTest(){
            new BrokenLinksImagesPage(driver).checkBrokenLinks();
        }

        @Test
        public void checkBrokenImagesTest(){
            new BrokenLinksImagesPage(driver).checkBrokenImages();
        }

    }


