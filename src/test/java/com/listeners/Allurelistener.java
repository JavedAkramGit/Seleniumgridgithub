package com.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testcases.*;
import io.qameta.allure.Attachment;

public class Allurelistener implements ITestListener {
	
	
	private static String gettestname(ITestResult result)
	{
		
		
		return result.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment 
	public static byte[] addattchment(WebDriver driver)
	{
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		byte[] attachment = scrShot.getScreenshotAs(OutputType.BYTES);
		 return attachment;
		
	}
	@Attachment(value = "{0}", type = "text/plain")
	public static String savelogmessage(String message)
	{
		
		return message;
	}
	
	
	 @Override		
	    public void onFinish(ITestContext context) {		
		 
		 System.out.println("The test finished is " + context.getName());
	       			
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext context) {	
	    	
	    	System.out.println("The test started is " + context.getName());
	    	context.setAttribute("WebDriver", BrowserFactory.getInstance().getDriver());
	        			
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        			
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult result) {	
	    	
	    	Object TestClass = result.getInstance();
	    	
	    	WebDriver driver = BrowserFactory.getInstance().getDriver();
	    	
	    	if(driver instanceof WebDriver)
	    	{
	    		
	    		System.out.println("The test failed is " +gettestname(result) );
	    		addattchment(driver);
	    	}
	    	
	    	savelogmessage("The screenshot has been taken for " +gettestname(result) );
	    	
	    
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	      			
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	     			
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	       
	
	
	
	
	    }
	

}
