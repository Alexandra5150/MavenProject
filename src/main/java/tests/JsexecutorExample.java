package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsexecutorExample extends BaseTest {
	
	//@Test
	public void manageBrowserPage () {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location = 'http://emag.ro'");
		jse.executeScript("window.history.go(-1)");
		
//		ordine de rulare: driver > action > javascriptexecutor (jsexe nu are sugestii si nu arata erori in eclipse)
		
		//Refresh la pagina
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5);
		jse.executeScript("window.history.go(0)");						
	}
	
	
	//@Test
	public void jsScroll () throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 1000)"); //prima valoare e pt orizontal, a doua e pt vertical,
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");//scroll pana la sf paginii
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");//scroll pana la inceputul paginii
		Thread.sleep(3000);
		
		WebElement signUpButton = driver.findElement(By.cssSelector("input[value=\"Sign up\"]"));
		
		//jse.executeScript("arguments[0].scrollIntoView()", signUpButton);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.moveToElement(signUpButton).perform();				
	}
	
	
	@Test
	public void jsExample () throws InterruptedException {
		
		WebElement searchIcon = driver.findElement(app.menu.searchButton);		
		WebElement searchField = driver.findElement(app.search.searchField);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		
		//1 click and send keys
		//jse.executeScript("arguments[0].click()", searchIcon);
		//jse.executeScript("arguments[0].value='cooking'", searchField);
		//jse.executeScript("arguments[0].click()", searchIcon);
		//2 one liner
		//jse.executeScript("arguments[0].click(), arguments[1].value='cooking', arguments[0].click()", searchIcon, searchField);
		
		//3 pur js executor
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");		
	}
		
}
