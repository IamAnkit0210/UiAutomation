package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.rahulshettyacademy.com/dropdownsPractise/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("IND");
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        int count = list.size();

        System.out.println(count);

        for(int i = 1;i<=count;i++)
        {
            if(list.get(i).getText().equalsIgnoreCase("India"))
           {
               list.get(i).click();
               break;
           }
        }

        Thread.sleep(3000);
        driver.close();

    }
}
