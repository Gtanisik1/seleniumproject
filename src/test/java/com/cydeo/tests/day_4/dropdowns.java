package com.cydeo.tests.day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().window().maximize();

        WebElement dropDownElm = driver.findElement(By.id("dropdown"));

        Select selectObj = new Select(dropDownElm);
        selectObj.deselectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        String expectedOpt = "Option 2";
        String actualOpt=selectObj.getFirstSelectedOption().getText();

        if (actualOpt.equals(expectedOpt)){
            System.out.println("option 2 selection test passed");
        }else {
            System.out.println("option 2 selection test failed");
        }



    }
}
