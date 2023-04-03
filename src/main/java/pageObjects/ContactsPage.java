package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class ContactsPage extends BaseTest {

	public WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By nameField = By.cssSelector("input[placeholder=\"Name*\"]");
	public By emailField = By.cssSelector("input[placeholder=\"E-mail*\"]");
	public By subjectField = By.cssSelector("input[placeholder=\"Subject\"]");
	public By messageField = By.cssSelector("textarea[placeholder=\"Message*\"]");
	public By sendMessageButton = By.cssSelector("input[value=\"Send Message\"]");
	
	public By successMessageSent = By.cssSelector("div[class=\"wpcf7-response-output\"]");
	//Thank you for your message. It has been sent.
	
	
	public void sendMessage(String name, String email, String subject, String message) {
		
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(subjectField).sendKeys(subject);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(sendMessageButton).click();		
	}
	
	
	public boolean successMessageSentIsDisplayed () {
		return driver.findElement(successMessageSent).isDisplayed();
	}
	
	
}
