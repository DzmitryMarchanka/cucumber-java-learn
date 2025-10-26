package org.epam.elearn.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.epam.elearn.driver.DriverManager;

public class DriverHooks {
    @Before
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After(order = 0)
    public void quiteDriver() {
        DriverManager.quitDriver();
    }
}
