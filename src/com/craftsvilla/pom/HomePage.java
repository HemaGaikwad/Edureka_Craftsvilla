package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
		//declaration
		@FindBy(xpath = "//a[text()='ACCESSORIES ']")
		private WebElement accessories;

		
		@FindBy(xpath = "//span[text()='Sign In']")
		private WebElement signIn;
		
		@FindBy(linkText = "CRAFTSVILLA BRANDS")
		private WebElement craftsvillaBrands;
		
		@FindBy(xpath = "//i[@class='icon first_arrow hidden-xs']")
		private WebElement account;
		
		@FindBy(xpath = "//i[@class='icon logout']")
		private WebElement logout;
		
		
	//initialization
	
		public HomePage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
	
	
	public void goToAccount()
	{
		verifyElementPresent(account);
		mouseHover(account);
	}
	
	public void logout()
	{
		verifyElementPresent(logout);
		logout.click();
	}
	
	//utilization
	public void goToAccessories()
	{
		verifyElementPresent(accessories);
		mouseHover(accessories);
		
	}
	
	public void clickSignIn()
	{
		verifyElementPresent(signIn);
		signIn.click();
	}
	
	public void goToCraftsVillaBrands()
	{
		verifyElementPresent(craftsvillaBrands);
		mouseHover(craftsvillaBrands);
	}
	
}
