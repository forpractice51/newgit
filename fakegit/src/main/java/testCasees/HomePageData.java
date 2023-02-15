package testCasees;


import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageData  {
	
	HomePage hp=new HomePage();
	@Test
	public void productSetup() 
	{

		hp.productFilter();
		hp.productLowToHigh();
		hp.selectProduct();
		hp.addToCart();
		hp.backToProduct();
		hp.clickOnMenu();
		hp.clickOnCross();
	}
	

}
