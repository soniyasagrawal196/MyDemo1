package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;
 public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver= null;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@data-link-action='display-register-form']")
	WebElement registrationPage;
    @FindBy(id="field-id_gender-2")
	WebElement title;
	@FindBy(id="field-firstname")
	WebElement firstname;
	@FindBy(id="field-lastname")
	WebElement lastname;
	@FindBy(id="field-email")
    WebElement email;
	@FindBy(id="field-password")
	WebElement Password;
	@FindBy(id="field-birthday")
	WebElement birthday;
	@FindBy(xpath="//input[@name='psgdpr']")
	WebElement checkbox;
	@FindBy(xpath="//input[@name='customer_privacy']")
	WebElement button2;
	@FindBy(xpath="//button[@class='btn btn-primary form-control-submit float-xs-right']")
	WebElement button;
//public void clickRegistrationPage()
	//{
	//DriverUtils.waitForElement(driver,driver.findElement(By.xpath("//a[@data-link-action='display-register-form']")));
	//registrationPage.click();
   public void accountFillForm()
   {
	   registrationPage.click();
	   title.click();
	   firstname.sendKeys("soniya");
	   lastname.sendKeys("agrawal");
	   email.sendKeys("soniyasagrawal196@gmail.com");
	   Password.sendKeys("@sachinsoniya19");
	   birthday.sendKeys("07/19/1998");
	   checkbox.click();
	   button2.click();
	   button.submit();	   }
	   
   }
 