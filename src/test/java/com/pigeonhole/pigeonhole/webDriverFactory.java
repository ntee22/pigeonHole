package com.pigeonhole.pigeonhole;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class webDriverFactory {
    public static RemoteWebDriver create(String browserName){
        if ("chrome".equals(browserName)){
            System.setProperty("webdriver.chrome.driver", "/Users/kelvin/Nhut/AquaProjects/pigeonhole/drivers/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            return new ChromeDriver(options);
        } else if ("firefox".equals(browserName)) {
            System.setProperty("webdriver.gecko.driver", "/Users/kelvin/Nhut/AquaProjects/pigeonhole/drivers/geckodriver");
            return new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browserName);
        }
    }
}
