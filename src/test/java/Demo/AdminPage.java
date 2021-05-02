
package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AdminPage {
	//  

	@FindBy(xpath="//div[@id=\"mainMenu\"]/ul/li/a[@id=\"menu_admin_viewAdminModule\"]")
	WebElement adminbtn;
	
	
	public void adminClick()
	{
		adminbtn.click();
	}
	
	
}
