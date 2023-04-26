package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
	WebDriver driver;
	public Registerpage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@CacheLookup
@FindBy(xpath="//*[text()='Join now to Practice']")
WebElement registerpagetext;

@CacheLookup	
@FindBy(xpath="//input[@id='name']")
WebElement username;

@CacheLookup
@FindBy(xpath="//input[@id='email']")
WebElement usermail;

@CacheLookup
@FindBy(xpath="//input[@type='checkbox']")
WebElement checkbox;

@CacheLookup
@FindBy(xpath="//button[@id='form-submit']")
WebElement submitbutton;
public String registerpagetext() {
	return registerpagetext.getText();
}

public void usernameandpassword(String name,String email) {
	username.sendKeys(name);
	usermail.sendKeys(email);
}

public void checkbox() {
	checkbox.click();
}
public void clickonsubmitbuton() {
	submitbutton.click();
}





}
