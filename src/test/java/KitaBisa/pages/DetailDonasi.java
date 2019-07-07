package KitaBisa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class DetailDonasi extends PageObject {
    @FindBy(xpath= "//div[@class='white-box white-box--desc block']")
    private WebElementFacade formDetailDonasi;

    @FindBy(xpath= "//input[@id='target-donasi']")
    private WebElementFacade jmlDonasi;

    @FindBy(xpath= "//div[@class='category-select-head js-category-select-head']")
    private WebElementFacade pilihMetode;

    @FindBy(xpath= "//ul[@class='list-nostyle category-select-list black-border js-category-select-list']")
    private WebElementFacade popUpMetode;

    @FindBy(xpath= "//li[1]")
    private WebElementFacade pilihGopay;

    @FindBy(xpath= "//input[@id='Donations_donorName']")
    private WebElementFacade namaLengkap;

    @FindBy(xpath="//input[@id='emailOrPhone']")
    private WebElementFacade email;

    @FindBy(xpath="//textarea[@id='Donations_comment']")
    private WebElementFacade comment;

    @FindBy(xpath="//button[@class='btn btn--pink btn--large btn--block text-bold']")
    private WebElementFacade btnLanjutPembayaran;

    @FindBy(xpath = "//p[contains(text(),'Nominal donasi tidak boleh kosong.')]")
    private WebElementFacade errorMessage;

    public Boolean formDetailDonasi(){
        return formDetailDonasi
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void jmlDonasi(String jml_Donasi){
        jmlDonasi.type(jml_Donasi);
    }

    public void pilihMetode(){
        pilihMetode.click();
    }

    public Boolean popUpMetode(){
        return popUpMetode
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void pilihGoPay(){
        pilihGopay.click();
    }

    public void namaLengkap(String nama_lengkap){
        namaLengkap.type(nama_lengkap);
    }

    public void email(String namaEmail){
        email.type(namaEmail);
    }

    public void comment(String komentar){
        comment.type(komentar);
    }

    public void btnLanjutkanPembayaran (){
        btnLanjutPembayaran.click();
    }

    public Boolean errorMessage(){
        return errorMessage
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

}
