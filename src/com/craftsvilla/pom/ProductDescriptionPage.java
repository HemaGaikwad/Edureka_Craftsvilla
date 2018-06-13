package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.craftsvilla.generic.BasePage;

public class ProductDescriptionPage extends BasePage
{
	
	public ProductDescriptionPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Gold Plated Traditional Kundan')]")
	private WebElement productName;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(id = "buynow")
	private WebElement buyNow;
	
	
	public void verifyProductName()
	{
		verifyElementPresent(productName);
		String exp_product = "Craftsvilla Royal Designer Gold Plated Traditional Kundan";
		String prdName = productName.getText();
		Assert.assertEquals(prdName, exp_product);
		
	}
	
	
	public void buyProduct()
	{
		verifyElementPresent(buyNow);
		buyNow.click();
	}
	

}
