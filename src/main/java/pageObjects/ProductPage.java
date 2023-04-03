package pageObjects;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BaseTest {

	public WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By addToCartButton = By.cssSelector("button[class=\"single_add_to_cart_button button alt\"]");
	
	
	public void addToCart () {
		
		driver.findElement(addToCartButton).click();
		
	}
	
}
