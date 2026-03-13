//package BaseClass;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//
//public class UiAutomatorBaseClass {
//
//	public static void main(String[] args) throws MalformedURLException {
//		// TODO Auto-generated method stub
//		UiAutomatorBaseClass obj = new UiAutomatorBaseClass();
//		obj.calculator();
//	}
//	public void calculator(
//			) throws MalformedURLException {
//		AppiumDriver driver;
//		
//	    UiAutomator2Options options = new  UiAutomator2Options();
//	    
//	   
//
//        options.setDeviceName("Redmi12");
//        options.setUdid("297f55a87d7c");
//        options.setPlatformName("Android");
//        options.setPlatformVersion("15");
//        options.setAutomationName("UiAutomator2");
//
//        options.setAppPackage("com.miui.calculator");
//        options.setAppActivity("com.miui.calculator.cal.CalculatorActivity");
//
//        URL url = new URL("http://127.0.0.1:4723");
//
//        driver = new AndroidDriver(url, options);
//
//        System.out.println("Session Started!");
//	    
//	}
//
//}
