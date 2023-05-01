package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
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
import io.cucumber.java.en.*;
import utilis.Constant;
import utilis.Testsetup;

public class Practicepagestepdefinition {

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

	public Practicepagestepdefinition(Testsetup testsetup) {
		this.testsetup = testsetup;
		this.practicepage = testsetup.pagemanager.getpracticepage();
		this.homepage = testsetup.pagemanager.gethomepage();
		this.registerpage = testsetup.pagemanager.getregisterpage();
		this.automationprojectpage = testsetup.pagemanager.getAutomationprojectpage();
		this.greencartproductpage = testsetup.pagemanager.getGreencartproductpage();
		this.cartpage = testsetup.pagemanager.getCartpage();
		this.placeorderpage = testsetup.pagemanager.getPlaceorderpage();
		this.proceedpage=testsetup.pagemanager.getProceedpage();
		this.thankyoushopping=testsetup.pagemanager.getThankyoushopping();
	}

	@Given("user is on rahullshetty home page")
	public void user_is_on_rahullshetty_home_page() throws IOException {
		driver = testsetup.basetest.callwebdriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("home page");

	}

	@When("user click on practice page link")
	public void user_click_on_practice_page_link() {
		System.out.println("clicking the practice page link");
		homepage.clickonhomepagepracticelink();
	}

	@Then("user move towards register page")
	public void user_move_towards_register_page() throws IOException {
		String act_title = testsetup.basetest.callwebdriver().getTitle();
		System.out.println(act_title);
		// String exp_title="[Improve Your Skill - Use our Practice Sites & Apps for
		// your QA Automation | Rahul Shetty Academy]";

		String exp_title = Constant.EXP_TITLE;
		Assert.assertEquals(act_title, exp_title);
	}

	@Then("validate {string} text on register page")
	public void validate_text_on_register_page(String registerpageexp_text) {
		Assert.assertTrue(registerpage.registerpagetext().equalsIgnoreCase(registerpageexp_text));
	}

	@Given("user is on rahul shetty register page")
	public void user_is_on_rahul_shetty_register_page() throws IOException {
		driver = testsetup.basetest.callwebdriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("register page");
	}

	@When("user gives name as {string} and email as{string}")
	public void user_gives_name_as_and_email_as_ravdel216gmail_com(String name, String email) {
		registerpage.usernameandpassword(name, email);

	}

	@When("select the check box")
	public void select_the_check_box() {
		registerpage.checkbox();
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		registerpage.clickonsubmitbuton();
	}

	@Then("validate automation project page is open")
	public void validate_automation_practice_page_is_open() throws IOException {
		String act_title = testsetup.basetest.callwebdriver().getTitle();
		System.out.println(act_title);
		String exp_title = Constant.EXP_TITLE;

		Assert.assertEquals(act_title, exp_title);
	}

	@Then("validate {string} text is found")
	public void validate_text_is_found(String ourprojecttext) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(automationprojectpage.getourprojecttext());
		// Assert.assertTrue(automationprojectpage.getourprojecttext().equalsIgnoreCase(ourprojecttext));
	}

	@Given("user is on rahul shetty automationpage")
	public void user_is_on_rahul_shetty_automationpage() throws IOException {
		driver = testsetup.basetest.callwebdriver();
		driver.get("https://rahulshettyacademy.com/practice-project");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("automation page");
	}

	@When("user click on autoamation practice1")
	public void user_click_on_autoamation_practice1() {
		automationprojectpage.clickonautomationpracticelink1();

	}

	@Then("Greenkart product page is open")
	public void greenkart_product_page_is_open() throws IOException {
		String exp_title = "GreenKart - veg and fruits kart";
		String act_title = testsetup.basetest.callwebdriver().getTitle();
		System.out.println(act_title);
		Assert.assertEquals(exp_title, act_title);

	}

	@Then("logo is found {string}")
	public void logo_is_found(String greencartpaglogo) {
		Assert.assertTrue(greencartproductpage.getgreencartlogo().equalsIgnoreCase(greencartpaglogo));
		greencartproductpage.getproductname();
	}

	/*@Given("user is on rahulshetty greencart page")
	public void user_is_on_rahulshetty_greencart_page() throws IOException {
		driver = testsetup.basetest.callwebdriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("greenkart page");

	}

	@When("user search for {string} with {string}")
	public void user_search_for_with(String string, String shortname) {
		greencartproductpage.getsearchbox(shortname);
	}

	@Then("searched {string} is found on greencartpage")
	public void searched_is_found_on_greencartpage(String string) {
		System.out.println(greencartproductpage.getproduct());
		if (greencartproductpage.getproduct().split("-")[0].trim().contains("Mango")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);

		/*
		 * if (greencartproductpage.getproduct().split("-")[0].trim().contains("Mango"))
		 * {
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "p[class='product-price']")).getText());
		 * driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		 * 
		 * }
		 */

	//}

	/*@When("user click on add to cart button on {string} product")
	public void user_click_on_add_to_cart_button_on_product(String product) {
		// greencartproductpage.getproductnamemango(product);
		greencartproductpage.getproductname();
	}

	@When("^click on the cart$")
	public void click_on_the_cart() throws Throwable {
		greencartproductpage.clickoncart();
	}

	/*
	 * @Then("product {String}is added to the cart") public void
	 * mango_is_added_to_the_cart(String product) {
	 * System.out.println(cartpage.getcartproduct());
	 * if(cartpage.getcartproduct().split("-")[0].contains(product)) {
	 * 
	 * System.out.println(cartpage.getcartpageproductrate()); }
	 * 
	 * }
	 
	@Then("product \"Mango\"is added to the cart")
	public void product_mango_is_added_to_the_cart() {
		System.out.println(cartpage.getcartproduct());
		if (cartpage.getcartproduct().split("-")[0].contains("Tomato")) {

			System.out.println(cartpage.getcartpageproductrate());
		}
		System.out.println(cartpage.getcartproduct().split("-")[0]);
		System.out.println(cartpage.getcartpageproductrate());
	}

	@When("^user click on proceed to checkout $")
	public void user_click_on_proceed_to_checkout() {
		cartpage.getproceedtocheckout();
	}

	@Then("^place order page is open $")
	public void place_order_page_is_open() throws IOException {
		driver = testsetup.basetest.callwebdriver();
		System.out.println(driver.getTitle());

	}

    @Then("^product is added to table$")
    public void product_is_added_to_table()  {
        placeorderpage.getplaceorderproduct();
    }
    
    @When("^user click on place oredr button$")
    public void user_click_on_place_oredr_button() {
       placeorderpage.clickonplaceorder();
    }
    @Then("^proceed page is open $")
    public void proceed_page_is_open() throws IOException  {
    	driver = testsetup.basetest.callwebdriver();
		System.out.println(driver.getTitle());
    }
    @Then("^choose country text is found$")
    public void select_country_text_is_found()  {
     System.out.println(proceedpage.getchoosecountry());
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
    public void click_on_proceed_button()  {
    	proceedpage.getproceedbutton();
    }

    @Then("^order should be placed$")
    public void order_should_be_placed() throws IOException {
    	driver = testsetup.basetest.callwebdriver();
    	System.out.println(driver.getTitle());
    }

    @Then("^thank you msg is displayed$")
    public void thank_you_msg_is_displayed() throws Throwable {
    	thankyoushopping.getthanyoumsg();
    }*/
    
    
    
    

	@When("user click on add to cart button on desired {string}")
	public void user_click_on_add_to_cart_button_on_desired(String string) {

	}

	@Then("{string} is added to the cart")
	public void is_added_to_the_cart(String string) {

	}

}
