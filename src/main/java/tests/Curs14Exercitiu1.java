package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.ShopPage;
import utils.BaseTest;

public class Curs14Exercitiu1 extends BaseTest {
	
	@Test
	public void checkBookPrice () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByValue("price");
		
		assertEquals(shop.getSelectedOption(), "Sort by price: low to high");
		
		shop.navigateTo(shop.nextPageArrow);
		
		
		
	}

}
