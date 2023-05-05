package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/greencartmultiitemchoose.feature",
		glue="stepdefinitions",
		tags="@whole1 or @whole2 or @whole3 or @whole4 or @whole5 or @whole6 or @whole7 or @whole8 or @whole9 ",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber.html",
				"json:target/cucumber.json",
				"rerun:target/failed_scenarios.txt"}
		
		)

public class Multipleitemtestng extends AbstractTestNGCucumberTests{

}
