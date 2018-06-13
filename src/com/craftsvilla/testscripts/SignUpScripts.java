package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.SignInPage;

public class SignUpScripts extends BaseTest
{
	public HomePage hp = null;
	public SignInPage sp = null;
	
	@Test
	public void registerUser()
	{
		hp = new HomePage(driver);
		sp = new SignInPage(driver);
		
		String[][] credentials = ReadExcel.getData(filePath, "New_User");
		System.out.println(credentials.length);
	for(int i = 1; i<credentials.length; i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
			hp.clickSignIn();
			sp.enterEmail(email);
			sp.clickContinue();
			sp.enterNewPassword(password);
			sp.clickCheckBox();
			sp.clickCheckBox();
			sp.register();
			hp.goToAccount();
			hp.logout();
		
			
		}
	}

}
