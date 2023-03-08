package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM 
{
	private WebDriver driver;
	Select s;
	Actions act;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']")private WebElement cartBtn;
	@FindBy(xpath = "//button[text()='Add to cart']")private List<WebElement> addToCart;
	@FindBy(xpath = "//div[@class='inventory_item_label']")private List<WebElement> productDescription;
	@FindBy(xpath = "//select[@class='product_sort_container']")private WebElement dropdown;
	@FindBy(xpath = "//option[text()='Price (low to high)']")private WebElement hilo;
    	
	public void clickBagAddToCart()
	{
		addToCart.get(0).click();
	}
	
	public void clickAddtoCart()
	{
		for (WebElement i: addToCart)
			i.click();
	}
	
	public void clickProductDesc(int i)
	{
		productDescription.get(i).click();
	}
	
	public void clickdropdown()
	{
		dropdown.click();
	}
	
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		s = new Select(dropdown);	
		
		act = new Actions(driver);
	}
		
	public void mouseclick()
	{
		act.click(hilo).perform();
	}
		
	public String getTextCartBtn()
	{
		return cartBtn.getText();
	}
	
}
