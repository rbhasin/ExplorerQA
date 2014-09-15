package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ThreadPage;
import util.WebConnector;

/**
 * Created by r.singhbhasin on 08/08/2014.
 */
public class ThreadPageStepDef {
    WebConnector selenium = WebConnector.getInstance();
    WebDriver driver = selenium.SharedDriver();
    ThreadPage Thrd = PageFactory.initElements(driver, ThreadPage.class);



    @When("^I click on a thread title$")
    public void I_click_on_a_thread_title() throws Throwable {
        Thrd.ClickThreadTitle();

    }

    @Then("^I should see the thread article opening in the same window$")
    public void I_should_see_the_thread_article_opening_in_the_same_window() throws Throwable {
        Thrd.IsThreadOpen();

    }
}
