package pages;

import context.TestContext;
import io.cucumber.java.After;

public class Hooks {
	
	TestContext testcontext = new TestContext();
	
	public Hooks(TestContext context) {
		testcontext = context;
	}
	
	@After
	public void quitDriverSession() {
		testcontext.getDriverManager().closeDriver();
	}

}
