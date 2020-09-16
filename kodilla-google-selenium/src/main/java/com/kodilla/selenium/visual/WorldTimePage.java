package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;

public class WorldTimePage {
    private static final String pageUrl = "https://www.worldtimeserver.com/current_time_in_AW.aspx";

    private WebDriver webDriver;

    public WorldTimePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(pageUrl);
    }

    public void close() {
        webDriver.quit();
    }
}
