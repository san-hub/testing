package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserFactory {
	
	
	public static WebDriver launch(String browserName)
	{
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\testing\\exe\\chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome Launched",true);
	}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\eclipse-workspace\\testing\\exe\\geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("Firefox Launched",true);
		}
	
	
	return driver;
	
	
	
	}

}



