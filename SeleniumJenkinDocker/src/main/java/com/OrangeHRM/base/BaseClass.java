package com.OrangeHRM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.OrangeHRM.actiondriver.ActionDriver;

public class BaseClass {
	protected static Properties prop;
	protected static WebDriver driver;
	static ActionDriver actionDriver;
	//if you not used static it will insialize 1 Time the stop
	
	
	@BeforeMethod
	public void setup() throws Exception {
		launchBrowser();
		configureBrowser();
		if(actionDriver == null)
		{
			actionDriver = new ActionDriver(driver);
		}
		
	
	}
	@BeforeSuite
	public void loadConfig() throws Exception
	{
		prop = new Properties();
		FileInputStream input = new FileInputStream("MainResoures/config.properties");
		prop.load(input);
	}
//	public static WebDriver getDriver()
//	{
//		return driver;
//	}
	public static Properties getprob()
	{
		return prop;
	}
	private void launchBrowser()
	{
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new IllegalArgumentException("browser name Is Incoorect");
		}
	}
	private void configureBrowser()
	{
		int immplicitywait = Integer.parseInt(prop.getProperty("implicitWait"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(immplicitywait));
		driver.manage().window().maximize();
		try {
			driver.get(prop.getProperty("url"));
		}
		catch(Exception e)
		{
			System.out.println("Fail to Nagigate Url");
		}
		
	}
	public void staticwait(int mill)
	{
		LockSupport.parkNanos(driver,TimeUnit.SECONDS.toNanos(mill));
	}
	public void setDriver(WebDriver driver)
	{
		this.driver=driver;
	}

	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			try {
				driver.quit();
			}
			catch(Exception e)
			{
				System.out.println("Fail To Quit");
			}
			
			
		}
		driver =null;
		actionDriver = null;
	}
	public static ActionDriver getActionDriver() {
		// TODO Auto-generated method stub
		
			if(actionDriver == null)
			{
				System.out.println("Action Is Not Insialize");
				throw new IllegalArgumentException("Action Is Not Insialize");
				
			}
		
		return actionDriver;
	}

}
