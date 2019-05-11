package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_DATE_DAY = "//span[contains(@class, \"5k_4\")]/span/select[1]";
    public final static String XPATH_DATE_MONTH = "//span[contains(@class, \"5k_4\")]/span/select[2]";
    public final static String XPATH_DATE_YEAR = "//span[contains(@class, \"5k_4\")]/span/select[3]";
    public final static String ID_SEX_MAN = "u_0_a";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        WebElement selectDateDay = driver.findElement(By.xpath(XPATH_DATE_DAY));
        Select selectDay = new Select(selectDateDay);
        selectDay.selectByIndex(4);

        WebElement selectDateMonth = driver.findElement(By.xpath(XPATH_DATE_MONTH));
        Select selectMonth = new Select(selectDateMonth);
        selectMonth.selectByIndex(10);

        WebElement selectDateYear = driver.findElement(By.xpath(XPATH_DATE_YEAR));
        Select selectYear = new Select(selectDateYear);
        selectYear.selectByValue("1995");

        WebElement selectSex = driver.findElement(By.id(ID_SEX_MAN));
        selectSex.click();
    }
}
