package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utilities.DriverUtils;

public class HomeMenClothes extends BaseClass {
	public HomeMenClothes(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@href,'3-clothes')]")
	WebElement clothes;
	@FindBy(xpath="//ul[@class='category-sub-menu']/li[1]/a")
    WebElement men;
	@FindBy(xpath="//a[contains(@href,'1-studio-design')]")
	WebElement design;
	@FindBy(xpath="//a[contains(@href,'9-22-mountain-fox-cushion')]/picture")
	WebElement image;
	@FindBy(xpath="//input[@type='radio' and @value='11']")
	WebElement color;
	//@FindBy(xpath="//div[@class='btn btn-touchspin js-touchspin bootstrap-touchspin']/span/button[1]/i")    //error
	//WebElement count;
	@FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
	WebElement addtocart;
	@FindBy(xpath="//button[@class='close']/span/i")         //   procced to checkout
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
	
    public void productselectmen()
    { 
	DriverUtils.waitForElement(clothes, 30); 
	clothes.click();
    //Actions act= new Actions(driver);
    //act.moveToElement(men).click(men).build().perform();
	DriverUtils.waitForElement(men, 30); 
    men.click();
    design.click();
    image.click();
    //DriverUtils.waitForElement(count, 30);
    //count.click();
    addtocart.click();
    DriverUtils.waitForElement(close, 30);
    close.click();
    viewcart.click();
    proceed.click();
    gender.click();
    name.sendKeys("sangita");
    lastname.sendKeys("jalan");
    email.sendKeys("sangita@gmail.com");
    button1.click();
    button2.click();
    next.click();
    address.sendKeys("gandhi chowk");
    city.sendKeys("amravati");
    select.click();
    postcode.sendKeys("44155");
    unitedstate.click();
    continue1.click();
    Confirmship.click();
    payment.click();
    checkboxend.click();
    placeorder.click();
    
    }}