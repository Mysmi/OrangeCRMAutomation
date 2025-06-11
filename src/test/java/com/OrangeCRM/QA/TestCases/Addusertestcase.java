package com.OrangeCRM.QA.TestCases;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.Adduserpage;
import com.crm.qa.pages.Adminpage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.Resuabledata;
import com.crm.qa.utility.TestUtil;

public class Addusertestcase extends BaseClass{
	Loginpage login;
	Homepage home;
	Adminpage admin;
	String sheetName="Sheet1";
	
	Resuabledata re;
	
	Adduserpage add;
	
	
	Addusertestcase(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();
		home=new Homepage();
		admin =new Adminpage();
		add=new Adduserpage();
		re =new Resuabledata();
		home=login.logins(prop.getProperty("username"), prop.getProperty("password"));
		//admin.clickadmintab();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
		
	}
	
	@Test(dataProvider="useradded" )
	public void addusers(String frist,String last,String user,String np,String cp ) {
		
		add.enterdata( frist, last, user, np, cp );
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		re.Screnshot();
		
//		//admin.clickadmintab();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
	add.userdetails();
//		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
      re.Screnshot();
	}
	@DataProvider
	public Object[][] useradded() {
		
		Object data[][]=Resuabledata.getdata(sheetName);
		
		return data;
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		
	}

}
