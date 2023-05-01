package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber_rahul_greencart.pageobject.Automationprojectpage;
import cucumber_rahul_greencart.pageobject.Cartpage;
import cucumber_rahul_greencart.pageobject.Greencartproductpage;
import cucumber_rahul_greencart.pageobject.Homepage;
import cucumber_rahul_greencart.pageobject.Placeorderpage;
import cucumber_rahul_greencart.pageobject.Practicepage;
import cucumber_rahul_greencart.pageobject.Proceedpage;
import cucumber_rahul_greencart.pageobject.Registerpage;
import cucumber_rahul_greencart.pageobject.Thankyoushopping;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilis.Testsetup;
import utilis.WaitUtils;

public class Greencartwholescenario {
	Practicepagestepdefinition practicepagestep;
	Practicepage practicepage;
	Homepage homepage;
	Registerpage registerpage;
	Automationprojectpage automationprojectpage;
	Greencartproductpage greencartproductpage;
	Cartpage cartpage;
	Placeorderpage placeorderpage;
	Proceedpage proceedpage;
	Thankyoushopping thankyoushopping;
	Testsetup testsetup;
	WebDriver driver;

	public Greencartwholescenario(Testsetup testsetup) {
		this.testsetup = testsetup;
		this.practicepage = testsetup.pagemanager.getpracticepage();
		this.homepage = testsetup.pagemanager.gethomepage();
		this.registerpage = testsetup.pagemanager.getregisterpage();
		this.automationprojectpage = testsetup.pagemanager.getAutomationprojectpage();
		this.greencartproductpage = testsetup.pagemanager.getGreencartproductpage();
		this.cartpage = testsetup.pagemanager.getCartpage();
		this.placeorderpage = testsetup.pagemanager.getPlaceorderpage();
		this.proceedpage = testsetup.pagemanager.getProceedpage();
		this.thankyoushopping = testsetup.pagemanager.getThankyoushopping();
	}

	@Given("user is on rahulshetty greencart page")
	public void user_is_on_rahulshetty_greencart_page() throws IOException {
		driver = testsetup.basetest.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("greenkart page");

	}
	@When("user should click on add to cart button on {string} product")
	public void user_should_click_on_add_to_cart_button_on_product(String product) {
		greencartproductpage.getproductsname(product);
		//greencartproductpage.getproductname();
	}

	@Then("items present in greencart page should be increased")
	public void items_present_in_greencart_page_should_be_increased() {
		WaitUtils.explicitwait(driver, greencartproductpage.getCount_on_cart(), 5);
		System.out.println(greencartproductpage.getcartcount());
		if(greencartproductpage.getcartcount().contains("1")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	
	@When("user should click on the cart")
	public void user_should_click_on_the_cart() {
		greencartproductpage.clickoncart();
	}

	@Then("product {string} should added to the cart")
	public void product_should_added_to_the_cart(String string) {
		System.out.println(cartpage.getcartproduct());
		System.out.println(cartpage.getcartproduct().split("-")[0]);
		System.out.println(cartpage.getcartpageproductrate());
		if (cartpage.getcartproduct().split("-")[0].contains("Apple")) {

			System.out.println(cartpage.getcartpageproductrate());
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
		
	
	}
	@When("user click on proceed to checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		cartpage.getproceedtocheckout();
	}

	@Then("place order page should open")
	public void place_order_page_should_open() throws IOException {
		driver = testsetup.basetest.getDriver();
		//System.out.println(testsetup.basetest.callwebdriver().getTitle());
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.contains("veg and fruits")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	@Then("product is added to product table")
	public void product_is_added_to_product_table() {
		placeorderpage.getplaceorderproduct();
	}

	@When("^user click on place oredr button$")
	public void user_click_on_place_oredr_button() {
		placeorderpage.clickonplaceorder();
	}
	
	@Then("proceed page is open")
	public void proceed_page_should_open() throws IOException {
		driver = testsetup.basetest.getDriver();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.contains("veg and fruits")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}


	

	@Then("^choose country text is found$")
	public void select_country_text_is_found() {
		System.out.println(proceedpage.getchoosecountry());
		String chooseCountry=proceedpage.getchoosecountry();
		if(chooseCountry.contains("Choose Country")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

	@When("^user click on select country dropdown and select country from dropdown$")
	public void user_click_on_select_country_dropdown_and_select_country_from_dropdown() {
		proceedpage.getselectcounrtydropdown();
	}

	@When("^check the term and condition chekboxes$")
	public void check_the_term_and_condition_chekboxes() {
		proceedpage.gettermandconditioncheckbox();
	}

	@When("^click on proceed button$")
	public void click_on_proceed_button() {
		proceedpage.getproceedbutton();
	}

	@Then("^order should be placed$")
	public void order_should_be_placed() throws IOException {
		//driver = testsetup.basetest.callwebdriver();
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title=testsetup.basetest.callwebdriver().getTitle();
		if(title.contains("veg and fruits")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	@When("order is placed")
	public void order_is_placed() {
		System.out.println("order is placed");
	    
	}

	@Then("thank you for shopping page is open")
	public void thank_you_for_shopping_page_is_open() throws IOException {
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title=testsetup.basetest.callwebdriver().getTitle();
		if(title.contains("veg and fruits")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

	@Then("^thank you msg is displayed$")
	public void thank_you_msg_is_displayed() throws Throwable {
		System.out.println(thankyoushopping.getthanyoumsg());
		String thank_you=thankyoushopping.getthanyoumsg();
		if(thank_you.contains("placed successfully")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}











}
