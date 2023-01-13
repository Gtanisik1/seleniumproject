package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleDropDown {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement multiItemDD = driver.findElement(By.name("Languages"));

        Select selectMultiItem = new Select(multiItemDD);

        System.out.println("is there a multiple DD? :" + selectMultiItem.isMultiple());

        selectMultiItem.selectByValue("ruby"); // seçilebiliyormu? yada active edilebiliyormu
        selectMultiItem.selectByIndex(4);
        selectMultiItem.selectByVisibleText("Ruby");


        selectMultiItem.deselectByIndex(4);         //deselect yani pasive edilebiliyormu?
        selectMultiItem.deselectByVisibleText("Ruby");
        selectMultiItem.deselectByValue("ruby");

    }
}
