package BaseClass;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseClassDemo {
	public static AppiumDriver driver;
	public static void main(String[] args) throws Throwable {
		BaseClassDemo obj = new BaseClassDemo();

		try {
			obj.calculator();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void calculator(
			) throws Throwable {		
	    DesiredCapabilities caps = new DesiredCapabilities();
	    

	    caps.setCapability("deviceName", "Redmi12");
	    caps.setCapability("udid", "297f55a87d7c"); 
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("platformVersion", "15.0");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("appPackage", "com.miui.calculator");
	    caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity"); 
	    URL url = new URL("http://127.0.0.1:4723");
	     driver = new AndroidDriver(url, caps);
	     
	    System.out.println("Session Started!");
	    
	    
	}
}
