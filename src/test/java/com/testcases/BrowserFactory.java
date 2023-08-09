package com.testcases;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
public class BrowserFactory {
	
	
	
	private BrowserFactory() {}
	
	
	private static BrowserFactory instance = new BrowserFactory();
	
	
	
	public static BrowserFactory getInstance()
	{
		
		
		return instance;
		
	}
	
	
	
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	
	
	public static void setDriver(String browsertype) throws MalformedURLException
	{
		
		
		if(browsertype.equalsIgnoreCase("chrome"))
		{
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");
			options.setPlatformName("LINUX");
			//driver.set(new ChromeDriver(options));
			driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));
			
			
			
			
			
			
		}
		
		else if(browsertype.equalsIgnoreCase("edge"))
		{
			
			
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			options.setPlatformName("LINUX");
			options.addArguments("--disable-dev-shm-usage");
			//driver.set(new EdgeDriver(options));
			driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));
			
			
			
			
			
			
		}
		
		
		else if(browsertype.equalsIgnoreCase("firefox"))
		{
			
			
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			options.setPlatformName("LINUX");
			//driver.set(new FirefoxDriver(options));
			driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options));
			
			
			
			
			
			
		}
		
		
		

		
		
		
	}
	
	
	
	
	
	public static synchronized WebDriver getDriver()
	{
		
		return driver.get();
	}
	
	
	public static void closedriver()
	{
		
		getDriver().close();
		driver.remove();
		
		
	}
	
	
	public static void setdriverproperties()
	{
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
