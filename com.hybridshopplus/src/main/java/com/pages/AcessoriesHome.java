package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AcessoriesHome  {
	public AcessoriesHome(WebDriver driver)
	{
		//this.driver= null;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@href,'6-accessories')]")
	WebElement accesory;
	@FindBy(xpath="//ul[@class='category-sub-menu' ]/li[2]/a")
	WebElement homeaccesary;
	//@FindBy(xpath="//input[@id='facet_input_10810_0']")
	//WebElement color;
	@FindBy(xpath="//div/a[contains(@href,'6-mug-the-best-is-yet-to-come')]")
	WebElement quick;
	@FindBy(xpath="//div[@class='input-group bootstrap-touchspin']/span/button[2]/i")
	WebElement addvalue;
	@FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
	WebElement addtocart;
	//@FindBy(xpath="//div[@class='cart-content-btn']/a/i")
	//WebElement proceedtocheck;

  public void homeacces() throws InterruptedException {
	  Thread.sleep(3000);
	  accesory.click();
	  homeaccesary.click();
	  // color.click();
	  quick.click();
	  addvalue.click();
	  addtocart.click();
	  //proceedtocheck.click();
  }
}
