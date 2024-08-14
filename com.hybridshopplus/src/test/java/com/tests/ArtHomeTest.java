package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AcessoriesStationary;
import com.pages.ArtHome;

public class ArtHomeTest extends BaseClass {
	ArtHome ah= null;
@BeforeSuite
public void setup()
{
	initialization();
	reportInit();
	ah= new ArtHome(driver);
}
@Test
public void test01() 
{
	ah.artprocess();
	
}


}



	
