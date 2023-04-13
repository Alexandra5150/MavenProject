package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import utils.BaseTest;
import utils.Log;

public class LoginTest extends BaseTest {

	@Parameters({"user", "pass"})
	@Test
	public void loginTest(String username, String password) {
		
		//assertTrue(false);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		//menu.navigateTo(menu.contactsLink);
		
		Log.info("Test logging");
		
		LoginPage login = new LoginPage(driver);
		
		//login.loginInApp("TestUser", "12345@67890");
		login.loginInApp(username, password);
		
		assertTrue(login.successMsgisDisplayed());
		
	}
	
	
	
}
