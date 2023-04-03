package pageObjects;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import utils.BaseTest;


public class SingleAuthorPage extends BaseTest {

	public WebDriver driver;
	
	public SingleAuthorPage (WebDriver driver) {
		this.driver = driver;		
	}
	
	
//	public By dramaSkill = By.cssSelector("div[id=\"sc_skills_diagram_1411881547\"] div[data-stop=\"95\"]");
//	public By biographySkill = By.cssSelector("div[id=\"sc_skills_diagram_1411881547\"] div[data-stop=\"75\"]");
//	public By cookbooksSkill = By.cssSelector("div[id=\"sc_skills_diagram_1411881547\"] div[data-stop=\"82\"]");
	public By dramaSkillData = By.cssSelector("div[data-stop=\"95\"]");
	public By biographySkillData = By.cssSelector("div[data-stop=\"75\"]");
	public By cookbooksSkillData = By.cssSelector("div[data-stop=\"82\"]");
	
	
//	public void checkSkill (By locator) {
//		driver.findElement(locator).isDisplayed();				
//	}
	
}
