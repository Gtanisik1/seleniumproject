package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webElementS {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("Before clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        WebElement greenRadioButton=driver.findElement(By.id("green"));
        greenRadioButton.click();

        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());


        List<WebElement>allColors=driver.findElements(By.name("color"));
        System.out.println("allColors.size() = " + allColors.size());

        for (WebElement eachColors: allColors){

            System.out.println("Current radio button is:" + eachColors.getAttribute("id"));
            System.out.println("is it enable?: "+eachColors.isEnabled());
            System.out.println("is it selected?: "+eachColors.isSelected());
        }

    }
}
