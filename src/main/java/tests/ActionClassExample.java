package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import pageObjects.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest {
	
	@Test
	public void dragAndDropTest () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);		
	}
	
	@Test
	public void hooverExample () {
		
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		menu.hoverElement(menu.postFormatsLink);
		menu.navigateTo(menu.postFormatsLink);		
	}

}
