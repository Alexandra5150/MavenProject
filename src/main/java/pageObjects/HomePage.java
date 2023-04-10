package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class HomePage extends BaseTest {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By theForestBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"the-forest\"]");
	public By theSonBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"the-son\"]");
	public By lifeInTheGardenBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"life-in-the-garden\"]");
	public By theLongRoadBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"the-long-road-to-the-deep-silence\"]");
	public By reallyStrangeStoryBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"its-a-really-strange-story\"]");
	public By stormBook = By.cssSelector("div[id=\"sc_tab_1456822345_1_17\"] a[href=\"storm\"]");
	
	
	public void openBooks (By locator) {		
		driver.findElement(locator).click();		
	}
			

}
