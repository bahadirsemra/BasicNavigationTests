package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {



    public  static void verifyTitleURL (String url) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        String title =StringUtility.titleWithoutSpace(driver.getTitle());
             if (currentUrl.contains(title.toLowerCase())){
                 System.out.println("PASS!  ::: "+ url + "contains " + title);
             } else{
                 System.out.println("FAIL!  ::: "+ url + "does NOT contains " + title);
             }
             driver.quit();

    }




    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/",
                "https://walmart.com" ,
                "https://www.westelm.com/");

        for (int i = 0; i <urls.size() ; i++) {
            verifyTitleURL(urls.get(i));
        }


    }

}
