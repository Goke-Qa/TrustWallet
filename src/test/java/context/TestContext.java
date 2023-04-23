package context;

import managers.DriverManager;
import managers.PageObjectManager;

public class TestContext {
	
	private PageObjectManager pageobjectmanager;
	private DriverManager drivermanager;
	
	
	public TestContext() {
		drivermanager = new DriverManager();
		pageobjectmanager = new PageObjectManager(drivermanager.getDriver());
	}
	
	public DriverManager getDriverManager() {
		return drivermanager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageobjectmanager;
	}

}
