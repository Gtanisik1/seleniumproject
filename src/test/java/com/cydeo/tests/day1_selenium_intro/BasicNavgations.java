package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavgations {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com");
        driver.get("https://www.yahoo.com");
        driver.getTitle();

        System.out.println("TITLE = "+driver.getTitle());

    }
}
