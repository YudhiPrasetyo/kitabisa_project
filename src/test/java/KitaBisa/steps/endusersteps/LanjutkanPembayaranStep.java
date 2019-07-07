package KitaBisa.steps.endusersteps;

import KitaBisa.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LanjutkanPembayaranStep {

    UrlLandingPage urlLandingPage;
    LandingPage landingPage;
    DetailDonasi detailDonasi;
    DetailCampaignPage detailCampaignPage;
    IntruksiPembayaraPage intruksiPembayaraPage;

    @Step
    public void openHomePage(){
        urlLandingPage.open();
    }

    @Step
    public void clickCampaign(){
        landingPage.Campaign();
    }

    @Step
    public void isDetailCampaignShow(){
        Boolean actual = detailCampaignPage.detailCampaign();
        assertThat("detail is not shown", actual, equalTo(true));
    }

    @Step
    public void clickBtnDonasiSekarang(){
        detailCampaignPage.btnDonasiSekarang();
    }

    @Step
    public void isFormDonasiShow(){
        Boolean actual = detailDonasi.formDetailDonasi();
        assertThat("form is not show", actual, equalTo(true));
    }

    @Step
    public void inputJmlDonasi(String jml_Donasi){
        detailDonasi.jmlDonasi(jml_Donasi);
    }

    @Step
    public void clickMetodePembayaran(){
        detailDonasi.pilihMetode();
    }

    @Step
    public void isPopUpMetodeShow(){
        Boolean actual = detailDonasi.popUpMetode();
        assertThat("pop up is not show", actual, equalTo(true));
    }

    @Step
    public void clickGoPay(){
        detailDonasi.pilihGoPay();
    }

    @Step
    public void inputNamaLengkap(String nama_lengkap){
        detailDonasi.namaLengkap(nama_lengkap);
    }

    @Step
    public void inputEmail(String email){
        detailDonasi.email(email);
    }

    @Step
    public void inputComment(String komentar){
        detailDonasi.comment(komentar);
    }

    @Step
    public void clickBtnLanjutPembayaran(){
        detailDonasi.btnLanjutkanPembayaran();
    }

    @Step
    public void intruksiPembayaran(){
        Boolean actual = intruksiPembayaraPage.formIntruksi();
        assertThat("form intruksi not shown", actual, equalTo(true));
    }

    @Step
    public void errorMessage(){
        Boolean actual = detailDonasi.errorMessage();
        assertThat("error Message is not shown", actual, equalTo(true));
    }





}
