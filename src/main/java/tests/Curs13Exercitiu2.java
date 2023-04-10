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
        
        By[] icons = new By[3];
        icons[0] = menu.instagramIcon;
        icons[1] = menu.facebookIcon;
        icons[2] = menu.twitterIcon;
       
        String[] expectedURLS = new String[3];
        expectedURLS[0] = "https://www.instagram.com/";
        expectedURLS[1] = "https://www.facebook.com/keytraining.ro";
        expectedURLS[2] = "https://twitter.com/";

       
        for(int i=0; i<icons.length; i++) {
           
            menu.navigateTo(icons[i]);

            List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(browserTabs.get(1));
            assertEquals(driver.getCurrentUrl(),expectedURLS[i]);
          
            driver.close(); 

            driver.switchTo().window(browserTabs.get(0));
        }
	}
				
}
