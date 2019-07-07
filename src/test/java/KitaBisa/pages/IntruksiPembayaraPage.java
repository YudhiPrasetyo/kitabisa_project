package KitaBisa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class IntruksiPembayaraPage extends PageObject {
    @FindBy(xpath="//div[@class='white-box white-box--summary block']")
    private WebElementFacade formIntruksiPembayaran;

    public Boolean formIntruksi(){
        return formIntruksiPembayaran
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}


