
package com.test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Demo.AdminPage;
import Demo.BrowserInitialization;

public class AdminTest extends BrowserInitialization {


	@Test(priority=1)
	public void adminClick() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Admin page");
		AdminPage ad = PageFactory.initElements(driver, AdminPage.class);
		ad.adminClick();
		
		Thread.sleep(4000);
	}

}
