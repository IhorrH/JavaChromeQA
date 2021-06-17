/*
 * Copyright (c) 2021. Created by Ihor Hudyma for TestMatick
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private WebElement q;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public ResultsPage searchResult(String text)
    {
        q = driver.findElement(By.name("q"));
        q.sendKeys(text);
        q.submit();
        return new ResultsPage(driver);
    }
}
