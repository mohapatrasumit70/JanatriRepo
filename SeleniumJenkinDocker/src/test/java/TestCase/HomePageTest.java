package TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;


public class HomePageTest extends BaseClass{
	private LoginPage loginPage;
	private HomePage homePage;
	
	@BeforeMethod
	public void setupPages() {
		loginPage = new LoginPage(getDriver());
		homePage  = new HomePage(getDriver());
	}
	
	@Test()
	public void verifyOrangeHRMLogo() {

		loginPage.login("admin", "admin123");
	
		Assert.assertTrue(homePage.verifyOrangeHRMlogo(),"Logo is not visible");
		
		homePage.logout();
		
}
}
