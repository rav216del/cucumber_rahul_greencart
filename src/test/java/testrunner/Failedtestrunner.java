package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failed_scenarios.txt",
		glue="stepdefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber.html",
				"json:target/cucumber.json"
				
				
		}
		
		
		)



public class Failedtestrunner extends AbstractTestNGCucumberTests {

}


//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"