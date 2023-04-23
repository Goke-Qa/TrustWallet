package managers;

import org.openqa.selenium.WebDriver;

import pages.TrustWalletLegalPage;
import pages.TrustWalletWelcomePage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private TrustWalletWelcomePage gettrustwalletwelcomepage;
	private TrustWalletLegalPage gettrustwalletlegalpage;
	
	public  PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public TrustWalletWelcomePage gettrustwalletwelcomepage() {
		return(gettrustwalletwelcomepage == null) ? gettrustwalletwelcomepage = new TrustWalletWelcomePage(driver) : gettrustwalletwelcomepage;
	}
	
	public TrustWalletLegalPage gettrustwalletlegalpage() {
		return(gettrustwalletlegalpage == null) ? gettrustwalletlegalpage = new TrustWalletLegalPage(driver) : gettrustwalletlegalpage();
	}

}
