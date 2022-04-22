package com.globant.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        //add key and value to map as follow to switch off browser notification
        //Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);
        //Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        // set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://facebook.com");
        driver.manage().window().maximize();

        // FIRST LOGIN IF NOT LOGIN
        // WebElement emailInput = driver.findElement(By.id("email"));
        // WebElement passwordInput = driver.findElement(By.id("pass"));
        // WebElement loginButton = driver.findElement(By.cssSelector("button"));
        // emailInput.sendKeys("myuser@gmail.com");
        // passwordInput.sendKeys("mypasswrod");
        // loginButton.click();

        WebElement menu = driver.findElement(By.cssSelector("[aria-label='Cuenta']"));
        menu.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".b20td4e0.muag1w35")));
        WebElement logoutButton = driver.findElements(By.cssSelector(".b20td4e0.muag1w35 > div")).get(3);
        logoutButton.click();
    }
}
