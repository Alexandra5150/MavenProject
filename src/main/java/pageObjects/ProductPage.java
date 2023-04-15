package pageObjects;

import utils.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseTest {

	public WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By addToCartButton = By.cssSelector("button[class=\"single_add_to_cart_button button alt\"]");
	public By viewCartButton = By.cssSelector("div[class=\"woocommerce-message\"] a[class=\"button wc-forward\"]");
	public By magnifier = By.xpath("//a[@class=\"woocommerce-product-gallery__trigger\"]");
	public By title = By.xpath("//h1[@class=\"product_title entry-title\"]");
	public By stars = By.xpath("//div[@class=\"woocommerce-product-rating\"]");
	public By price = By.xpath("(//bdi)[2]");
	public By description = By.xpath("//div[@class=\"woocommerce-product-details__short-description\"]");
	public By itemNumber = By.xpath("//input[@title=\"Qty\"]");
	public By addToCartButton2 = By.xpath("//button[@name=\"add-to-cart\"]");
	public By categories = By.xpath("//input[@title=\"Qty\"]");
	public By newReleasesCategory = By.xpath("//span[contains(@class, \"posted_in\")]/a[contains(text(), \"New releases\")]");
	public By productID = By.xpath("//span[contains(@class, \"product_id\")]/span[contains(text(), \"1709\")]");
	public By photo1 = By.xpath("//img[@src=\"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing1-100x100.png\"]");
	public By photo2 = By.xpath("//img[@src=\"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing2-100x100.png\"]");
	public By photo3 = By.xpath("//img[@src=\"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing3-100x100.png\"]");
	public By photo4 = By.xpath("//img[@src=\"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing4-100x100.png\"]");
			
	
    public WebElement getElement(By locator) {
        return driver.findElement(locator);
   }
	
	public void addToCart () {		
		driver.findElement(addToCartButton).click();		
	}
	
    public void viewCart() {
        driver.findElement(viewCartButton).click();
   }
    
    public boolean checkData (By locator) {
        return driver.findElement(locator).isDisplayed();                
    }
	
}
