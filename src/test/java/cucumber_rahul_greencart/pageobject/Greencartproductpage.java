package cucumber_rahul_greencart.pageobject;

import java.util.Arrays;
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
//@FindBy(css="div[class='products'] div[class='product'] .product-name")
@FindBy(xpath="//div[@class='product']")
List<WebElement> productname;

@CacheLookup
@FindBy(xpath="//input[@class='search-keyword']")
WebElement searchbox;

@CacheLookup
@FindBy(xpath="//h4[@class='product-name']")
WebElement product;

@CacheLookup
@FindBy(xpath="//a[@class='cart-icon']")
WebElement cart;

@CacheLookup
//@FindBy(xpath="//a[@class='cart-icon']//span[@class='cart-count']")
@FindBy(xpath="//tr[1]/td[3]/strong")
WebElement count_on_cart;


public WebElement getCount_on_cart() {
	return count_on_cart;
}
public String getgreencartlogo() {
	return greencartlogo.getText();
}
public void getproductname() {
	
	for(int i=1;i<=productname.size();i++) {
		
		if(productname.get(i-1).getText().contains("Beans"))
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/h4")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/p")).getText());
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]/button")).click();
			break;
		}
	}
}

public void getproductsname(String product) {
	//for(int i=0;i<productname.size();i++)
		//System.out.println(productname.get(i).getText());
	System.out.println(product);
	for(int i=1;i<=productname.size();i++) {
		if(productname.get(i-1).getText().contains(product))
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/h4")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/p")).getText());
			
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]")).click();
			driver.findElement(By.xpath("//div["+i+"]/div[3]/button")).click();
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/div[3]")).click();
			break;
		}
	}
}
public void getmultipleitem() {
	String []multipleitem= {"Tomato","Potato","Onion","Pomegranate","Almonds"};
	//System.out.println(multipleitem);
	for(int i=1;i<=productname.size();i++) {
		String selecteditem=productname.get(i-1).getText().split("-")[0].trim();
		//System.out.println(selecteditem);
		List<String> itemsinlist=Arrays.asList(multipleitem);
		int count=0;
		if(itemsinlist.contains(selecteditem))
		{
			//,"Cashews"
			count++;
			//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/h4")).getText());
			//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div["+i+"]/p")).getText());
			driver.findElement(By.xpath("//div["+i+"]/div[3]/button")).click();
			if(count==multipleitem.length) {
				break;
			}
			
		}
	}
}

public void getsearchbox(String productshortname) {
	searchbox.sendKeys(productshortname);	
}

public String getproduct() {
	
	return product.getText();
}
public void clickoncart() {
	cart.click();
}

public String getcartcount() {
	return count_on_cart.getText();
}

}