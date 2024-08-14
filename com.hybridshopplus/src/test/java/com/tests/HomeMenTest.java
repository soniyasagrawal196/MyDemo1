package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomeMenClothes;

  public class HomeMenTest extends BaseClass {
	HomeMenClothes hm= null;
	@BeforeSuite
	public void setup()
	{
		initialization();
		reportInit();
		//lp= new LoginPage(driver);
		hm= new HomeMenClothes(driver);
	}
	@Test
	public void test01()
	{
		hm.productselectmen();
		
	}


}
//button[@class='close']/span/i