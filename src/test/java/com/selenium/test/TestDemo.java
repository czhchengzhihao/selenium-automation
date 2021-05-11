package com.selenium.test;

import com.selenium.util.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @PackageName: com.selenium.test
 * @ClassName: TestDemo
 * @Description: TestDemo/description:
 * @Author: ChengZhiHao
 * @Date: 2021/5/11 19:16
 * @Version: v1.0
 */
public class TestDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = BrowserUtil.openBrowser("edge");
        driver.get("https://www.baidu.com");
        //获取输入框元素，并输入值
        driver.findElement(By.id("kw")).sendKeys("我爱学习");
        //获取搜索元素，并点击
        driver.findElement(By.id("su")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
