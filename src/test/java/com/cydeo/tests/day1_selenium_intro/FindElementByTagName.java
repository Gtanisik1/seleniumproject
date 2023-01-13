package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement header = driver.findElement(By.tagName("h1"));
       /* if (header.getText().equals("Test Automation Practice")) {
            System.out.println("CORRECT");
        }else{
            System.out.println("FAILURE");

        }

        driver.quit();*/

        System.out.println(header.getText());

        driver.quit();

    }
}
