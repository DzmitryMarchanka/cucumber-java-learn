package org.epam.elearn.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.elearn.pages.DocsPage;
import org.epam.elearn.pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {
    private DocsPage docsPage = new DocsPage();
    private HomePage homePage = new HomePage();

    @When("user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("user clicks on the {string} section")
    public void clickOnTheSection(String section) {
        homePage.menuSection(section).click();
    }

    @Then("page with title {string} is displayed")
    public void verifyPageTitlePresence(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle)).overridingErrorMessage("Page with title %s is not displayed", pageTitle).isTrue();
    }
}