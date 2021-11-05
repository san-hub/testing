package com.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.pageobjects.EnterTimeTrackPage;
import com.pageobjects.LoginPage;

public class LoginFeature {
	WebDriver driver;
	LoginPage lp;
	EnterTimeTrackPage ettp;
	//OpenTasksPage opp;
	public LoginFeature(WebDriver driver)
	{
		this.driver=driver;
		lp=new LoginPage(driver);
		ettp=new EnterTimeTrackPage(driver);
		//opp=new OpenTasksPage(driver);
	}
	//public void login(String username,String password)
	//{
		//lp.getUnTxtBx().sendKeys(username);
		//lp.getPwdTxtBx().sendKeys(password);

		//lp.getLoginBtn().click();
	//}
	
	//feature
	public void validLogin(String username,String password)

	{
		//lp.getUnTxtBx().sendKeys(username);
		//lp.getPwdTxtBx().sendKeys(password);

		//lp.getLoginBtn().click();
		lp.login(username,password);
		  String actualtext = ettp.getHomepageTitle().getText();
		 String expextedText = "Enter Time-Track";
		Assert.assertEquals(actualtext,expextedText);
		 Reporter.log("Home Page (Enter Time tRACK )is verified",true);
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "actiTIME - Enter Time-Track";
		 Assert.assertEquals(actualTitle, expectedTitle);
		 Reporter.log("Home Page (Enter Time Track) title is verified",true);
	}
	//feature
		 public void invalidLogin(String username,String password)
		 {
			 lp.login(username,password);
			   String actualMsg = lp.getErrorMsg().getText();
			  String expectedMsg = "Username or Password is invalid. Please try again.";
					  Assert.assertEquals(actualMsg, expectedMsg);
			  Reporter.log("Invalid Login Message is verified",true);
			  
		 
		 
		 
		
		

	}

}
