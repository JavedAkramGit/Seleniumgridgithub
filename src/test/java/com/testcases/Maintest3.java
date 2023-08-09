package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.Allurelistener;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testcases.*;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({Allurelistener.class})
public class Maintest3 extends BaseClass {
	
	
	
	
	
	
	
	
	
	@Test(priority=1,description="Test to check Bing site")
	@Description("Check Bing functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 3: Check Bing")
	@Story("Story 1:Check Header")
	@Step("Valid Header")
	@Severity(SeverityLevel.BLOCKER)
	public void checkbing()
	{
		String title = "Bing";
		driver.get("https://www.bing.com");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	@Test(priority=2,description="Test to check Bing site")
	@Description("Check Bing functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 3: Check Bing")
	@Story("Story 2:Check Header")
	@Step("Valid Bing Header")
	@Severity(SeverityLevel.BLOCKER)
	public void checkbingtwo()
	{
		String title = "Bing";
		driver.get("https://www.bing.com");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}