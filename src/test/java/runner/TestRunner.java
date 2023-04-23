package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		tags = "",
		glue = {"stepDefinitions"},
		plugin = {
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"junit:target/Reports/xmlReport.xml",
				"json:target/Reports/jsonReport.json",
				"html:target/Reports/htmlReport.html",
				"rerun:rerun.txt"
		}
		
		)


public class TestRunner {
	
	

}
