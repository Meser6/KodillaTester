package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OcularExample {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        WorldTimePage worldTimePage = new WorldTimePage(webDriver);

        worldTimePage.open();
        worldTimePage.close();

    }
}
