package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AcessoriesStationary;
import com.pages.HomeClothes;

public class AccesoryTest extends BaseClass {
	AcessoriesStationary ac= null;
	@BeforeSuite
	public void setup()
	{
		initialization();
		reportInit();
		ac= new AcessoriesStationary(driver);
	}
	@Test
	public void test01() throws InterruptedException
	{
		ac.proceedacc();
		
	}


}


