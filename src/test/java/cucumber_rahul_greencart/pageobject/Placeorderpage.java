package cucumber_rahul_greencart.pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorderpage {
	WebDriver driver;
	public Placeorderpage (WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@CacheLookup
@FindBy(xpath="//*[@id=\"productCartTables\"]/tbody/tr")
List<WebElement> tablerow;

@CacheLookup
@FindBy(xpath="//button[text()='Place Order']")
WebElement placeorder;

@CacheLookup
@FindBy(xpath="//tbody/tr/td[2]")
List<WebElement> placeorderproductname;

@CacheLookup
@FindBy(css=".promoCode")
WebElement promocodetextbox;

@CacheLookup
@FindBy(css=".promoBtn")
WebElement promocodeapplybutton;

@CacheLookup
@FindBy(xpath="//span[text()='Code applied ..!']")
WebElement codeapplied;

@CacheLookup
@FindBy(css=".totAmt")
WebElement totalamount;

@CacheLookup
@FindBy(css=".discountPerc")
WebElement discount;

@CacheLookup
@FindBy(css=".discountAmt")
WebElement TotalAmountAfterDiscount;

public List<String> getplaceorderproduct() {
	List<String> a = new ArrayList<String>();
	for(int i=1;i<=tablerow.size();i++){
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr["+i+"]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr["+i+"]/td[5]")).getText());
		String item=driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr["+i+"]/td[2]")).getText().split("-")[0].trim();
		System.out.println(item);
		a.add(item);
	}	
	return a;
	
}
public void clickonplaceorder() {
	placeorder.click();
	
}
public void getpromoCodetextbox(String promocode) {
	promocodetextbox.sendKeys(promocode);
}

public void getpromocodeapplybutton() {
	promocodeapplybutton.click();
}
public String getcodeapplied() {
	return codeapplied.getText();
}
public String gettotalamount() {
	return totalamount.getText();
}
public String getdiscount() {
	return discount.getText();
}
public String getTotalAmountAfterDiscount() {
	return TotalAmountAfterDiscount.getText();
}
	
	
	
	

}
