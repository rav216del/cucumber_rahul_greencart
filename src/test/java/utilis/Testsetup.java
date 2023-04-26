package utilis;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber_rahul_greencart.pageobject.Pagemanager;
import stepdefinitions.Practicepagestepdefinition;

public class Testsetup {

	WebDriver driver;
	Practicepagestepdefinition practicepagestep;
	public Pagemanager pagemanager;
	public Basetest basetest;
	public Allfunctionutility allfunctionutility;

	public Testsetup() throws IOException {
		basetest = new Basetest();
		pagemanager = new Pagemanager(basetest.callwebdriver());
		allfunctionutility = new Allfunctionutility(basetest.callwebdriver());
	}

}
