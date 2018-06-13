package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SignInPage extends BasePage
{
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "emailId")
	private WebElement email;
	
	@FindBy(id = "continueBtn")
	private WebElement continuebtn;
	
	@FindBy(id = "set-password")
	private WebElement setPwd;
	
	@FindBy(xpath = "//div[text()='Register']")
	private WebElement registerBtn;
	
	@FindBy(xpath ="//label[@for='term-checkbox']")
	private WebElement terms;


	
	public void enterEmail(String emailAddress)
	{
		verifyElementPresent(email);
		email.sendKeys(emailAddress);
	}
	
	public void enterNewPassword(String pwd)
	{
		verifyElementPresent(setPwd);
		setPwd.sendKeys(pwd);
	}
	
	public void clickContinue()
	{
		verifyElementPresent(continuebtn);
		continuebtn.click();
	}
	
	public void register()
	{
		verifyElementPresent(registerBtn);
		registerBtn.click();
	}
	
	public void clickCheckBox()
	{
		verifyElementPresent(terms);
		terms.click();
	}
	
	
	
	
}
