package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.crm.qa.utility.TestUtil;
import com.crm.qa.utility.WebElementListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	protected BaseClass() {
		try {
		prop =new Properties();
		FileInputStream file=new FileInputStream("C:/Users/aaa/Javaspace/OrangeCRMFramework/src/main/java/com/crm/qa/Config/config.properties");
		
		prop.load(file);;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

	
	
	
	
	protected static void initialization() {
		
	String browsername=	prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	else if(browsername.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if(browsername.equals("safari")) {
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
	}
	
	
	  WebDriverListener listener = new WebElementListener(); // <- your custom logger class
	    driver = new EventFiringDecorator(listener).decorate(driver);	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get(prop.getProperty("url"));
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
	}


	public void beforeNavigateTo(WebDriver driver, String url) {
		// TODO Auto-generated method stub	
	}
	public void afterNavigateTo(WebDriver driver, String url) {
		// TODO Auto-generated method stub	
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub	
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub	
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub	
	}

	    
	}
