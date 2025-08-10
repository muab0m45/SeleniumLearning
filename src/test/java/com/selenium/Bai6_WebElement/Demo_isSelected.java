package com.selenium.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isSelected {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        WebElement elm = driver.findElement(By.cssSelector(LocatorCRM.cbxRemember));
        elm.click();

        boolean isRememberChecked = elm.isSelected();

        System.out.println("Remember selected: " + isRememberChecked);

        driver.quit();

    }
}
