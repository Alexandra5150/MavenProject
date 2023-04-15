package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;



public class Curs16Exercitiu3 extends BaseTest {
	
	@Test
	public void checkElements () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.searchButton);
		
		SearchPage search = new SearchPage(driver);		
		search.searchField2("king");
		
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-wicked-king/");
		
		ProductPage productPage = new ProductPage(driver);
		
		assertTrue(productPage.checkData(productPage.newReleasesCategory));
		assertTrue(productPage.checkData(productPage.productID));
		assertTrue(productPage.checkData(productPage.photo1));
		assertTrue(productPage.checkData(productPage.photo2));
		assertTrue(productPage.checkData(productPage.photo3));
		assertTrue(productPage.checkData(productPage.photo4));		
		
	}

}
