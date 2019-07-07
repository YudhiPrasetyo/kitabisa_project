package KitaBisa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends PageObject {
    @FindBy(xpath= "//section[@id='public-campaign']//div[5]//div[1]//a[1]")
    private WebElementFacade campaign;

    public void Campaign (){
        campaign.click();
    }
}
