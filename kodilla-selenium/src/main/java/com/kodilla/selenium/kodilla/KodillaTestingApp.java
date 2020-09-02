package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        WebElement driverElement = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        driverElement.sendKeys("xx@xx.pl");
        driverElement.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        driverElement.sendKeys("XXxx5");
        driverElement.findElement(By.xpath("//html/body/div/div/form/div[2]/button"));
        driverElement.click();

    }
}
