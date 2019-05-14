package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getDriver(final String driver) throws NotFoundDriver {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Selenium-drivers\\Chrome\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Selenium-drivers\\Firefox\\geckodriver.exe");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else {
            throw new NotFoundDriver("Driver" + driver + " not found");
        }
    }
}
