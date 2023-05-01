package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thankyoushopping {
	
	WebDriver driver;
	public Thankyoushopping(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBy(xpath="//*[text()='Thank you, your order has been placed successfully ']")
	WebElement thanyoumsg;
	
	public String getthanyoumsg() {
		return thanyoumsg.getText();
	}

}
