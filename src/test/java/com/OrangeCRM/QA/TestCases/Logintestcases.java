package com.OrangeCRM.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.Resuabledata;




public class Logintestcases extends BaseClass {
	Loginpage login;
	Homepage home;
	
	
	Logintestcases(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		login = new Loginpage();	
	}
	
	
	


	@Test(priority=1,groups="first" )
	public void test1 () {
		
		String title = login.title();
		System.out.println(title);
		Resuabledata.Screnshot();
		//Assert.assertEquals(title, "Orange HRM");
		
	
	}
	@Test(priority=2,groups="first" )
	public void test2 () {
		
		home=login.logins(prop.getProperty("username"), prop.getProperty("password"));
		
		Resuabledata.Screnshot();
	}
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}


}

