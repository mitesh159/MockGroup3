package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{

	private WebDriver driver;
	
	public void ss(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\Documents\\TestingLectures\\Automation Testing"
				+ "\\SeleniumClass\\ScreenShots\\Numadic\\"+ name +".jpg");
		FileHandler.copy(source,dest );
	}
	
}