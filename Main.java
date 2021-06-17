/*
 * Copyright (c) 2021. Created by Ihor Hudyma for TestMatick
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        SearchPage search = new SearchPage(driver);
        search.searchResult("java");
    }
}