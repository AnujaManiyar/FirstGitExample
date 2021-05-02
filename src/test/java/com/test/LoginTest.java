package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Demo.BrowserInitialization;
import Demo.LoginPage;


public class LoginTest extends BrowserInitialization{
	
	@Test(priority=0)
	public void loginTest() throws InterruptedException
	{
		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);		
		obj.validData("Admin", "admin123");	
		
		Thread.sleep(5000);
	}
	
	

}
