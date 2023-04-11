package tests;

import utils.BaseTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import pageObjects.ShopPage;

public class Curs14Exercitiu2 extends BaseTest {
	
	@Test(priority = 1)
	public void hooverBlog () {
		
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		menu.hoverElement(menu.postFormatsLink);
		menu.navigateTo(menu.postFormatsLink);
		
		PostFormatsPage postFormatsPage = new PostFormatsPage (driver);
		postFormatsPage.navigateTo(postFormatsPage.audioPost);
		postFormatsPage.navigateTo(postFormatsPage.playSongButton);
		
		postFormatsPage.dragAndDrop(postFormatsPage.volumeInitialPosition, -50, 0);
		
		postFormatsPage.dragAndDrop(postFormatsPage.timeRailInitialPosition, 200, 0);
		
		
	}
		
}
