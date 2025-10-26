package org.epam.elearn.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/json/CucumberTests.json",
                "junit:target/cucumber-reports/junit/CucumberTests.xml"},
        monochrome = true,
        tags = "",
        glue = "org.epam.elearn",
        features = "classpath:org/epam/elearn/features"
)
public class TestRunner {
}