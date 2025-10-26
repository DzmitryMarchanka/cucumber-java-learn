package org.epam.elearn.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Optional;

import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

public class DriverManager {
    private static final String CHROME_DRIVER_PATH = "./src/main/resources/chromedriver";
    private static final long IMPLICIT_WAIT_TIMEOUT = 5;
    private static final long PAGE_LOAD_TIMEOUT = 20;
    private static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<>();

    private DriverManager() {}

    public static void setupDriver() {
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        driverLocal.set(driver);
    }

    public static WebDriver getDriver() {
        return driverLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(WebDriver::quit);
    }
}