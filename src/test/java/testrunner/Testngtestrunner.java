package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue="stepdefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber.html",
				"json:target/cucumber.json",
				"rerun:target/failed_scenarios.txt"}
		
		)





public class Testngtestrunner extends AbstractTestNGCucumberTests {

}
