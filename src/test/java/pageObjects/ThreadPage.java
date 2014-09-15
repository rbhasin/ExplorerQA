package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Constants;

/**
 * Created by r.singhbhasin on 08/08/2014.
 */
public class ThreadPage {

    @FindBy(xpath = Constants.ThreadPageHeading)
    public WebElement ThreadHeader;

    @FindBy(xpath = Constants.Thread_title)
    public WebElement Threadtitle;


    public boolean IsThreadOpen(){
        String doi_head = ThreadHeader.getText();
        if(doi_head == "DOI Not Found"){
            return true;
        }
        return false;
    }


    public void ClickThreadTitle()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Threadtitle.click();


    }

}
