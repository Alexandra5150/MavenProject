package tests;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class IFrameExample extends BaseTest {
	
	
	
	@Test
	public void iframeTest () throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		ContactsPage contactPage = new ContactsPage(driver);
		
		menu.navigateTo(menu.contactsLink);
		contactPage.zoomMap(contactPage.zoomOutButton);
		
		Thread.sleep(3000);
		
		System.out.println("1 = " + driver.getWindowHandles());
		contactPage.redirectMap();
		
		Thread.sleep(3000);
		
		System.out.println("2 = " + driver.getWindowHandles());
		
		List<String> browserTabs = new ArrayList<> (driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		driver.close();
		
		
		
	}
	
	

}
