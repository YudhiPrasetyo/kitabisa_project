package KitaBisa.steps.definition;

import KitaBisa.steps.endusersteps.LanjutkanPembayaranStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PembayaranDefs {

    @Steps
    LanjutkanPembayaranStep lanjutkanPembayaranStep;


    @Given("^user menuju ke landing page$")
    public void userMenujuKeLandingPage() {
        lanjutkanPembayaranStep.openHomePage();
    }

    @When("^user klik campaign$")
    public void userKlikCampaign() {
        lanjutkanPembayaranStep.clickCampaign();
    }

    @Then("^user seharusnya menuju kehalaman detail campaign$")
    public void userSeharusnyaMenujuKehalamanDetailCampaign() {
        lanjutkanPembayaranStep.isDetailCampaignShow();
    }

    @When("^user klik button donasi sekarang$")
    public void userKlikButtonDonasiSekarang() {
        lanjutkanPembayaranStep.clickBtnDonasiSekarang();
        
    }

    @Then("^seharusnya menuju ke halaman lanjut pembayaran$")
    public void seharusnyaMenujuKeHalamanLanjutPembayaran() {
        lanjutkanPembayaranStep.isFormDonasiShow();
        
    }

    @When("^user input jumlah uang \"([^\"]*)\"$")
    public void userInputJumlahUang(String jml_Donasi) {
      lanjutkanPembayaranStep.inputJmlDonasi(jml_Donasi);
    }

    @And("^user klik button pilih pembayaran$")
    public void userKlikButtonPilihPembayaran() {
        lanjutkanPembayaranStep.clickMetodePembayaran();
    }

    @And("^seharusnya muncul pop up metode pembayaran$")
    public void seharusnyaMunculPopUpMetodePembayaran() {
        lanjutkanPembayaranStep.isPopUpMetodeShow();
        
    }

    @And("^user pilih go-pay$")
    public void userPilihGoPay() {
        lanjutkanPembayaranStep.clickGoPay();
        
    }

    @And("^user input nama lengkap \"([^\"]*)\"$")
    public void userInputNamaLengkap(String nama_lengkap) {
        lanjutkanPembayaranStep.inputNamaLengkap(nama_lengkap);
    }

    @And("^user input email \"([^\"]*)\"$")
    public void userInputEmail(String email) {
        lanjutkanPembayaranStep.inputEmail(email);
    }

    @And("^user input comment \"([^\"]*)\"$")
    public void userInputComment(String komentar){
        lanjutkanPembayaranStep.inputComment(komentar);
    }

    @And("^user klik button lanjutkan pembayaran$")
    public void userKlikButtonLanjutkanPembayaran() {
        lanjutkanPembayaranStep.clickBtnLanjutPembayaran();
        
    }

    @Then("^seharusnya user menuju kehalaman intruksi pembayaran$")
    public void seharusnyaUserMenujuKehalamanIntruksiPembayaran() {
        lanjutkanPembayaranStep.intruksiPembayaran();
    }
}
