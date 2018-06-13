package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pom.AccessoriesPage;
import com.craftsvilla.pom.CheckOutPage;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.KundanJewelleryPage;
import com.craftsvilla.pom.ProductDescriptionPage;

public class KundanJewelleryScripts extends BaseTest
{
	public HomePage homePage = null;
	public AccessoriesPage accessoriesPage = null;
	public KundanJewelleryPage kundanPage = null;
	public ProductDescriptionPage productPage = null;
	public CheckOutPage checkoutPage = null;
	
	@Test
	public void TC_01_BuyKundanPendant()
	{
		homePage = new HomePage(driver);
		accessoriesPage = new AccessoriesPage(driver);
		kundanPage = new KundanJewelleryPage(driver);
		productPage = new ProductDescriptionPage(driver);
		checkoutPage = new CheckOutPage(driver);
		
		try
		{
			homePage.goToAccessories();
			accessoriesPage.goToKundanJewellery();
			kundanPage.choosePendant();
			productPage.buyProduct();
			checkoutPage.enterEmail("abc@gmail.com");
			Assert.fail();
			checkoutPage.enterFirstName("abc");
			checkoutPage.verifyProduct();
		}
		catch(Exception e)
		{
			Reporter.log("Fail");
		}
		
	}

}
