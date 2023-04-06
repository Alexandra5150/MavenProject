package tests;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import pageObjects.SearchPage;


public class Curs13Exercitiu2 extends BaseTest {

	
	@Test
	public void checkSocialMedia () {
		
		MenuPage menu = new MenuPage(driver);
		
		
		//rezolvare cu for
		//System.out.println(browserTabs.size());
		
		menu.navigateTo(menu.facebookIcon);
		
		List<String> browserTabs = new ArrayList<> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));		
		assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/keytraining.ro");		
		driver.close();
		
		menu.navigateTo(menu.twitterIcon);
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(),"https://twitter.com/");	
		driver.close();
		
		menu.navigateTo(menu.instagramIcon);
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/");	
		driver.close();
										
	}
				
}
