package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import utils.BaseTest;

public class Curs15Exercitiu extends BaseTest {
	
	@Test
	public void addComment() {
		
		String javaScriptHover = "var objObject = document.createEvent('MouseEvents');"+"objObject.initMouseEvent('mouseover',true);"+"arguments[0].dispatchEvent(objObject);";
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		MenuPage menu = new MenuPage(driver);
		//menu.hoverElement(menu.blogLink);
		jse.executeScript(javaScriptHover, menu.getElement(menu.blogLink));
		//menu.hoverElement(menu.postFormatsLink);
		jse.executeScript(javaScriptHover, menu.getElement(menu.postFormatsLink));
		//menu.navigateTo(menu.postFormatsLink);
		jse.executeScript("arguments[0].click()", menu.getElement(menu.postFormatsLink));
		
		PostFormatsPage postFormatsPage = new PostFormatsPage (driver);
		
		WebElement galleryFormat = driver.findElement(By.linkText("Gallery Format"));
		jse.executeScript("arguments[0].scrollIntoView()", galleryFormat);
		
		postFormatsPage.navigateTo(postFormatsPage.galleryFormat);
		//jse.executeScript("document.getElementsByClassName('')[0].click()");		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/2016/02/01/gallery-format/");
		
		WebElement commentField = driver.findElement(By.id("comment"));
		jse.executeScript("arguments[0].scrollIntoView()", commentField);
		
		jse.executeScript("document.getElementById('comment').value='text'");
		jse.executeScript("document.getElementById('author').value='abcd'");
		jse.executeScript("document.getElementById('email').value='abcd@abcd.com'");
		jse.executeScript("document.getElementById('send_comment').click()");
		
//		Actions action = new Actions(driver);
//		action
//			.moveToElement(commentField)
//			.sendKeys(commentField, "text text")
//			.sendKeys(Keys.TAB, "abcd")
//			.sendKeys(Keys.TAB, "abcd@abcd.com")
//			.sendKeys(Keys.TAB, "www.google.com")
//			.sendKeys(Keys.TAB, Keys.ENTER)			
//			.perform();
		
		assertTrue(postFormatsPage.awaitingModerationTextIsDisplayed());
		
	}

}
