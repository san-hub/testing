package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		@FindBy(name="username")
		//private @Getter WebElement unTxtBx;
		private WebElement unTxtBx;
		
		@FindBy(name="pwd")
		//private @Getter WebElement pwdTxtBx;
		private WebElement pwdTxtBx;
		
		@FindBy(id="loginButton")
		//private @Getter WebElement lgnBtn;
		private WebElement LoginBtn;
		
		//@FindBy(xpath="//div[@id='serversideErrorMessage']//span")
		@FindBy(xpath="//div[@id='ServerSideErrorMessage']//span")
		private WebElement errorMsg;
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//public WebElement getUnTxtBx() {
			//return unTxtBx;
		//}
		public WebElement getPwdTxtBx() {
			return pwdTxtBx;
		}
		public WebElement getUnTxtBx() {
			return unTxtBx;
		}
		public WebElement getLoginBtn() {
			return LoginBtn;
		}
		public WebElement getErrorMsg() {
			return errorMsg;
		}
		//reusuable method
		public void login(String username,String password)
		{
			unTxtBx.sendKeys(username);
			pwdTxtBx.sendKeys(password);
			LoginBtn.click();

}
}
