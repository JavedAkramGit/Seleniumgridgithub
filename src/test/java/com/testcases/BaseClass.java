package com.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	
	
	
	
	@Parameters("browsertype")
	@BeforeClass
	public void setdriver(String browsertype) throws MalformedURLException
	{
		
		BrowserFactory.getInstance().setDriver(browsertype);
		driver = BrowserFactory.getInstance().getDriver();
		BrowserFactory.getInstance().setdriverproperties();
		System.out.println(Thread.currentThread().getId());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	@AfterClass
	public void teardown()
	{
		
		BrowserFactory.getInstance().closedriver();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
