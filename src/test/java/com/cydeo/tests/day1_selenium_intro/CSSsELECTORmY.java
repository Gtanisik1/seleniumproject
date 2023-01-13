package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSsELECTORmY {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement searchBox= driver.findElement(By.cssSelector("input[class='gLFyf']"));

        searchBox.sendKeys("Cydeo"+ Keys.ENTER);

        WebElement applyText= driver.findElement(By.cssSelector("a[href=\"https://cydeo.com/apply-now/\"]"));

        if (applyText.getText().equals("Apply Now")) {
            System.out.println("passed");
        }else{
            System.out.println("failed");

            driver.quit();


        }

    }
}
