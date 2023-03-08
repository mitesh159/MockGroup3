package com.saucedemo.TestPack;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOM;

public class TC02_VerifyBagProductAddtoCart extends TestBaseSauceDemo
{

	@Test
	public void verifyBagProductAddToCart()
	{
		HomePagePOM hpp = new HomePagePOM(driver);
		
		hpp.clickBagAddToCart();
		String actual = hpp.getTextCartBtn();
		String expected = "1";
//		System.out.println(expected);
//		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
}
