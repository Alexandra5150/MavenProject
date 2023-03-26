package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import utils.BaseTest;
import java.util.ArrayList;

public class Exercitiu2 extends BaseTest {

	@Test(priority = 1)
	public void checkBook1 () {		
		List<WebElement> newReleasesCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));
		newReleasesCategory.get(0).click();		
		WebElement theForestBook = driver.findElement(By.linkText("The forest"));
		assertTrue(theForestBook.isDisplayed());		
	}
	
	@Test(priority = 2)
	public void checkBook2 () {
		List<WebElement> comingSoonCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));
		comingSoonCategory.get(1).click();
		WebElement theForestBook = driver.findElement(By.linkText("The forest"));
		assertTrue(theForestBook.isDisplayed());
	}
		
	@Test(priority = 3)
	public void checkBook3 () {
		List<WebElement> bestSellersCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));
		bestSellersCategory.get(2).click();
		WebElement theForestBook = driver.findElement(By.linkText("The forest"));
		assertTrue(theForestBook.isDisplayed());
	}
	
	@Test(priority = 4)
	public void checkBook4 () {
		List<WebElement> awardWinnersCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));
		awardWinnersCategory.get(3).click();
		WebElement theForestBook = driver.findElement(By.linkText("The forest"));
		assertTrue(theForestBook.isDisplayed());
		theForestBook.click();	
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
	}
		
	
	@Test
	public void checkBook() {
		
		List<WebElement> newReleasesCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));		
		List<WebElement> comingSoonCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));		
		List<WebElement> bestSellersCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));		
		List<WebElement> awardWinnersCategory = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]"));
		
		
		List<String> list = new ArrayList<String>();
		list.add(newReleasesCategory);
		list.add(comingSoonCategory);
		list.add(bestSellersCategory);
		list.add(awardWinnersCategory);
		
		
		int i;
		for (i=0; i<=list.size(); i++) {
			
			newReleasesCategory.get(0).click();
			comingSoonCategory.get(1).click();
			bestSellersCategory.get(2).click();
			awardWinnersCategory.get(3).click();
			WebElement theForestBook = driver.findElement(By.linkText("The forest"));
			assertTrue(theForestBook.isDisplayed());
			theForestBook.click();	
			assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
			
		}
		
	}	
	
}
