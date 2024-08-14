package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;

public class ArtHome {
	public ArtHome(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//a[contains(@href,'9-art')]")
     WebElement art;
    @FindBy(xpath="//a[contains(@href,'graphic-corner')]")
     WebElement graphic;
     //@FindBy(xpath="//a[contains(text(),'Name, A to Z')]")
     //WebElement sort;
      @FindBy(xpath="//a[contains(@href,'3-13')]/picture")
      WebElement image;
     @FindBy(xpath="//option[@value='20']")
     WebElement dimension;
     //@FindBy(xpath="//button[@class='btn btn-touchspin js-touchspin bootstrap-touchspin-down']/i")
     //WebElement count;
     @FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
     WebElement addtocart;
     @FindBy(xpath="//a[text()='Proceed to checkout']")
     WebElement proceedtocheck;
     //@FindBy(xpath="//div[@class='cart-content-btn']/a/i")
    // WebElement proceedtocheck;
     @FindBy(xpath="//a[text()='Proceed to checkout']")
     WebElement order;

public void artprocess()
{    
	art.click();
	graphic.click();
	//sort.click();
	image.click();
	dimension.click();
	//count.click();
	DriverUtils.waitForElement(addtocart, 30);
	addtocart.click();
	DriverUtils.waitForElement(proceedtocheck, 30);
   proceedtocheck.click();
   order.click();;
}
}