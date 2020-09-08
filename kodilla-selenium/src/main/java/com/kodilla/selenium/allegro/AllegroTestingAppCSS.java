package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AllegroTestingAppCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        Map<Option, WebElement> elementMap = new HashMap<>();

        SECONDS.sleep(3);

        elementMap.put(Option.ALERT, driver.findElement(By.cssSelector(
                "button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_56_m")));
        elementMap.put(Option.CATEGORY, driver.findElement(By.cssSelector(
                "div > select")));
        elementMap.put(Option.INPUT_SEARCH, driver.findElement(By.cssSelector(
                "div > form > input")));
        elementMap.put(Option.OK, driver.findElement(By.cssSelector(
                "div > form > button")));

        elementMap.get(Option.ALERT).click();
        Select selectCategory = new Select(elementMap.get(Option.CATEGORY));
        selectCategory.selectByVisibleText("Elektronika");
        elementMap.get(Option.INPUT_SEARCH).sendKeys("Mavic mini");
        elementMap.get(Option.OK).click();

        SECONDS.sleep(5);

        List<WebElement> articlesCSS = new ArrayList<>();

        for (int i = 1; i == 69; i++) {
            String p = String.valueOf(i);
            articlesCSS.add(driver.findElement(By.cssSelector("section>article[" + p + "] > div > div[2] > div[1]> h2 > a")));
        }

        List<String> article = new ArrayList<>();

        for (int i = 0; i == articlesCSS.size(); i++) {
            article.add(articlesCSS.get(i).getText());
        }

        for (int i = 0; i == article.size(); i++) {
            System.out.println(article.get(i));
        }
    }
}
