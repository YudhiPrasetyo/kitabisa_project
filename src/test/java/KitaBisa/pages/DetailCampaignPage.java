package KitaBisa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.remote.server.handler.FindElement;

import java.util.concurrent.TimeUnit;

public class DetailCampaignPage extends PageObject {
    @FindBy(xpath= "//div[@class='project-short-story']")
    private WebElementFacade detailCampaign;

    @FindBy(xpath = "//a[@class='btn btn--block btn--large btn--round btn-contribute btn--pink']")
    private WebElementFacade btnDonasiSekarang;


    public Boolean detailCampaign (){
        return detailCampaign
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void btnDonasiSekarang(){
        btnDonasiSekarang.click();
    }
}
