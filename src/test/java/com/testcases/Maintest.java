package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.Allurelistener;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
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
public class Maintest extends BaseClass {
	
	
	
	
	
	
	
	
	@Test(priority=1,description="Test to check HRDF site")
	@Description("Check HRDF functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 1: Check Website")
	@Story("Story 1:Check Login")
	@Step("Valid Login")
	@Severity(SeverityLevel.TRIVIAL)
	public void checkhrdf()
	{
		String title = "صندوق تنمية الموارد البشرية – هدف";
		driver.get("https://www.hrdf.org.sa/Home");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	@Test(priority=2,description="Second Test to check HRDF site")
	@Description("Check HRDF functinality")
	@Epic("EP001:SelfService")
	@Feature("Feature 1: Check Website")
	@Story("Story 2:Check Second Login")
	@Step("InValid Login")
	@Severity(SeverityLevel.NORMAL)
	public void checkhrdftwo()
	{
		String title = "صندوق تنمية الموارد البشرية – هدف";
		driver.get("https://www.hrdf.org.sa/Home");
		AssertJUnit.assertEquals(driver.getTitle(), title);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
