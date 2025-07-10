package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    public static void main(String[] args){
        WebDriver driver = null;
        try
        {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.get("https://demoqa.com/checkbox");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.manage().window().maximize();
            WebElement expand = driver.findElement(By.cssSelector(".rct-option-expand-all"));
            expand.click();

            Thread.sleep(2000);

            //camelcasing
            WebElement desktopCheckBox = driver.findElement(By.xpath("//span[text()='Desktop']/preceding-sibling::span[@class='rct-checkbox']"));
            desktopCheckBox.click();

            WebElement res = driver.findElement(By.id("result"));
            System.out.println("Selected : " + res.getText());

            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            driver.close();
        }
    }
}
