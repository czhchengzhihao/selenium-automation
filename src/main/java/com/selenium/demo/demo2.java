package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * @PackageName: com.selenium.demo
 * @ClassName: demo2
 * @Description: demo2/description:
 * @Author: ChengZhiHao
 * @Date: 2021/5/8 17:35
 * @Version: v1.0
 */
public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to url
            driver.get("https://www.example.com");

// Returns height, width, x and y coordinates referenced element
            Rectangle res =  driver.findElement(By.cssSelector("h1")).getRect();

// Rectangle class provides getX,getY, getWidth, getHeight methods
            System.out.println(res.getX());
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }

    }
}
