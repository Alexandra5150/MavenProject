package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;

public class Curs12Exercitiu3 extends BaseTest {

	
	@Test(priority=1)
	public void searchAddBookToCart () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.searchButton);
		
		SearchPage search = new SearchPage(driver);		
		search.searchField("The story about me");
				
		driver.findElement(search.loadMore).click();
		
		driver.findElement(By.cssSelector("h4[class=\"post_title\"] a[href=\"https://keybooks.ro/shop/the-story-about-me/\"]")).click();
		
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");
		
		ProductPage addItemToCart = new ProductPage(driver);
		addItemToCart.addToCart();
		
		WebElement addedToCartSuccess = driver.findElement(By.cssSelector("div[class=\"woocommerce-message\"]"));
		assertTrue(addedToCartSuccess.getText().contains("The story about me” has been added to your cart."));
		
		addItemToCart.viewCart();
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/cart/");
				       
	}
	
	
	@Test(priority=2)
	public void viewCartAndCheckout () {
		
		CartPage cartPage = new CartPage(driver);
		cartPage.quantityIncrease();		
		cartPage.updateCart();
		
		WebElement cartUpdateSuccess = driver.findElement(By.cssSelector("div[class=\"woocommerce-message\"]"));
		assertTrue(cartUpdateSuccess.getText().contains("Cart updated."));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class=\"wc-proceed-to-checkout\"] a")));
		
		cartPage.proceedToCheckout();
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/checkout/");
		
		assertTrue(((WebElement) cartPage.billingDetailsText).isDisplayed());
		assertTrue(((WebElement) cartPage.additionalInformationText).isDisplayed());
		
		assertTrue(((WebElement) cartPage.billingDetailsText).isDisplayed());
		
	}
	
	
}
