package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LinkTextLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/link.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        System.out.println("Title of the page before click -" + driver.getTitle());

        driver.findElement(By.linkText("click here")).click();
        Thread.sleep(2000);
        System.out.println("Title of the page after click -" + driver.getTitle());
        driver.quit();
    }
}
