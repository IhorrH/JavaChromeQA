/*
 * Copyright (c) 2021. Created by Ihor Hudyma for TestMatick
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("java");

        searchBox.sendKeys(Keys.RETURN);
    }
}