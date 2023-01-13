package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to https://app.vytrack.com/user/login

        driver.get("https://app.vytrack.com/user/login");

        //enter username provided "abcd"
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd");
        //enter password provided "abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");
        // click on login button

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        //verify the message "Invalid user name or password."

        WebElement alert = driver.findElement(By.className("alert"));

        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("MESSAGE PASSED");
        }else{
            System.out.println( "MESSAGE FAILED");
        }

        //verify URL contains "vytrack"

        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL PASSED");
        }else {
            System.out.println("URL FAILED");
        }

        //verify title is "Forgot Password"

        driver.findElement(By.partialLinkText("Forgot your password?")).click();

    if (driver.getTitle().equals("Forgot Password")){
        System.out.println("TITLE CORRECT");
        }else{
        System.out.println("TITLE not CORRECT");
    }

  }
}
