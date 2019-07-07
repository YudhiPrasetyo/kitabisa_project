package KitaBisa.steps.definition;

import KitaBisa.steps.endusersteps.LanjutkanPembayaranStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NegatifLanjutkanPembayaranDefs {

    @Steps
    LanjutkanPembayaranStep lanjutkanPembayaranStep;

    @Given("^user ke halaman landing page$")
    public void userKeHalamanLandingPage() {
        lanjutkanPembayaranStep.openHomePage();
    }

    @When("^user klik salah satu campaign$")
    public void userKlikSalahSatuCampaign() {
        lanjutkanPembayaranStep.clickCampaign();
    }

    @Then("^seharusnya menuju kehalaman detail campaign$")
        public void seharusnyaMenujuKehalamanDetailCampaign() {
        lanjutkanPembayaranStep.isDetailCampaignShow();
    }

    @When("^user klik btn donasi sekarang$")
    public void userKlikBtnDonasiSekarang() {
        lanjutkanPembayaranStep.clickBtnDonasiSekarang();

    }

    @Then("^seharusnya ke halaman lanjut pembayaran$")
    public void seharusnyaKeHalamanLanjutPembayaran() {
        lanjutkanPembayaranStep.isFormDonasiShow();

    }

    @When("^user klik btn lanjutkan$")
    public void userKlikBtnLanjutkan() {
        lanjutkanPembayaranStep.clickBtnLanjutPembayaran();

    }

    @Then("^seharusnya muncul error message$")
    public void seharusnyaMunculErrorMessage() {
        lanjutkanPembayaranStep.errorMessage();
    }
}
