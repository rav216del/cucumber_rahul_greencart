package cucumber_rahul_greencart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagemanager {
	Homepage homepage;
	Orderpage orderpage;
	Registerpage registerpage;
	Practicepage practicepage;
	Automationprojectpage automationprojectpage;
	Greencartproductpage greencartproductpage;
	Cartpage cartpage;
	Placeorderpage placeorderpage;
	Proceedpage proceedpage;
	Thankyoushopping thankyoushopping;
	WebDriver driver;
	public Pagemanager(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public Homepage gethomepage() {
	 homepage= new Homepage(driver);
	 return homepage;
	}
	
	public Orderpage getorderpage() {
		 orderpage = new Orderpage(driver);
		 return orderpage;
	}
	
	public Registerpage getregisterpage() {
		 registerpage = new Registerpage(driver);
		 return registerpage ;
	}
	
	public Practicepage getpracticepage() {
		 practicepage = new Practicepage(driver);
		 return practicepage;
	}
	public Automationprojectpage getAutomationprojectpage() {
		automationprojectpage= new Automationprojectpage(driver);
		return automationprojectpage;
	}
	public Greencartproductpage getGreencartproductpage() {
		 greencartproductpage= new Greencartproductpage(driver);
		 return greencartproductpage;
	}
	public Cartpage getCartpage() {
		cartpage= new Cartpage(driver);
		return cartpage;
		
	}
	public Placeorderpage getPlaceorderpage() {
		placeorderpage= new Placeorderpage(driver);
		return placeorderpage;
	}
	public Proceedpage getProceedpage() {
		proceedpage= new Proceedpage(driver);
		return proceedpage;
	}
	
	public Thankyoushopping getThankyoushopping() {
		thankyoushopping = new Thankyoushopping(driver);
		return thankyoushopping;
	}
	
	
	
	

}
