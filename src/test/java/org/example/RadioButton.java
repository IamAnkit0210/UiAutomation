package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButton {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        WebElement yesBtn = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesBtn.click();

        WebElement resultText = driver.findElement(By.className("text-success"));
        System.out.println("Selected : " + resultText.getText());

        WebElement impBtn = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        impBtn.click();

        System.out.println("Selected : " + resultText.getText());

        driver.close();

    }
}
