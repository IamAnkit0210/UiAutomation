package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FormData {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //Setup Webdriver for chrome browser
        //System.setProperty("webdriver.chrome.driver","");

        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();  //Launch Chrome browser
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");   //Navigate to website

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        WebElement fName = driver.findElement(By.id("userName"));
        fName.sendKeys("Sireesha");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("abc@gmail.com");


        //tagname[@attribute = 'value']
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Bangalore");


        //tagname[attribute = 'value']
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Tumkur 123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Thread.sleep(3000);

        //driver.close();

        //driver.quit();
    }
}
