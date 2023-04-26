package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	public Homepage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	


@FindBy(xpath="//ul/li[7]/a[text()='Practice']")
WebElement practicelink;

public void clickonhomepagepracticelink() {
	practicelink.click();
}




}