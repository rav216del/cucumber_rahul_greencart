package stepdefinitions;

import cucumber_rahul_greencart.pageobject.Orderpage;

import utilis.Testsetup;

public class Orderpagestepdefinition {

	Orderpagestepdefinition orderpagestepdefinition;
	Testsetup testsetup;
	Orderpage orderpage;

	public Orderpagestepdefinition(Testsetup testsetup) {
		this.testsetup = testsetup;
		this.orderpage = testsetup.pagemanager.getorderpage();
	}

}
