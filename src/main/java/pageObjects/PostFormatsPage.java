package pageObjects;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.MenuPage;

public class PostFormatsPage extends BaseTest {
	
	public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By audioPost = By.linkText("Audio post");
	
	public By timeRailInitialPosition = By.cssSelector("span[style=\"display: none; left: 0px;\"]");
	public By volumeInitialPosition = By.cssSelector("div[style=\"left: 0px; width: 100%;\"]");
	public By playSongButton = By.cssSelector("div[class=\"mejs-button mejs-playpause-button mejs-play\"]");
	
	
	public void dragAndDrop(By locator, int x, int y) {		
		WebElement element = driver.findElement(locator);
		Actions action = new Actions (driver);
		action.dragAndDropBy(element, x, y).perform();
	}
	
	public void audioPostLink (By locator) {
		driver.findElement(locator).click();				
	}
	
	public void playSong (By locator) {
		driver.findElement(locator).click();				
	}
	

}
