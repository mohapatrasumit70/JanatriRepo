package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.actiondriver.ActionDriver;
import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	private LoginPage loginPage;
	private HomePage homePage;
	private ActionDriver actionDriver;

	 
	 

	@BeforeMethod
	public void setupPages() {
		loginPage = new LoginPage(getDriver());
		homePage  = new HomePage(getDriver());
	}

	@Test
	public void verifyValidLoginTest() {   
		loginPage.login("admin", "admin123");
		Assert.assertTrue(homePage.isAdminTabVisible(),
			"Admin tab should be visible after successful login");
		homePage.logout();
	}
//
//	@Test()
//	public void inValidLoginTest(String username, String password) {
//	
//		loginPage.login("admin", "admin1234");
//		String expectedErrorMessage = "Invalid credentials";
//		Assert.assertTrue(loginPage.verifyErrorMessage(expectedErrorMessage),"Test Failed: Invalid error message");
//		homePage.logout();
//	}
}
