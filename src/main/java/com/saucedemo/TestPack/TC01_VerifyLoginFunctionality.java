package com.saucedemo.TestPack;

import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseSauceDemo
{

	
	@Test
	public void verifyLogin()
	{
		String title = driver.getTitle();
		String expected = "Swag Labs";
		
		if (title.equals(expected))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
	
	
}
