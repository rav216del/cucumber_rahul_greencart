package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Proceedpage {
	
	WebDriver driver;
	public Proceedpage (WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBy(xpath="//label[text()='Choose Country']")
	WebElement choosecountry;
	
	@CacheLookup
	@FindBy(xpath="//select[@style='width: 200px;']")
	WebElement selectcounrtydropdown;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement termandconditioncheckbox;
	
	@CacheLookup
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	
	
	public String getchoosecountry() {
		return choosecountry.getText();
	}
	public void getselectcounrtydropdown() {
		Select sc = new Select(selectcounrtydropdown);
		sc.selectByVisibleText("India");
		System.out.println(sc.getFirstSelectedOption().getText());
	}
	
	public void gettermandconditioncheckbox() {
		termandconditioncheckbox.click();
	}
	public void getproceedbutton() {
		 proceedbutton.click();
	}

}
