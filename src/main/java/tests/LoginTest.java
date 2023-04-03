package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
		
		//assertTrue(false);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		//menu.navigateTo(menu.contactsLink);
		
		LoginPage login = new LoginPage(driver);
		
		login.loginInApp("TestUser", "12345@67890");
		
		assertTrue(login.successMsgisDisplayed());
		
	}
	
	
	
}
