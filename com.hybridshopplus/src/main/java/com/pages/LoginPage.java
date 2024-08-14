package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;

public class LoginPage {
	@FindBy(id= "field-email")
	WebElement username;
	@FindBy(id= "field-password")
	WebElement password;
	@FindBy(id="submit-login")
	WebElement button;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void loginToApplication() throws InterruptedException
	{
		DriverUtils.waitForElement(username, 30);
		username.sendKeys("soniya11@gmail.com");
		DriverUtils.waitForElement(password, 30);;
		password.sendKeys("iamgirl196");
		button.click();
	}

}
