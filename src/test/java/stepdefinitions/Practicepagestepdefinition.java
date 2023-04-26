package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import cucumber_rahul_greencart.pageobject.Automationprojectpage;
import cucumber_rahul_greencart.pageobject.Greencartproductpage;
import cucumber_rahul_greencart.pageobject.Homepage;
import cucumber_rahul_greencart.pageobject.Practicepage;
import cucumber_rahul_greencart.pageobject.Registerpage;
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
	Testsetup testsetup;

	public Practicepagestepdefinition(Testsetup testsetup) {
		this.testsetup = testsetup;
		this.practicepage = testsetup.pagemanager.getpracticepage();
		this.homepage = testsetup.pagemanager.gethomepage();
		this.registerpage = testsetup.pagemanager.getregisterpage();
		this.automationprojectpage = testsetup.pagemanager.getAutomationprojectpage();
		this.greencartproductpage= testsetup.pagemanager.getGreencartproductpage();
	}

	@Given("user is on rahullshetty home page")
	public void user_is_on_rahullshetty_home_page() {
		System.out.println("home page");

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

	@When("user click on autoamation practice1")
	public void user_click_on_autoamation_practice1() {
	automationprojectpage.clickonautomationpracticelink1();
	
	}
	
	@Then("Greenkart product page is open")
	public void greenkart_product_page_is_open() throws IOException {
		String exp_title="GreenKart - veg and fruits kart";
		String act_title=testsetup.basetest.callwebdriver().getTitle();
		System.out.println(act_title);
		Assert.assertEquals(exp_title, act_title);
		
	}
	@Then("logo is found {string}")
	public void logo_is_found(String greencartpaglogo) {
		Assert.assertTrue(greencartproductpage.getgreencartlogo().equalsIgnoreCase(greencartpaglogo));
		greencartproductpage.getproductname();
	}

}
