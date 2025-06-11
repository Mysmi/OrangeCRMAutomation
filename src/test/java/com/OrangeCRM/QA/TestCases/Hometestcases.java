package com.OrangeCRM.QA.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Hometestcases extends BaseClass {
	
	Loginpage login;
	Homepage home;
	
	Hometestcases(){
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		login = new Loginpage();
		home=new Homepage();
		home=login.logins(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void title() {
		
		   System.out.println( home.dashtitle());
		   String st= home.username();
			System.out.println(st);
		
	}
	
	@Test
	
	public void username() {
		
		String st= home.username();
		System.out.println(st);
	}
	@Test
	public void getallfunction() {
		String st= home.username();
		System.out.println(st);
		home.allfuction();
	}
	
	@Test
	public void getalldashfunctiong() {
		String st= home.username();
		System.out.println(st);
		home.dashfuction();
	}
	
	
	@AfterMethod
	
	public void teardown() {
		driver.close();
	}
 

}
