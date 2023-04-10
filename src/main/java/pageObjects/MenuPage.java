package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	//locatori
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By searchButton = By.cssSelector("div[class=\"search_form_wrap\"] button[title=\"Open search\"]");
	public By shopLink = By.linkText("BOOKS");
	public By facebookIcon = By.cssSelector("div[class=\"top_panel_top_user_area\"] span[class=\"icon-facebook\"]");
	public By twitterIcon = By.cssSelector("div[class=\"top_panel_top_user_area\"] span[class=\"icon-twitter\"]");
	public By instagramIcon = By.cssSelector("div[class=\"top_panel_top_user_area\"] span[class=\"icon-instagramm\"]");
	public By username = By.cssSelector("span[class=\"user_name\"]");
	public By logoutButton = By.cssSelector("li[class=\"menu_user_logout\"]>a");
	public By blogLink = By.linkText("BLOG");
	public By postFormatsLink = By.linkText("Post Formats");
	public By homePageButton = By.cssSelector("div[class=\"top_panel_middle\"] a[href=\"https://keybooks.ro/\"]");
//	public By searchIcon = By.cssSelector("button[class*='search_submit']");
//	public By searchField =  By.cssSelector("input[class='search_field']");
	
	//driver.findElement(By.linkText("Login")).click();
	//     indentificare element                  + actiune pe element
	//metoda findElemenet + locator (By.linkText("Login")) + actiune
	//driver.findElement(locator) ==> locator ==loginLink
	//driver.findElement(loginLink)
	
	
	public void navigateTo (By locator) {
		driver.findElement(locator).click();				
	}
	
	public void hoverElement (By locator) {		
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();		
	}
		
	public void logoutFromApp() {
		
		driver.findElement(logoutButton).click();
	}
	
}
