package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragDropAction {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/droppable");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        try{
            WebElement dragMe = driver.findElement(By.id("draggable"));

            WebElement dropHere = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            actions.dragAndDrop(dragMe,dropHere).perform();

            String result = dropHere.getText();

            System.out.println(result);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.close();
        }
    }
}
