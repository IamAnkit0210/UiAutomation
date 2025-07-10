package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        try
        {
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.manage().window().maximize();

            WebElement startBtn = driver.findElement(By.xpath("//div[@id='start']/button"));

            startBtn.click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

            WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

            System.out.println(helloText.getText());

            Thread.sleep(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            driver.close();
        }
    }
}


//.java --> .class file  -->Complilation time
//        JVM executes this .class file
//
//int n = 100;
//100/0;
//
//String abc = null;
//System.out.println(abc)

