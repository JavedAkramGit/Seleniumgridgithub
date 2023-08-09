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
public class Maintest2 extends BaseClass {
	
	
	
	
	
	
	
	
	@Test(priority=1,description="Test to check Google site")
	@Description("Check Google functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 2: Check Website")
	@Story("Story 1:Check Header")
	@Step("Valid Header")
	@Severity(SeverityLevel.MINOR)
	public void checkgoogle()
	{
		String title = "Google1";
		driver.get("https://www.google.com");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	@Test(priority=1,description="Test to check Google site")
	@Description("Check Google functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 2: Check Website")
	@Story("Story 2:Check Header again")
	@Step("InValid Header")
	@Severity(SeverityLevel.CRITICAL)
	public void checkgoogletwo()
	{
		String title = "Google1";
		driver.get("https://www.google.com");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
