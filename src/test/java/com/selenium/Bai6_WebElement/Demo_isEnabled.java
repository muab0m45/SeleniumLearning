package com.selenium.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isEnabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.cssSelector("button")).click();
        boolean isSubmitEnable = driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled();
        boolean isHackedEnable = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();

        System.out.println(isSubmitEnable);
        System.out.println(isHackedEnable);

        driver.quit();

    }
}
