package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	private WebDriver driver;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@id='user-name']")WebElement userName;
	@FindBy(xpath="//input[@id='password']")WebElement passWord;
	@FindBy(xpath="//input[@id='login-button']")WebElement loginBtn;

	public void sendUserName()
	{
		userName.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void ss()
	{
		
	}
	
	
}
