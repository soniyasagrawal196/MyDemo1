package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;

public class HomeClothes {
	WebDriver driver;

	public HomeClothes (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(@href,'3-clothes')]")
	WebElement clothes;
	@FindBy(xpath="//ul[@class='category-sub-menu']/li[2]/a")
	WebElement womens;
	@FindBy(xpath="//div[@class='product-description']/h2/a")
	WebElement product;
	@FindBy(xpath="//option[@value='2']")
	WebElement size;
	@FindBy(xpath="//div[@class='input-group bootstrap-touchspin']/span/button[1]/i")
	WebElement quantity;
	@FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
    WebElement addtocart;
	//@FindBy(xpath="//div[@class()='cart-content-btn']/a/i")  // error
	//WebElement proceed;
	@FindBy(xpath="//button[@class='close']/span/i")        
	WebElement close;
	@FindBy(xpath="//div[@class='header']/a/i")
	WebElement viewcart;
	@FindBy(xpath="//a[contains(@href,'order')]")
	WebElement proceed;
	@FindBy(xpath="//input[@value='2']")
	WebElement gender;
	@FindBy(id="field-firstname")
	WebElement name;
	@FindBy(id="field-lastname")
	WebElement lastname;
	@FindBy(id="field-email")
	WebElement email;
    @FindBy(xpath="//input[@name='psgdpr']")
    WebElement button1;
    @FindBy(xpath="//input[@name='customer_privacy']")
    WebElement button2;
    @FindBy(xpath="//button[@class='continue btn btn-primary float-xs-right' and @data-link-action='register-new-customer']")
    WebElement next;
    @FindBy(id="field-address1")
    WebElement address;
    @FindBy(id="field-city")
    WebElement city;
    @FindBy(xpath="//option[@value='17']")
    WebElement select;
    @FindBy(id="field-postcode")
    WebElement postcode;
    @FindBy(xpath="//option[text()='United States']")
    WebElement unitedstate;
    @FindBy(xpath="//button[@type='submit' and @name='confirm-addresses']")
    WebElement continue1;
    @FindBy(xpath="//button[@name='confirmDeliveryOption']")
    WebElement Confirmship;
    @FindBy(xpath="//input[@id='payment-option-3']")
    WebElement payment;
    @FindBy(xpath="//span/input[@id='conditions_to_approve[terms-and-conditions]']")
    WebElement checkboxend;
    @FindBy(xpath="//button[@class='btn btn-primary center-block']")
    WebElement placeorder;
//	

	public void productselect()
    {
	DriverUtils.waitForElement(clothes, 30);
	clothes.click();
	womens.click();
	DriverUtils.waitForElement(product, 30);
	product.click();
	size.click();
	quantity.click();
	DriverUtils.waitForElement(addtocart, 30);
	addtocart.click();
	//DriverUtils.waitForElement(proceed, 30);
    //proceed.click();
	DriverUtils.waitForElement(close, 30);
    close.click();
    viewcart.click();
    proceed.click();
    gender.click();
    name.sendKeys("sachin");
    lastname.sendKeys("jaiswal");
    email.sendKeys("sachin19@gmail.com");
    button1.click();
    button2.click();
    next.click();
    address.sendKeys("kranti chowk");
    city.sendKeys("nagpur");
    select.click();
    postcode.sendKeys("44155");;
    unitedstate.click();
    continue1.click();
    Confirmship.click();
    payment.click();
    checkboxend.click();
    placeorder.click();
    
    
    }
}