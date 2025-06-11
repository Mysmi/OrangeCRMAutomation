package com.crm.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;
import com.crm.qa.utility.Resuabledata;

public class Loginpage extends BaseClass{

	public Loginpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username")
	WebElement  username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	public Homepage logins(String us,String pas)  {
		
		username.sendKeys(us);
		password.sendKeys(pas);
		
		button.click();
		

		return new Homepage();
	}
	
	public String  title() {
		
		return driver.getTitle();
	}
	
	
	

		
	
	

}
