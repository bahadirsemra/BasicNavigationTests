package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {






    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                                          "https://wayfair.com/",
                                          "https://walmart.com" ,
                                          "https://www.westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (int i = 0; i <urls.size() ; i++) {
            driver.get(urls.get(i));
            driver.manage().window().maximize();
            Thread.sleep(2000);
            String url = driver.getCurrentUrl();
            String title =StringUtility.titleWithoutSpace(driver.getTitle());
            if (url.contains(title.toLowerCase())){
                System.out.println("PASS!  ::: "+ url + "contains " + title);
            } else{
                System.out.println("FAIL!  ::: "+ url + "does NOT contains " + title);
            }
        }
        driver.quit();
    }

}
