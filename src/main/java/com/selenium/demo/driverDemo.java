package com.selenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @PackageName: com.selenium.demo
 * @ClassName: Demo1
 * @Description: Demo1/description:
 * @Author: ChengZhiHao
 * @Date: 2021/5/8 16:16
 * @Version: v1.0
 */
public class driverDemo {

    /** selenium 官方文档
     https://www.selenium.dev/documentation/en/webdriver/web_element/*/
    /**
     * chromedriver:http://npm.taobao.org/mirrors/chromedriver/
     * geckodriver:https://github.com/mozilla/geckodriver/releases
     * msedgedriver:https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
     **/
/*
        public static void main(String[] args) throws InterruptedException {
            //加载驱动，后面的路径自己要选择正确，也可以放在本地
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

            //初始化一个谷歌浏览器实例，实例名称叫driver
            WebDriver driver = new ChromeDriver();
            // get()打开一个站点
            driver.get("https://www.baidu.com");
            Thread.sleep(1000);
            //获取输入框元素，并输入值
            driver.findElement(By.id("kw")).sendKeys("我爱学习");
            //获取搜索元素，并点击
            driver.findElement(By.id("su")).click();
            Thread.sleep(5000);
            driver.quit();
        }*/

    /*    public static void main(String[] args) throws InterruptedException {
            //加载驱动，后面的路径自己要选择正确，也可以放在本地
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");

            //初始化一个谷歌浏览器实例，实例名称叫driver
            WebDriver driver = new FirefoxDriver();
            // get()打开一个站点
            driver.get("https://www.baidu.com");
            Thread.sleep(1000);
            //获取输入框元素，并输入值
            driver.findElement(By.id("kw")).sendKeys("我爱学习");
            //获取搜索元素，并点击
            driver.findElement(By.id("su")).click();
            Thread.sleep(5000);
            driver.quit();
        }*/

    public static void main(String[] args) throws InterruptedException {
        //加载驱动，后面的路径自己要选择正确，也可以放在本地
        System.setProperty("webdriver.edge.driver", "./src/main/resources/driver/msedgedriver.exe");
        //初始化一个谷歌浏览器实例，实例名称叫driver
        WebDriver driver = new EdgeDriver();
        // get()打开一个站点
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
        //获取输入框元素，并输入值
        driver.findElement(By.id("kw")).sendKeys("我爱学习");
        //获取搜索元素，并点击
        driver.findElement(By.id("su")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
