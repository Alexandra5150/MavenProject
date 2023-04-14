package pageObjects;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BaseTest {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By qtyIncreaseArrow = By.cssSelector("span[class=\"q_inc\"]");
	public By updateCartButton = By.cssSelector("button[name=\"update_cart\"]");
	public By proceedCheckoutButton = By.cssSelector("div[class=\"wc-proceed-to-checkout\"] a");
	public By billingDetailsText = By.cssSelector("div[class=\"woocommerce-billing-fields\"] h3");
	public By additionalInformationText = By.cssSelector("div[class=\"woocommerce-additional-fields\"] h3");
	
	
	public void quantityIncrease () {		
		driver.findElement(qtyIncreaseArrow).click();		
	}
	
	
	public void updateCart () {		
		driver.findElement(updateCartButton).click();		
	}
	
	
	public void proceedToCheckout () {		
		driver.findElement(proceedCheckoutButton).click();		
	}
	
    public WebElement getElement(By locator) {
        return driver.findElement(locator);
   }
	

}
