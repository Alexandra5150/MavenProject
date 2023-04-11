package utils;

import pageObjects.CartPage;
import pageObjects.ContactsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;
import pageObjects.ShippingPage;
import pageObjects.ShopPage;
import pageObjects.SingleAuthorPage;

public class BasePage extends BaseTest {
	
	public MenuPage menu = new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	public SearchPage search = new SearchPage(driver);
	public CartPage cart = new CartPage(driver);
	public HomePage home = new HomePage(driver);
	public LoginPage login = new LoginPage(driver);
	public PostFormatsPage postFormats = new PostFormatsPage(driver);
	public ProductPage product = new ProductPage(driver);
	public ShippingPage shipping = new ShippingPage(driver);
	public SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);

}
