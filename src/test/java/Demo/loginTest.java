package Demo;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class loginTest extends BrowserInitialization {	
	
	
	@Test
	public void logintest()
	{
		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);	
		
		
		obj.validData("Admin1", "admin123");		
		
	}
	@AfterMethod
	public void testcaseresult(ITestResult result ) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			
			TakesScreenshot t= (TakesScreenshot)driver;
			File f= t.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(f ,new File("D:/Anuja/Selenium screenshot/" +result.getName()+ ".jpg") );
		}
	}
	
	
	/* public static void screenshot (String name) throws IOException
		{
			TakesScreenshot t= (TakesScreenshot)driver;
			File f= t.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(f ,new File("D:/Anuja/Selenium screenshot/" +name+ ".jpg") );
		}
	*/
}

