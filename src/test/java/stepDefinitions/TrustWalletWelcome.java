package stepDefinitions;

import context.TestContext;
import io.cucumber.java.en.*;
import pages.TrustWalletWelcomePage;

public class TrustWalletWelcome {
	
	
	TestContext testcontext;
	TrustWalletWelcomePage trustwalletwelcomepage;
	
	
	public TrustWalletWelcome(TestContext context) {
		testcontext = context;
		trustwalletwelcomepage =  testcontext.getPageObjectManager().gettrustwalletwelcomepage();
		}
	
	@Given("user launches the trust wallet app")
	public void user_launches_the_trust_wallet_app() {

	}
	
	@When("user can see the inscription private and secure, create a new wallet and i already have a wallet buttons")
	public void user_can_see_the_inscription_private_and_secure_create_a_new_wallet_and_i_already_have_a_wallet_buttons() {
	    trustwalletwelcomepage.verifyPrivateandSecure();
	}

	@And("user can swipe to the right to see the inscription all assets in one place")
	public void user_can_swipe_to_the_right_to_see_the_inscription_all_assets_in_one_place() throws Exception {
	   trustwalletwelcomepage.verifyAllassetsinOneplace();
	}

	@And("user can swipe to the right again to see the inscription trade assets")
	public void user_can_swipe_to_the_right_again_to_see_the_inscription_trade_assets() throws Exception {
	    trustwalletwelcomepage.verifyTradeassets();
	}

	@And("user can swipe to the right to see the last screen with the inscription explore decentralized apps")
	public void user_can_swipe_to_the_right_to_see_the_last_screen_with_the_inscription_explore_decentralized_apps() throws Exception {
	    trustwalletwelcomepage.verifyExploreDecentralizedapps();
	}
	
	@Then("user clicks on the create a new wallet button")
	public void user_clicks_on_the_create_a_new_wallet_button() throws Exception {
	   trustwalletwelcomepage.clickCreateNewWallet();
	   trustwalletwelcomepage.verifyLegal();
	}
}