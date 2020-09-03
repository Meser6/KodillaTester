package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement alert = driver.findElement(By.xpath(
                "//*[@class=\"_13q9y _8hkto munh_56_m m7er_k4 m7er_wn m7er_56_m\"]"));
        alert.click();

        WebElement category = driver.findElement(By.xpath(
                "//*[@class=\"mr3m_1 m7er_k4 _k70df mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4 _d25db_an94v\"]"));
        Select selectCategory = new Select(category);
        selectCategory.selectByVisibleText("Elektronika");

        WebElement search = driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        search.sendKeys("Mavic mini");

        WebElement click = driver.findElement(By.xpath(
                "//*[@class=\"mp7g_oh mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _d25db_3gmLS\"]/button"));
        click.click();
    }
}
