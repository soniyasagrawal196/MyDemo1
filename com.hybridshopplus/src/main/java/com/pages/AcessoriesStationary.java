package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AcessoriesStationary extends BaseClass {
	public AcessoriesStationary(WebDriver driver)
	{ 
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(@href,'6-accessories')]")
	WebElement accessories;
    @FindBy(xpath="//ul[@class='category-sub-menu']/li[1]/a")
     WebElement stationary;
    @FindBy(xpath="//div/h2/a[contains(@href,'16-28-mountain-fox-')]")
    WebElement book;
    @FindBy(xpath="//select/option[@value='24']")
    WebElement select;
    @FindBy(xpath="//button[@type='submit' and @class='btn btn-primary add-to-cart']")
    WebElement addtocart;
	
	public void proceedacc() throws InterruptedException
	{
		Thread.sleep(3000);
		accessories.click();
		stationary.click();
		book.click();
		select.click();
		addtocart.click();
		
	
		
	}

}
