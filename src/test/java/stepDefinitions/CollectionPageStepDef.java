package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CollectionPage;
import util.WebConnector;

/**
 * Created by r.singhbhasin on 17/07/2014.
 */
public class CollectionPageStepDef {
    WebConnector selenium = WebConnector.getInstance();
    WebDriver driver = selenium.SharedDriver();
    CollectionPage collpage = PageFactory.initElements(driver, CollectionPage.class);



    @Given("^I am a Science user$")
    public void I_am_a_science_user(){

    }

    @When("^I open a published collection site$")
    public void open_collection_site(){
        collpage.opensite();
    }

    @Then("^I should see the collection info$")
    public void I_should_see_collection_info() throws InterruptedException {

        try {
            collpage.checkcollinfo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I should see thread and research paper cards$")
    public void I_should_see_thread_researchpaper_cards() throws InterruptedException {
        try {
            collpage.ThreadandResearchCheck();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
