package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class SearchPage extends BaseTest {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By searchField = By.cssSelector("input[class=\"search_field\"]");
	public By searchMore = By.cssSelector("a[class=\"post_more search_more\"]");
	public By loadMore = By.cssSelector("span[class=\"viewmore_text_1\"]");
	
	
	
	public void searchField (String textToSearch) {
		
		driver.findElement(searchField).sendKeys(textToSearch);
		driver.findElement(searchMore).click();
		driver.findElement(loadMore).click();
		
	}
	

}
