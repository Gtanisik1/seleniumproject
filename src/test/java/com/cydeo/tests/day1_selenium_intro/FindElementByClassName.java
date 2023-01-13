package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.quit();
        WebElement Sansli = driver.findElement(By.className("RNmpXc"));

        if (Sansli.getText().equals("I'm Feeling Lucky")){
            System.out.println("TEXT is CORRECT");

        }else {
            System.out.println("NOT CORRECT!!!!!!");




    }
}}
