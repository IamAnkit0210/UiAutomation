package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(5000);

        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> cell = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        int sum =0;
        for(int i =0;i<cell.size();i++)
        {
            sum = sum + Integer.parseInt(cell.get(i).getText());
        }
        System.out.println(sum);

        WebElement sumLabel = driver.findElement(By.className("totalAmount"));
        String text = sumLabel.getText();
        System.out.println(text);

        //String handling functions
        String[] values = text.split(" ");
        int length = values.length;
        int expectedValue = Integer.parseInt(values[length-1].trim());
        System.out.println(expectedValue);

        //Compare actual vs expected values
        Assert.assertEquals(sum,expectedValue);

        driver.quit();
    }
}
