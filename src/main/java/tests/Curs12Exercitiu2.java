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
import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import pageObjects.SingleAuthorPage;


public class Curs12Exercitiu2 extends BaseTest {
	
	@Test
	public void sendMessage () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		
		ContactsPage contacts = new ContactsPage(driver);
		
		contacts.sendMessage("fgh", "fgh@abc.com", "test", "text text text");
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class=\"wpcf7-response-output\"]"), "Thank you for your message. It has been sent."));
		
		assertTrue(contacts.successMessageSentIsDisplayed());
		
	}
	
	
}
