package Demo;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id ="txtUsername")
	WebElement unametxt;
	
	@FindBy(name="txtPassword")
	WebElement passtxt;
	
	
	@FindBy(id ="btnLogin")
	WebElement loginBtn;
	

	public void validData(String uname , String pass)
	{
		unametxt.clear();
		unametxt.sendKeys(uname);
		
		passtxt.clear();
		passtxt.sendKeys(pass);
		
		loginBtn.click();
		
	}
	
	public void invalidData(String uname , String pass)
	{
		unametxt.clear();
		unametxt.sendKeys(uname);
		
		passtxt.clear();
		passtxt.sendKeys(pass);

	    loginBtn.click();
	}
}
