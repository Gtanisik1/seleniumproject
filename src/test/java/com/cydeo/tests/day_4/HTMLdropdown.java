package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLdropdown {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();

        WebElement DDlink = driver.findElement(By.id("dropdownMenuLink"));
        DDlink.click();

        WebElement YahooItem = driver.findElement(By.linkText("Yahoo"));
        YahooItem.click();
    }
}
