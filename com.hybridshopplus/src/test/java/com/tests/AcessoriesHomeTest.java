package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AcessoriesHome;

public class AcessoriesHomeTest extends BaseClass {
	AcessoriesHome ac= null;
	@BeforeSuite
	public void setup()
	{
		initialization();
		reportInit();
		//lp= new LoginPage(driver);
		ac= new AcessoriesHome (driver);
	}
	@Test
	public void test01() throws InterruptedException
	{
		ac.homeacces();
		
	}


}
