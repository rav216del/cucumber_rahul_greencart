package stepdefinitions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
import io.cucumber.java.en.*;
import utilis.Testsetup;

public class Greencartmultiitemchoose {
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
	// public static WebDriver driver;

	public Greencartmultiitemchoose(Testsetup testsetup) {
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
	@Given("user is on rahulshetty greencarts home page")
	public void user_is_on_rahulshetty_greencarts_home_page() {
		System.out.print("greenkart page");
	}

	@When("user should click on add to cart button on multiple product")
	public void user_should_click_on_add_to_cart_button_on_multiple_product() {
		greencartproductpage.getmultipleitem();
	}

	@Then("items present in greencart home page should be increased")
	public void items_present_in_greencart_home_page_should_be_increased() {
		System.out.println(greencartproductpage.getcartcount());
		if (greencartproductpage.getcartcount().contains("5")) {
			Assert.assertTrue(true, "total items contain in cart is passed");
		} else
			Assert.assertTrue(false, "total items contain in cart is failed");
	}

	@When("user should click  on the cart")
	public void user_should_click_on_the_cart() {
		greencartproductpage.clickoncart();
	}

	@Then("multiple product should added to the cart")
	public void multiple_product_should_added_to_the_cart() {
		List<String> addeditem=cartpage.getmultiplecartproduct();
		for(int i=0;i<addeditem.size();i++) {
			String itemrequired=addeditem.get(i).split("-")[0].trim();
		
		String []multipleitem= {"Tomato","Potato","Onion","Pomegranate","Almonds"};
		List<String> multipleitemlist=Arrays.asList(multipleitem);
		if(multipleitemlist.contains(itemrequired)) {
			Assert.assertTrue(true);
			}
		else
			Assert.assertTrue(false);
		}
		//,"Cashews"
		/*Iterator<String>it =addeditem.iterator();
		while(it.hasNext()) {
			String outputitem=it.next();
			for(int i=0;i<multipleitem.length;i++) {
				if(outputitem.contains(multipleitem[i])) {
					
				
					System.out.println("item verified"+outputitem);
					continue;
			}
				
		}Assert.assertTrue(true);
			}*/
		
		
	}

	@When("user click  on proceed to checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		cartpage.getproceedtocheckout();
	}

	@Then("place order  page should open")
	public void place_order_page_should_open() throws IOException {
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title = testsetup.basetest.callwebdriver().getTitle();
		if (title.contains("veg and fruits")) {
			Assert.assertTrue(true,"title matched in order page is passed");
		} else
			Assert.assertTrue(false,"title matched in order page is failed");
	}

	@Then("multiple product is added to product table")
	public void multiple_product_is_added_to_product_table() {
		List<String> iteminproductpage=placeorderpage.getplaceorderproduct();
		for(int i=0;i<iteminproductpage.size();i++) {
			String itempresent=iteminproductpage.get(i);
		String []multipleitem= {"Tomato","Potato","Onion","Pomegranate","Almonds"};
		List<String>multipleiteminlist=Arrays.asList(multipleitem);
		if(multipleiteminlist.contains(itempresent)) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
		
		}
	}
	
	@When("^user enter the promocode\"([^\"]*)\" in promocode textbox$")
    public void user_enter_the_promocodesomething_in_promocode_textbox(String rahulshettyacademy) {
		placeorderpage.getpromoCodetextbox(rahulshettyacademy);
    }

	
	@When("click on applybutton")
	public void click_on_applybutton() {
		placeorderpage.getpromocodeapplybutton();
	}

	@Then("text {string} is found")
	public void text_is_found(String code) {
		//testsetup.allfunctionutility.explicitwait(codeapplied, 5);
		System.out.println(placeorderpage.getcodeapplied());
		if(placeorderpage.getcodeapplied().contains(code)) {
			Assert.assertTrue(true,"code applied is passed");
		}
		else
			Assert.assertTrue(false,"code applied is failed");
	}

	@When("text {string} is  found there")
	public void text_is_founds(String code) {
		placeorderpage.getcodeapplied().contains(code) ;
		System.out.println("applied code is found");
	}

	@Then("total amount {string} is found")
	public void total_amount_is_found(String amount) {
		if(placeorderpage.gettotalamount().contains(amount)) {
			Assert.assertTrue(true,"total amount before is passed");
		}
		else
			Assert.assertTrue(false, "total amount before is failed");
	}

	@Then("discount {string} is found")
	public void discount_is_found(String discount) {
		if(placeorderpage.getdiscount().contains(discount)) {
			Assert.assertTrue(true, "discount found is passed");
			
		}
		else
			Assert.assertTrue(false, "discount found is passed");
	}

	@When("discount {string} is found there")
	public void discount_is_founds(String discount) {
		placeorderpage.getdiscount().contains(discount);
		System.out.println("discount is avilable");
	}

	@Then("total amount after discount {string} is found")
	public void total_amount_after_discount_is_found(String amountafterdiscount) {
		if(placeorderpage.getTotalAmountAfterDiscount().contains(amountafterdiscount)) {
		Assert.assertTrue(true, "amount after discount is passed");
	}
	else
		Assert.assertTrue(false, "amount after discount is failed");
	}	

	@When("user click  on place oredr button")
	public void user_click_on_place_oredr_button() {
		placeorderpage.clickonplaceorder();
	}

	@Then("proceed page  is open")
	public void proceed_page_is_open() throws IOException {
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title = testsetup.basetest.callwebdriver().getTitle();
		if (title.contains("veg and fruits")) {
			Assert.assertTrue(true,"proceed page title is passed");
		} else
			Assert.assertTrue(false,"proceed page title is failed");
	}

	@Then("choose country  text is found")
	public void choose_country_text_is_found() {
		System.out.println(proceedpage.getchoosecountry());
		String chooseCountry = proceedpage.getchoosecountry();
		if (chooseCountry.contains("Choose Country")) {
			Assert.assertTrue(true,"choose country is passed");
		} else
			Assert.assertTrue(false,"choose country is failed");
	}

	@When("user click on select country  dropdown and select country from dropdown")
	public void user_click_on_select_country_dropdown_and_select_country_from_dropdown() {
		proceedpage.getselectcounrtydropdown();
	}

	@When("check the term and  condition chekboxes")
	public void check_the_term_and_condition_chekboxes() {
		proceedpage.gettermandconditioncheckbox();
	}

	@When("click on  proceed button")
	public void click_on_proceed_button() {
		proceedpage.getproceedbutton();
	}

	@Then("order  should be placed")
	public void order_should_be_placed() throws IOException {
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title = testsetup.basetest.callwebdriver().getTitle();
		if (title.contains("veg and fruits")) {
			Assert.assertTrue(true,"order page title is passed");
		} else
			Assert.assertTrue(false,"order page title is failed");
	}

	@When("order  is placed")
	public void order_is_placed() {
		System.out.println("order is placed");
	}

	@Then("thank you  for shopping page is open")
	public void thank_you_for_shopping_page_is_open() throws IOException {
		System.out.println(testsetup.basetest.callwebdriver().getTitle());
		String title = testsetup.basetest.callwebdriver().getTitle();
		if (title.contains("veg and fruits")) {
			Assert.assertTrue(true,"thank you title is passed");
		} else
			Assert.assertTrue(false,"thank you title is failed");
	}

	@Then("thank you message is displayed")
	public void thank_you_message_is_displayed() {
		System.out.println(thankyoushopping.getthanyoumsg());
		String thank_you = thankyoushopping.getthanyoumsg();
		if (thank_you.contains("placed successfully")) {
			Assert.assertTrue(true,"thank you is displayed is passed");
		} else
			Assert.assertTrue(false,"thank you is displayed is failed");
	}

}
