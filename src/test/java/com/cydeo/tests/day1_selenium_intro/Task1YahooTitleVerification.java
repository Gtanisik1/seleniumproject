package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.getTitle();
        String expectedTitle= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification Passed!");
        }else {
            System.out.println("Title is NOT AS EXPECTED. Verification FAILED!");
        }
        System.out.println("ACTUAL TITLE IS=====>"+driver.getTitle());
        driver.close();

    }
}
