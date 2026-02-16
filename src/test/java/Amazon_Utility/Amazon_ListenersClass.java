package Amazon_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Amazon_ListenersClass implements ITestListener{
	public WebDriver driver;
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Screenshots taken-pass");
		TakesScreenshot ts=  (TakesScreenshot) driver;
	    File source=         ts.getScreenshotAs(OutputType.FILE);//step 2
	    //Using Math.random method
 	    File destination=new File("E:\\Selenium setup\\workspace\\Maven-AmazonProject\\Screenshots\\pass"+Math.random()+".png");
 	   try {
		FileHandler.copy(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Screenshots taken-fail");
		TakesScreenshot ts=	(TakesScreenshot) driver;
		File source=	ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Selenium setup\\workspace\\Maven-AmazonProject\\Screenshots\\fail"+Math.random()+".png");
		
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
