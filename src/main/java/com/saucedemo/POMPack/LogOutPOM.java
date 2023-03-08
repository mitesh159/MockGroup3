package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPOM 
{
	WebDriver driver;
	
	public LogOutPOM(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement options;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement logOut;
	
	public void clickOptions()
	{
		options.click();
	}
	
	public void clickLogOut()
	{
		logOut.click();
	}

}
