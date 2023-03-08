package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOM;

public class TC03_AllProductAddToCart extends TestBaseSauceDemo
{
	@Test
	public void verifyAllProductAddToCart()
	{
		HomePagePOM hpp = new HomePagePOM(driver);
		
		hpp.clickAddtoCart();
		String expected = "6";
		String actual = hpp.getTextCartBtn();
		
		Assert.assertFalse(false);
	}

}
