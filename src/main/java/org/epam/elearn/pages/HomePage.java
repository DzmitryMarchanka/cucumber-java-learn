package org.epam.elearn.pages;

import org.epam.elearn.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private static final String CUCUMBER_URL = "https://cucumber.io";
    private static final String MENU_SECTION_XPATH = "//*[contains(@class, 'navbar__link')]";
    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";

    public void openCucumberWebsite () {
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(String.format(TEXT_PATTERN, MENU_SECTION_XPATH, linkText)));
    }
}
