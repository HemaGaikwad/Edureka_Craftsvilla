package com.craftsvilla.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
	
	public WebDriver driver= null;
	

	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			
			String act_title = driver.getTitle();
			Assert.assertEquals(act_title, exp_title);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail");
		}
	}
	
	
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log(ele+ " element found");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log(ele + " not found");
			// TODO: handle exception
		}
		
	}
	
	
	public void mouseHover(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Unable to mouse hover on " +ele );
		}
		
	}
	
	
	public void handleAlert()
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			Reporter.log("No alerts found to switch");
		}
	}
	
		public void handleDropDown(WebElement ele, String option)
		{
			
		}
	
	

}
