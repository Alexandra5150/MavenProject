package pageObjects;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BaseTest {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By nameField = By.cssSelector("input[placeholder=\"Name*\"]");
	

}
