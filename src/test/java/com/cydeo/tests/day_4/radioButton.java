package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("Before clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        WebElement greenRadioButton=driver.findElement(By.id("green"));
        greenRadioButton.click();

        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());




    }
}
