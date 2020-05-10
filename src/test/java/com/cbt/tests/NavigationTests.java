package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;

import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void testCase(String browserType) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(3000);
        String titleGoogle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        Thread.sleep(3000);
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(3000);
        String titleGoogle1 = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,titleGoogle1);
        driver.navigate().forward();
        Thread.sleep(3000);
        String titleEtsy1 = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy, titleEtsy1);
        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {

       testCase("chrome");
       testCase("firefox");
       testCase("edge");


    }
}
