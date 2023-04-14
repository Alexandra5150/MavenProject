package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
		
        //tranformam textul in double si scoatem semnul $ cu substring pentru ale putea compara
        double priceFirstElement = Double.parseDouble(shop.getElement(shop.firstBook).getText().substring(1));

        shop.navigateTo(shop.nextPageArrow);
       
        double priceLastElement = Double.parseDouble(shop.getElement(shop.lastBook).getText().substring(1));
       
        //facem comparatia
        assertTrue(priceFirstElement<priceLastElement);
		
	}

}
