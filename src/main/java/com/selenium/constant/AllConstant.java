package com.selenium.constant;

/**
 * @PackageName: com.czh.constant
 * @ClassName: AllConstant
 * @Description: AllConstant/description:常量管理类
 * @Author: ChengZhiHao
 * @Date: 2021/4/12 15:02
 * @Version: v1.0
 */
public class AllConstant {
    /**
     * 浏览器名字
     */
    public static final String CHROME = "chrome";
    public static final String EDGE = "edge";
    public static final String FIREFOX = "firefox";
    /**
     * 代理浏览器
     */
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    public static final String EDGE_DRIVER = "webdriver.edge.driver";
    public static final String FIREFOX_DRIVER = "webdriver.gecko.driver";

    /**
     * 浏览器驱动地址
     */
    public static final String CHROME_DRIVER_ADDRESS = "./src/main/resources/driver/chromedriver.exe";
    //public static final String EDGE_DRIVER_ADDRESS = "./src/main/resources/driver/msedgedriver.exe";
    public static final String FIREFOX_DRIVER_ADDRESS = "./src/main/resources/driver/geckodriver.exe";
    public static final String EDGE_DRIVER_ADDRESS = "./src/main/resources/driver/msedgedriver";
}
