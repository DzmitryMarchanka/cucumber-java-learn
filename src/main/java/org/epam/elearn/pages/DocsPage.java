package org.epam.elearn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DocsPage extends BasePage {
    private static final String PAGE_TITLE_PATTERN = "//*[contains(@class, 'docMainContainer')]//*[contains(@class, 'theme-doc-markdown')]//*[contains(text(), '%s')]";
    private static final By MENU_ITEM = By.className("menu__list-item");

    public boolean isPageWithTitleDisplayed(String title) {
        return isElementDisplayed(By.xpath(String.format(PAGE_TITLE_PATTERN, title)));
    }

    public List<WebElement> getMenuItemTitles() {
        return findElements(MENU_ITEM);
    }
}