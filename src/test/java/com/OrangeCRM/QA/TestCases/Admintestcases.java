package com.OrangeCRM.QA.TestCases;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.Adminpage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.TestUtil;

public class Admintestcases extends BaseClass {
	Loginpage login;
	Homepage home;
	Adminpage admin;
	
	Admintestcases(){
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();
		home=new Homepage();
		admin =new Adminpage();
		home=login.logins(prop.getProperty("username"), prop.getProperty("password"));
		admin.clickadmintab();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
	}
	
	
	
	@Test(priority=2)
	
	public void titletest() {
		
		System.out.println(admin.title());
		
	}
	@Test(priority=3)
	
	public void usersdata() {
		
		
		admin.userdata();
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

}
