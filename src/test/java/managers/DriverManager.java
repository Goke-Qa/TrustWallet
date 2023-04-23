package managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverManager {
	
	private WebDriver driver;
	
	
	public WebDriver getDriver() {
		driver = createDriver();
		return driver;
		
	}
	
	@SuppressWarnings("deprecation")
	private WebDriver createDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		/*
		 * Emulator settings
		 */
	
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("waitForIdleTimeout", 200);
		caps.setCapability("appPackage", "com.wallet.crypto.trustapp");
		caps.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.start.activity.RootHostActivity");
		
		URL url = null;
		
		try {
			url = new URL("http://localhost:4723/wd/hub");
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeDriver() {
		if(driver == null) {
//			driver.close();
//			driver.quit();
		}
	}

}
