package cucumber_rahul_greencart.pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	WebDriver driver;
	public  Cartpage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-info']//p[@class='product-name']")
	WebElement cartproduct;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")
	List<WebElement> multiplecartproduct;
	
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-total']//p[@class='amount']")
	WebElement cartpageproductrate;
	
	@CacheLookup
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement proceedtocheckout;
	
	public List<String> getmultiplecartproduct() {
		//System.out.println(multiplecartproduct.size());
		List<String>a= new ArrayList<String>();
		//String[]b;
		//JavascriptExecutor js= ((JavascriptExecutor)driver);
		//js.executeScript("");
		for(int i=1;i<=multiplecartproduct.size();i++) {
			String item=multiplecartproduct.get(i-1).getText().split("-")[0].trim();
			a.add(item);
		}
		return a;
	}

	
	public String getcartproduct() {
		return cartproduct.getText();
	}

	public String getcartpageproductrate() {
		return cartpageproductrate.getText();
	}
	
	public void getproceedtocheckout() {
		proceedtocheckout.click();
	}
}
