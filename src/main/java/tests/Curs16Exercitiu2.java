package tests;

import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.ProductPage;
import pageObjects.ShopPage;


public class Curs16Exercitiu2 extends BaseTest {
	
	@Test
	public void elementsAreDisplayed () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink2);
		
		ShopPage shopPage = new ShopPage(driver);
		menu.navigateTo(shopPage.book1);
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/a-hundred-and-one-receipes/");
		
		ProductPage productPage = new ProductPage(driver);
		
		assertTrue(productPage.getElement(productPage.magnifier).isDisplayed());
		assertTrue(productPage.getElement(productPage.title).isDisplayed());
		assertTrue(productPage.getElement(productPage.stars).isDisplayed());
		assertTrue(productPage.getElement(productPage.price).isDisplayed());
		assertTrue(productPage.getElement(productPage.description).isDisplayed());
		assertTrue(productPage.getElement(productPage.itemNumber).isDisplayed());
		assertTrue(productPage.getElement(productPage.addToCartButton2).isDisplayed());
		assertTrue(productPage.getElement(productPage.categories).isDisplayed());
		
		
	}

}
