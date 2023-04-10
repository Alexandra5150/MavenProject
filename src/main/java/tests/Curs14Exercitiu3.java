package tests;

import utils.BaseTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;

public class Curs14Exercitiu3 extends BaseTest {
	
	@DataProvider
	public Object[][] checkBooksData(){
		
		HomePage homePage = new HomePage (driver);
		
		Object[][] data = new Object [6][2];
		
		data[0][0] = homePage.theForestBook;
		data[0][1] = "https://keybooks.ro/shop/the-forest/"; ;
		
		data[1][0] = homePage.theSonBook;
		data[1][1] = "https://keybooks.ro/shop/the-son/"; 
		
		data[2][0] = homePage.lifeInTheGardenBook; 
		data[2][1] = "https://keybooks.ro/shop/life-in-the-garden/"; 
		
		data[3][0] = homePage.theLongRoadBook;
		data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		
		data[4][0] = homePage.reallyStrangeStoryBook;		
		data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
		
		data[5][0] = homePage.stormBook;
		data[5][1] = "https://keybooks.ro/shop/storm/";
		
		return data;		        						
	}
	
	
	@Test(dataProvider = "checkBooksData")
	public void checkBooksTest (By book, String url) {
		
		MenuPage menu = new MenuPage(driver);
		HomePage homePage = new HomePage (driver);       		
		
		for(int i=0; i<data.length; i++) {			
			homePage.openBooks(book);					
			assertEquals(driver.getCurrentUrl(), url);
			menu.navigateTo(menu.homePageButton);			
		}

    }
		
	
	
	//@Test
	public void checkBooks () {
		
		MenuPage menu = new MenuPage(driver);		
		HomePage homePage = new HomePage (driver);
		
		homePage.openBooks(homePage.theForestBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
		menu.navigateTo(menu.homePageButton);	
		
		homePage.openBooks(homePage.theSonBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-son/");
		menu.navigateTo(menu.homePageButton);
		
		homePage.openBooks(homePage.lifeInTheGardenBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/life-in-the-garden/");
		menu.navigateTo(menu.homePageButton);
		
		homePage.openBooks(homePage.theLongRoadBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/");
		menu.navigateTo(menu.homePageButton);
		
		homePage.openBooks(homePage.reallyStrangeStoryBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/its-a-really-strange-story/");
		menu.navigateTo(menu.homePageButton);
		
		homePage.openBooks(homePage.stormBook);					
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/storm/");
		menu.navigateTo(menu.homePageButton);				
	}	

}
