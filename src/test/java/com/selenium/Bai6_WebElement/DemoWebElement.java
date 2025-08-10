package com.selenium.Bai6_WebElement;

import com.selenium.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DemoWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.cssSelector(LocatorCRM.inputPassword)).clear();
        driver.findElement(By.cssSelector(LocatorCRM.inputPassword)).clear();
        driver.findElement(By.cssSelector(LocatorCRM.inputEmail)).sendKeys("admi1231n@example.com");
        driver.findElement(By.cssSelector(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.cssSelector(LocatorCRM.buttonLogin)).click();

        System.out.println("Alert error message is displayed: " + driver.findElement(By.cssSelector(LocatorCRM.alertErrorMessage)).isDisplayed());

        driver.get("https://anhtester.com/");

        WebElement elm = driver.findElement(By.cssSelector(".logo"));
        System.out.println("Logo displayed: " + elm.isDisplayed());

        driver.quit();
    }
}
