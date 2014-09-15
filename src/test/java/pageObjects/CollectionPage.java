package pageObjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Constants;
import util.WebConnector;

import java.util.List;


/**
 * Created by r.singhbhasin on 15/07/2014.
 */
public class CollectionPage {

    @FindBy(xpath = Constants.Coll_info)
    public WebElement Header;

    @FindBy(xpath = Constants.Papers_header)
    public WebElement PHeader;

    @FindBy(xpath = Constants.sponsor_tag)
    public WebElement Sponsor;

    @FindBy(xpath = Constants.Coll_info)
    public WebElement Coll_info;

    @FindBy(xpath = Constants.FirstThreadandCard)
    public WebElement ThreadCard;

    @FindBy(xpath = Constants.FirstThreadButton)
    public WebElement ThreadButton;

    @FindBy(xpath = Constants.FirstArticleCard)
    public WebElement ArticleCard;

    @FindBy(xpath = Constants.AllArticleCard)
    public List <WebElement> allArticleCard;

    @FindBy(xpath = Constants.Map_area)
    public WebElement Map_area;

    @FindBy(xpath = Constants.SixthArticleButton)
    public WebElement ArticleButton;

    @FindBy(xpath = Constants.FirstThread)
    public WebElement FirstThreadCard;

    @FindBy(xpath = Constants.FifthThread)
    public WebElement FifthThreadCard;

    @FindBy(xpath = Constants.Citationdot)
    public WebElement CitationDot;





    public void opensite() {
        WebConnector selenium = WebConnector.getInstance();
        WebDriver driver = selenium.SharedDriver();
        CollectionPage collpage = PageFactory.initElements(driver, CollectionPage.class);
        driver.get(Constants.Coll_url);
    }

    public void checkcollinfo() throws InterruptedException {
        if (Coll_info.isDisplayed()) {
            System.out.println("Collection intro box is displayed as expected");
            Assert.assertTrue(Coll_info.isDisplayed());

        } else {
            System.out.println("Collection intro box is not displayed");


        }
    }


    public void ThreadandResearchCheck() throws InterruptedException {
        if (ThreadCard.isDisplayed()) {
            System.out.println("Thread and Research paper cards are displayed");
        } else {
            System.out.println("Thread and/or Research papers are not displayed");
        }
    }

    public void checkthreadheader() throws InterruptedException {
        if (Header.isDisplayed()) {
            System.out.println("Thread header is displayed as expected");
        } else {
            System.out.println("Thread header is not displayed");

        }
    }

    public void highlightThread() {

        ThreadButton.click();
    }

    public void clickmaparea() {

        Map_area.click();
    }

    public boolean IsCardHighlighted() {

        String a;
        a = ArticleCard.getAttribute("aria-disabled");

        if (a.equalsIgnoreCase("false")) {
        return true;
        }
        return false;

    }


    public boolean articleccardhecker(int researchpapaercount) {
        int count = 0;
        for (int i = 0; i < allArticleCard.size(); i++) {
            WebElement ishidden = allArticleCard.get(i).findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li["+i+1+"]/article/div/div[2]/div[2]"));
            if (ishidden.getAttribute("aria-hidden") == "False") {
                count++;

            }

            if (researchpapaercount == count) {
                return true;
            } else return false;


        }

        return false;
    }


    public void highlightArticle() {

        ArticleButton.click();
    }

    public boolean IsThreadHighlighted(WebElement ThreadNumber){

       String t;
       t = ThreadNumber.getAttribute("aria-disabled");

        if (t.equalsIgnoreCase("false")) {
            return true;
        }
        return false;
    }

    public void citation_click()
    {
        CitationDot.click();
    }


}