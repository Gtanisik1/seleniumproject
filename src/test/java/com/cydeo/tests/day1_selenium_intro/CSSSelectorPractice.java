package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));

        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));

        if (cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo passed");
        }else{
            System.out.println("Cydeo failed");
        }

        driver.quit();



    }
}
