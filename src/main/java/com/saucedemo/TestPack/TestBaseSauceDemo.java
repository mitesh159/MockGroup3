package com.saucedemo.TestPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LogOutPOM;
import com.saucedemo.POMPack.LoginPOM;

public class TestBaseSauceDemo 
{
	WebDriver driver;
	@Parameters ("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\TestingLectures\\Automation Testing"
				+ "\\chromedriver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		System.out.println("Browser open");
		
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Documents\\TestingLectures\\Automation Testing"
					+ "\\geckodriver\\geckodriver.exe");
			
			
			driver = new FirefoxDriver();
			System.out.println("Browser open");
		}
		else
		{
			System.out.println("Throw Error");
		}
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		driver.get("https://saucedemo.com");
		System.out.println("Website opened");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Wait applied");
		
		LoginPOM lp = new LoginPOM(driver);
		
		lp.sendUserName();
		lp.sendPassword();
		lp.clickLoginBtn();
	}
	
	@AfterMethod
	public void tearDown()
	{
		LogOutPOM lop = new LogOutPOM(driver);
		lop.clickOptions();
		lop.clickLogOut();
		System.out.println("End of program");
		driver.manage().deleteAllCookies();
		System.out.println("Cookies deleted");
		driver.quit();
	}

}
