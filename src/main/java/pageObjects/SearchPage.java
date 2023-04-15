package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.BaseTest;

public class SearchPage extends BaseTest {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By searchField = By.cssSelector("input[class=\"search_field\"]");
	public By searchMore = By.cssSelector("a[class=\"post_more search_more\"]");
	public By loadMore = By.cssSelector("span[class=\"viewmore_text_1\"]");
	public By searchField2 = By.xpath("//input[@class=\"search_field\"]");
	public By wickedKingBook = By.xpath("(//a[contains(text(), \"The Wicked King\")])[1]");
	
    public WebElement getElement(By locator) {
        return driver.findElement(locator);
   }
	
	public void searchField (String textToSearch) {		
		driver.findElement(searchField).sendKeys(textToSearch);
		driver.findElement(searchMore).click();
		driver.findElement(loadMore).click();		
	}
	
	public void searchField2 (String textToSearch2) {		
		driver.findElement(searchField2).sendKeys(textToSearch2);
		driver.findElement(wickedKingBook).click();
	}
	
	public void hoverElement (By locator) {		
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();		
	}

}
