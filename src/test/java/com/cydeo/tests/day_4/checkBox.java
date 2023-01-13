package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement CheckBox1 = driver.findElement(By.id("box1"));
        System.out.println("Before Click CheckBox1.isSelected() = " + CheckBox1.isSelected());
        CheckBox1.click();
        System.out.println("After Click CheckBox1.isSelected() = " + CheckBox1.isSelected());

        //driver.quit();




    }
}
