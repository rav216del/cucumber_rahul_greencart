package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Practicepage {
	WebDriver driver;
	public Practicepage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

}
