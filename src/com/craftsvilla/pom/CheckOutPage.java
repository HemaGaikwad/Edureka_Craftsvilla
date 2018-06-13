package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.craftsvilla.generic.BasePage;

public class CheckOutPage extends BasePage
{
	
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "address-email")
	private WebElement address;
	
	@FindBy(id = "address-first-name")
	private WebElement firstName;
	
	@FindBy(xpath = "//p[contains(text(),'Gold Plated Traditional Kundan')]")
	private WebElement product;
	
	
	public void enterEmail(String email)
	{
		verifyElementPresent(address);
		address.sendKeys(email);
		
	}
	
	public void enterFirstName(String fname)
	{
		verifyElementPresent(firstName);
		firstName.sendKeys(fname);
	}
	
	public void verifyProduct()
	{
		verifyElementPresent(product);
		String exp_name = "Craftsvilla Royal Designer Gold Plated Traditional Kundan";
		String productName = product.getText();
		Assert.assertEquals(productName, exp_name);
		
	}
	
	

}
