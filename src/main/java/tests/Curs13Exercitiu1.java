package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.ShippingPage;


public class Curs13Exercitiu1 extends BaseTest {
	
	
	@Test
	public void checkShippingAddress () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);		
		login.loginInApp("TestUser", "12345@67890");		
		assertTrue(login.successMsgisDisplayed());
		
		driver.get("https://keybooks.ro/account/edit-address/shipping/");	
				
		ShippingPage check = new ShippingPage(driver);		
		
		check.selectByIndex(40);		
		assertEquals(check.getSelectedOptionCountry(), "Canada");
				
		check.selectByValue("Newfoundland and Labrador");		
		assertEquals(check.getSelectedOptionProvince(), "Newfoundland and Labrador");
		
		
	}
	
}
