package com.selenium.util;

import com.selenium.constant.AllConstant;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @PackageName: com.selenium.util
 * @ClassName: BrowserUtil
 * @Description: BrowserUtil/description:
 * @Author: ChengZhiHao
 * @Date: 2021/5/11 18:42
 * @Version: v1.0
 * <p>
 * selenium 官方文档
 * https://www.selenium.dev/documentation/en/webdriver/web_element/
 * chromedriver:http://npm.taobao.org/mirrors/chromedriver/
 * geckodriver:https://github.com/mozilla/geckodriver/releases
 * msedgedriver:https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
 */

public class BrowserUtil {
    /**
     * 日志打印
     */
    private static final Logger log = Logger.getLogger(Test.class);
    public static WebDriver driver;

    /**
     * @return org.openqa.selenium.WebDriver
     * @Author ChengZhiHao
     * @Description //TODO 支持 Firefox，Chrome,Edge浏览器
     * @Date 19:15 2021/5/11
     * @Param [browserDriver]
     **/
    public static WebDriver openBrowser(String browserDriver) {
        if (AllConstant.CHROME.equals(browserDriver)) {
            System.setProperty(AllConstant.CHROME_DRIVER, "/opt/driver/chromedriver");
            //创建一个参数对象，用来控制chrome以无界面模式打开
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
            log.info(AllConstant.CHROME + "浏览器");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("-headless");
            driver = new ChromeDriver();
            return driver;
        } else if (AllConstant.EDGE.equals(browserDriver)) {
            System.setProperty(AllConstant.EDGE_DRIVER, AllConstant.EDGE_DRIVER_ADDRESS);
            log.info(AllConstant.EDGE + "浏览器");
            driver = new EdgeDriver();
            return driver;
        } else if (AllConstant.FIREFOX.equals(browserDriver)) {
            System.setProperty(AllConstant.FIREFOX_DRIVER, AllConstant.FIREFOX_DRIVER_ADDRESS);
            log.info(AllConstant.FIREFOX + "浏览器");
            driver = new FirefoxDriver();
            return driver;
        } else {
            log.info(browserDriver + "浏览器打开异常");
        }
        return null;
    }

}
