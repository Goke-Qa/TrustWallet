package stepDefinitions;

import context.TestContext;
import io.cucumber.java.en.*;
import pages.TrustWalletLegalPage;
import pages.TrustWalletWelcomePage;

public class TrustWalletLegal {
	
	TestContext testcontext;
	TrustWalletWelcomePage trustwalletwelcomepage;
	TrustWalletLegalPage trustwalletlegalpage;
	
	
	public TrustWalletLegal(TestContext context) {
		testcontext = context;
		trustwalletwelcomepage =  testcontext.getPageObjectManager().gettrustwalletwelcomepage();
		trustwalletlegalpage = testcontext.getPageObjectManager().gettrustwalletlegalpage();
		}
	
	
	@Given("user launches is on the legal screen")
	public void user_launches_is_on_the_legal_screen() throws Exception {
	   trustwalletwelcomepage.clickCreateNewWallet();
	}

	@When("user clicks on the privacy policy")
	public void user_clicks_on_the_privacy_policy() {
	    trustwalletlegalpage.clickPrivacypolicy();
	}

	@And("user closes the privacy policy")
	public void user_closes_the_privacy_policy() throws Exception {
	    trustwalletlegalpage.closePrivacy();
	}

	@Then("user clicks on the terms of service")
	public void user_clicks_on_the_terms_of_service() throws Exception {
	    trustwalletlegalpage.clickTermsofService();
	}

	@And("user closes the terms of policy")
	public void user_closes_the_terms_of_policy() throws Exception {
	    trustwalletlegalpage.closeTermsofService();
	}

	@And("user clicks on the check box to accept the terms of service and privacy policy")
	public void user_clicks_on_the_check_box_to_accept_the_terms_of_service_and_privacy_policy() throws Exception {
	    trustwalletlegalpage.checkBox();
	}

	@Then("user clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	    trustwalletlegalpage.clickContinue();
	}


}
