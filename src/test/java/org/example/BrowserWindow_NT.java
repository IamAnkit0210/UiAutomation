package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class BrowserWindow_NT {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        driver.findElement(By.id("tabButton")).click();

        Set<String> allWindows = driver.getWindowHandles();

        //"123", "jfo", "4358"

        for(String windowHandle : allWindows) {
            if(!windowHandle.equals(parentWindowId))
            {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        //WebElement heading = driver.findElement(By.id("sampleHeading"));
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        driver.close();
        driver.switchTo().window(parentWindowId);

        driver.quit();
    }
}
