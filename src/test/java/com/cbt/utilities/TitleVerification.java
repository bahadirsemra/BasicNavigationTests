package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");
        List<String> titles= new ArrayList<>();
        List<String> pagesURL= new ArrayList<>();
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (int i = 0; i <urls.size() ; i++) {
            driver.get(urls.get(i));
            titles.add(driver.getTitle());
            pagesURL.add(driver.getCurrentUrl());
            Thread.sleep(2000);
        }

        driver.quit();
        for (int i = 0; i <titles.size()-1 ; i++) {
            if (!titles.get(i).equals(titles.get(i+1))){
                System.out.println("All titles are NOT equal!");
            }
        }
        System.out.println("All titles are equal!");
        for (int i = 0; i <pagesURL.size() ; i++) {
            if (!pagesURL.get(i).startsWith("http://practice.cybertekschool.com")) {
                System.out.println("All page url's are NOT start with http://practice.cybertekschool.com ");
            }
        }
        System.out.println("All page url's are start with http://practice.cybertekschool.com!");
        }
}
