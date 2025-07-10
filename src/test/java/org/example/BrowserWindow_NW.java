package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserWindow_NW {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/browser-windows");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.manage().window().maximize();

        driver.findElement(By.id("windowButton")).click();

        Set<String> windowAfterMsg= driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();

        for(String handle :windowAfterMsg)
        {
            if(!handle.equals(parentWindow))
            {
                    driver.switchTo().window(handle);
                    break;
            }
        }
        String actualMessage = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(actualMessage);

        String expectedMsg = "This is a sample page";
        Assert.assertEquals(actualMessage,expectedMsg);
        driver.close();

        //switch back to parent
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
