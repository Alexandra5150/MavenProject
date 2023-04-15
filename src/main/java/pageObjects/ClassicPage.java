package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClassicPage {
	
	public WebDriver driver;
	
	public ClassicPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By blogPost = By.xpath("(//a[contains(text(), \"15 Amazing Things About Reading in the Fall\")])[1]");
	public By awaitingModerationText = By.xpath("//div[@class=\"comment_not_approved\"]");
	
	
	public void navigateTo (By locator) {
		driver.findElement(locator).click();				
	}
	
	public boolean awaitingModerationTextIsDisplayed () {
		return driver.findElement(awaitingModerationText).isDisplayed();
	}

}
