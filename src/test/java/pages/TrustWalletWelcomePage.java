package pages;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TrustWalletWelcomePage {
	
WebDriver driver;
	
	
	By img_Private_and_secure = By.id("com.wallet.crypto.trustapp:id/title");
	By img_All_assets_in_one_place = By.id("com.wallet.crypto.trustapp:id/title");
	By img_Trade_assets = By.id("com.wallet.crypto.trustapp:id/title");
	By img_Explore_decentralized_apps = By.id("com.wallet.crypto.trustapp:id/title");
	By btn_CreateNewWallet = By.id("com.wallet.crypto.trustapp:id/new_account_action");
	By img_Legal = By.id("com.wallet.crypto.trustapp:id/title");
	

	public TrustWalletWelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPrivateandSecure() {
		driver.findElement(img_Private_and_secure).isDisplayed();
	}
	
	public void verifyAllassetsinOneplace() throws Exception {
		Thread.sleep(2000);
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.2);
        int starty = size.height / 2;

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, starty))
                .release()
                .perform();
        driver.findElement(img_All_assets_in_one_place).isDisplayed();
    }
	
	public void verifyTradeassets() throws Exception {
		Thread.sleep(2000);
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.2);
        int starty = size.height / 2;

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, starty))
                .release()
                .perform();
        driver.findElement(img_Trade_assets).isDisplayed();
    }
	
	public void verifyExploreDecentralizedapps() throws Exception {
		Thread.sleep(2000);
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.2);
        int starty = size.height / 2;

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, starty))
                .release()
                .perform();
        driver.findElement(img_Explore_decentralized_apps).isDisplayed();
    }
	
	public void clickCreateNewWallet() throws Exception {
		Thread.sleep(2000);
		driver.findElement(btn_CreateNewWallet).click();
	}
	
	public void verifyLegal() {
		driver.findElement(img_Legal).isDisplayed();
		
	}
	
}

