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
		
        assertTrue(singleAuthor.checkSkill(singleAuthor.dramaSkillData));
        assertTrue(singleAuthor.checkSkill(singleAuthor.biographySkillData));
        assertTrue(singleAuthor.checkSkill(singleAuthor.cookbooksSkillData));						
	}	
		
}
