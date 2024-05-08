package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationprojectpage {
	
	WebDriver driver;
	public Automationprojectpage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// new webElements added
	@CacheLookup
	@FindBy(xpath="//h5[text()='OUR PROJECTS']")
	WebElement ourprojecttext;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"project-container\"]/div/div[1]/a[1]")
	WebElement automation1;
	
	public String getourprojecttext() {
		return ourprojecttext.getText();
	
	}
	public void clickonautomationpracticelink1() {
		//Actions a= new Actions(driver);
		//a.click(automation1).build().perform();
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", automation1);
		}
	}
	
	



