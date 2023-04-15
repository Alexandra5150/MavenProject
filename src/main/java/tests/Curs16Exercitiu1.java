package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.ClassicPage;
import pageObjects.MenuPage;


public class Curs16Exercitiu1 extends BaseTest {
	
	@Test
	public void addComment () {
		
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.blogLink2);
		menu.hoverElement(menu.classicLink);
		menu.navigateTo(menu.classicLink);
		
		ClassicPage classicPage = new ClassicPage (driver);
		
		classicPage.navigateTo(classicPage.blogPost);	
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/2016/02/02/15-amazing-things-about-reading-in-the-fall/");
		
		WebElement commentField = driver.findElement(By.xpath("//textarea[@id=\"comment\"]"));
		jse.executeScript("arguments[0].scrollIntoView()", commentField);
		
		Actions action = new Actions(driver);
		action
			.moveToElement(commentField)
			.sendKeys(commentField, "text text text text text")
			.sendKeys(Keys.TAB, "abcd")
			.sendKeys(Keys.TAB, "abcd@abcd.com")
			.sendKeys(Keys.TAB, "www.google.com")
			.sendKeys(Keys.TAB, Keys.ENTER)			
			.perform();
		
		assertTrue(classicPage.awaitingModerationTextIsDisplayed());		
	}

}
