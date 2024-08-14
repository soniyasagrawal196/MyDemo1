//package com.tests;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.base.BaseClass;
//import com.pages.LoginPage;
//import com.pages.RegistrationPage;
//
//public class RegistrationTest extends BaseClass {
//	LoginPage lp= null;
//	RegistrationPage rp= null;
//	@BeforeSuite
//	public void setup()
//	{
//		initialization();
//		reportInit();
//		//lp= new LoginPage(driver);
//		rp= new RegistrationPage(driver);
//	}
//	@Test
//	public void test01()
//	{
//		//lp.loginToApplication();
//		//Assert.assertEquals(driver.getTitle(), "My Store");
//		rp.accountFillForm();
//		
//	}
////	@Test
////	public void test02()
////	{
////		rp.accountFillForm();
////		
////	}
//	
//
//}
