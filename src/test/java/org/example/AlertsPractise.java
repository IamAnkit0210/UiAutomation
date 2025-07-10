package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsPractise {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//*[@id='alertButton']")).click();
//
//        Alert al = driver.switchTo().alert();
//
//        String text = al.getText();
//        System.out.println(text);
//
//        al.accept();

        driver.findElement(By.cssSelector("button[id='confirmButton']")).click();
        Alert al1 = driver.switchTo().alert();

        al1.accept();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[id='confirmButton']")).click();

        al1.dismiss();

        Thread.sleep(3000);

        driver.close();
    }
}
