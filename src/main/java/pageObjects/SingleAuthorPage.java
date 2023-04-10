package pageObjects;

import utils.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import utils.BaseTest;


public class SingleAuthorPage extends BaseTest {

	public WebDriver driver;
	
	public SingleAuthorPage (WebDriver driver) {
		this.driver = driver;		
	}
	
	
	public By dramaSkillData = By.cssSelector("div[data-stop=\"95\"]");
	public By biographySkillData = By.cssSelector("div[data-stop=\"75\"]");
	public By cookbooksSkillData = By.cssSelector("div[data-stop=\"82\"]");
	
	
    public boolean checkSkill (By locator) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       return driver.findElement(locator).isDisplayed();                
   }
	
}
