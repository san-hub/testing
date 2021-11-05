package com.scripts;

import org.testng.annotations.Test;

import com.features.LoginFeature;
import com.generic.BaeLib;
import com.generic.Excelutilities;

public class LoginTest extends BaeLib {
	@Test(priority=1,description="verify validlogin")
	public void validLogin()
	{
		Excelutilities eu= new Excelutilities("C:\\Users\\DELL\\eclipse-workspace\\testing\\testdata\\testdata - Copy.xlsx");
		String username = eu.readData("sheet1", 1, 1);
		String password = eu.readData("sheet1", 1, 2);
		LoginFeature lf=new LoginFeature(driver);
		lf.validLogin(username, password);
		//System.out.println("test script:"+username);
		//System.out.println("test script:"+password);
	
	}

@Test(priority=2,description="verify invalidlogin")
public void invalidLogin()
{
	Excelutilities eu= new Excelutilities("C:\\Users\\DELL\\eclipse-workspace\\testing\\testdata\\testdata - Copy.xlsx");
	String username = eu.readData("sheet1", 2, 1);
	String password = eu.readData("sheet1", 2, 2);
	LoginFeature lf=new LoginFeature(driver);
	lf.invalidLogin(username, password);
}
	}


