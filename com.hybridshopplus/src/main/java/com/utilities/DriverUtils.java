package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class DriverUtils extends BaseClass {
	public static String getScreenshot(String name)
	{
		String path= System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
				TakesScreenshot ts =(TakesScreenshot) driver;
				File src= ts.getScreenshotAs(OutputType.FILE);
				File des= new File(path);
				try {
				FileUtils.copyFile(src, des);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return path;
	}
	public static void waitForElement(WebElement element, long time) {
		WebDriverWait wait= new WebDriverWait(driver,time);
	     wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
