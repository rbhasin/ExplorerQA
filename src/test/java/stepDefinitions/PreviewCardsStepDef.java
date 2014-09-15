package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CollectionPage;
import util.WebConnector;

/**
 * Created by r.singhbhasin on 14/08/2014.
 */
public class PreviewCardsStepDef {

    WebConnector selenium = WebConnector.getInstance();
    WebDriver driver = selenium.SharedDriver();
    CollectionPage collpage = PageFactory.initElements(driver, CollectionPage.class);

    @When("^I click on the second preview dot$")
    public void I_click_on_the_second_preview_dot() throws Throwable {
        collpage.citation_click();

    }

    @Then("^I should see the citation info$")
    public void I_should_see_the_citation_info() throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @When("^I click on the third preview dot$")
    public void I_click_on_the_third_preview_dot() throws Throwable {
        // Express the Regexp above with the code you wish you had    throw new PendingException();

    }

    @Then("^I should see a figure$")
    public void I_should_see_a_figure() throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

}
