package stepdefinitions;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilis.Testsetup;

public class Hooks {
	Testsetup testsetup;
	public Hooks(Testsetup testsetup) {
		this.testsetup=testsetup;
	}
@After
public void teardown() throws IOException {
	//testsetup.basetest.callwebdriver().quit();

}
@AfterStep
public void addscreenshot(Scenario scenario) throws WebDriverException, IOException {
	
	if(scenario.isFailed())
	{
		
		File source=((TakesScreenshot)testsetup.basetest.callwebdriver()).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\src\\test\\java\\screenshot\\"+scenario.getName()+".jpeg";
		FileUtils.copyFile(source, new File(destination));
		
		/*File source=((TakesScreenshot)testsetup.basetest.callwebdriver()).getScreenshotAs(OutputType.FILE);
		byte[] filecontent=FileUtils.readFileToByteArray(source);
		scenario.attach(filecontent, "image/png", scenario.getName());*/
	}
	
	
	
	
	
}
}
