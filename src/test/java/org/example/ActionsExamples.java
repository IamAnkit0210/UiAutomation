package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsExamples {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

//        WebElement ele = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        action.scrollToElement(ele).build().perform();
//        action.moveToElement(ele).click().perform();

        WebElement fresh = driver.findElement(By.linkText("Fresh"));
        action.moveToElement(fresh).build().perform();


        Thread.sleep(5000);
        driver.close();
    }
}
