package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomeClothes;

public class HomeTest extends BaseClass{
	HomeClothes hc= null;
	@BeforeSuite
	public void setup()
	{
		initialization();
		reportInit();
	
		hc= new HomeClothes(driver);
	}
	@Test
	public void test01()
	{
		//lp.loginToApplication();
		//Assert.assertEquals(driver.getTitle(), "My Store");
		hc.productselect();
		
	}


}

