package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TrustWalletLegalPage {
	
	WebDriver driver;
	
	By btn_Privacypolicy = By.id("com.wallet.crypto.trustapp:id/privacy");
	By btn_Close = By.id("com.wallet.crypto.trustapp:id/action_hide");
	By img_TrustwalletPrivacy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[1]");
	By btn_Termsofservice = By.id("com.wallet.crypto.trustapp:id/terms");
	By btn_Checkbox = By.id("com.wallet.crypto.trustapp:id/acceptCheckBox");
	By btn_Continue = By.id("com.wallet.crypto.trustapp:id/next");
	
	
	public TrustWalletLegalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickPrivacypolicy() {
		driver.findElement(btn_Privacypolicy).click();
	}
	
	public void closePrivacy() throws Exception {
		Thread.sleep(2000);
		driver.findElement(btn_Close).click();
	}
	
	public void clickTermsofService() throws Exception {
		Thread.sleep(2000);
		driver.findElement(btn_Termsofservice).click();
	}
	
	public void closeTermsofService() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_Close).click();
	}
	
	public void checkBox() throws Exception {
		Thread.sleep(2000);
		driver.findElement(btn_Checkbox).click();
	}
	
	public void clickContinue() {
		driver.findElement(btn_Continue).click();
	}
	

}
