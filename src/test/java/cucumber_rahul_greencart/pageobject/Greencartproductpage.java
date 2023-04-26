package cucumber_rahul_greencart.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Greencartproductpage {
	WebDriver driver;
	public Greencartproductpage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}



@CacheLookup
@FindBy(xpath="//div[@class='brand greenLogo']")
WebElement greencartlogo;

@CacheLookup
@FindBy(css="div[class='products'] div[class='product'] .product-name")
List<WebElement> productname;

public String getgreencartlogo() {
	return greencartlogo.getText();
}
public void getproductname() {
	
	for(int i=0;i<productname.size();i++) {
		if(productname.get(i).getText().contains("Tomato"))
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]")).click();
			break;
		}
	}
}

}