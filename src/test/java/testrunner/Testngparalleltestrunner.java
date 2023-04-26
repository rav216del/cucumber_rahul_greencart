package testrunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue="stepdefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber.html"}
			)

public class Testngparalleltestrunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	 public Object[][] scenarios(){
		 
		 return super.scenarios();
	 }

}
