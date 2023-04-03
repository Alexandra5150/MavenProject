package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import pageObjects.SingleAuthorPage;

public class Curs12Exercitiu1 extends BaseTest {

	@Test
	public void checkSkills () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		
		SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(singleAuthor.dramaSkillData));
		wait.until(ExpectedConditions.presenceOfElementLocated(singleAuthor.biographySkillData));
		wait.until(ExpectedConditions.presenceOfElementLocated(singleAuthor.cookbooksSkillData));
		
		WebElement finish = driver.findElement(By.cssSelector("div[id=\"sc_skills_diagram_1411881547\"] div[data-stop=\"95\"]"));
		assertTrue(finish.isDisplayed());
		
		assertTrue(((WebElement) singleAuthor.dramaSkillData).isDisplayed());
		assertTrue(((WebElement) singleAuthor.biographySkillData).isDisplayed());
		assertTrue(((WebElement) singleAuthor.cookbooksSkillData).isDisplayed());
		
		
		
		
		
	}	
	
	
}
