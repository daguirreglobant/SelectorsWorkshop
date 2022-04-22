package com.globant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagePaul {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://test-page-paul.herokuapp.com/");
        driver.manage().window().maximize();
        // 1
        WebElement addressName = driver.findElement(By.cssSelector("address a"));
        // 2
        WebElement listElement = driver.findElement(By.cssSelector("ul li:nth-child(3)"));
        // 3
        WebElement menuElement = driver.findElement(By.cssSelector("menu li:first-child"));
        // 4
        WebElement dirElement = driver.findElement(By.cssSelector("dir li:nth-child(3)"));
        // 5
        WebElement buttonElement = driver.findElement(By.id("but"));
        // 6
        WebElement resetButtonElement = driver.findElement(By.id("f01"));
        // 7
        WebElement optionElement = driver.findElement(By.cssSelector("#f11 option:last-child"));
        // 8
        WebElement tableElement = driver.findElement(By.cssSelector("table tbody tr:nth-child(4) td:last-child"));
        // 9
        WebElement HyphenationElement = driver.findElement(By.cssSelector(".container p:nth-of-type(7)"));
        //10
        WebElement JavaScriptHypElement = driver.findElement(By.cssSelector(".container h3:nth-of-type(2)"));

        System.out.println("1." + addressName.getText());
        System.out.println("2." + listElement.getText());
        System.out.println("3." + menuElement.getText());
        System.out.println("4." + dirElement.getText());
        System.out.println("5." + buttonElement.getText());
        System.out.println("6." + resetButtonElement.getAttribute("value"));
        System.out.println("7." + optionElement.getText());
        System.out.println("8." + tableElement.getText());
        System.out.println("9." + HyphenationElement.getText());
        System.out.println("10." + JavaScriptHypElement.getText());
        driver.close();
    }
}
