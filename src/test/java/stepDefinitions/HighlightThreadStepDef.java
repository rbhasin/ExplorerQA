package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CollectionPage;
import util.WebConnector;
import static org.junit.Assert.assertTrue;

/**
 * Created by r.singhbhasin on 28/07/2014.
 */
public class HighlightThreadStepDef {
    WebConnector selenium = WebConnector.getInstance();
    WebDriver driver = selenium.SharedDriver();
    CollectionPage collpage = PageFactory.initElements(driver, CollectionPage.class);


    @Given("^I am on the collection site$")
    public void I_am_on_the_collection_site() throws Throwable {
       collpage.opensite();

    }

    @When("^I click on highlight for any thread$")
    public void I_click_on_highlight_for_any_thread() throws Throwable {
        collpage.highlightThread();


    }

    @Then("^I should see research papers that belong to that thread$")
    public void I_should_see_the_research_papers_that_belong_to_that_thread() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(collpage.IsCardHighlighted());

    }


    @When("^I click on the map area$")
    public void I_click_on_the_map_area() throws Throwable {
        collpage.clickmaparea();

    }

    @Then("^the explorer should be reset$")
    public void the_explorer_should_be_reset() throws Throwable {
        Assert.assertTrue(collpage.IsCardHighlighted());

    }

    @When("^i click on highlight for any research article$")
    public void i_click_on_highlight_for_any_research_article() throws Throwable {
       collpage.highlightArticle();
       Thread.sleep(2000);

    }

    @Then("^i should see threads highlighted that correspond to that article$")
    public void i_should_see_threads_highlighted_that_correspond_to_that_article() throws Throwable {
        Assert.assertTrue(collpage.IsThreadHighlighted(collpage.FirstThreadCard));
        Assert.assertTrue(collpage.IsThreadHighlighted(collpage.FifthThreadCard));
    }

}
