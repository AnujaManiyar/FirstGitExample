package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends loginTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("***** Error "+result.getName()+" test has passed *****");
		try {
		testcaseresult(result );
		}
		catch(Exception e) {
			System.out.println("test passed ");}
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("***** Error "+result.getName()+" test has failed *****");
		try {
		testcaseresult(result);	
		}
		catch(Exception e) {
			System.out.println("test failed ");}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
