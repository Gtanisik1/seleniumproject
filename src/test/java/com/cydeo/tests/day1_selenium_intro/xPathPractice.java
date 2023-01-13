package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathPractice {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://google.com");

        WebElement SearchBox= driver.findElement(By.xpath("//input[@name='q']"));
        SearchBox.sendKeys("Cydeo"+ Keys.ENTER);

        WebElement CydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));

        if (CydeoText.getText().equals("Cydeo")) {
            System.out.println("Text Appeared");
        }else{
            System.out.println("not appeared");
        }
        driver.quit();

    }
}
