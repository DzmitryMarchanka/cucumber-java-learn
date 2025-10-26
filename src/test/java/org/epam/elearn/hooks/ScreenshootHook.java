package org.epam.elearn.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.epam.elearn.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshootHook {
    @After(order = 1)
    public void takeScreenshot (Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
