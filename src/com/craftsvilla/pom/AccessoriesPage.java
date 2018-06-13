package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class AccessoriesPage extends BasePage
{
	
	public AccessoriesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText  = "Kundan Jewellery")
	private WebElement kundanJewellery;
	
	@FindBy(linkText = "Temple Jewellery")
	private WebElement templeJewellery;
	
	@FindBy(linkText = "Watches")
	private WebElement watches;
	
	
	public void goToKundanJewellery()
	{
		verifyElementPresent(kundanJewellery);
		kundanJewellery.click();
	}
	
	public void goToTempleJewellery()
	{
		verifyElementPresent(templeJewellery);
		templeJewellery.click();
	}
	
	public void goToWatches()
	{
		verifyElementPresent(watches);
		watches.click();
	}
	

}
