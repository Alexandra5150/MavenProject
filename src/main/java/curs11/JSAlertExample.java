package curs11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSAlertExample extends BaseTest {

	
	//@Test
	public void simpleJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		
		Alert alertJs = driver.switchTo().alert();
		alertJs.accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id=\"result\"]"));		
		assertEquals(result.getText(), "You successfully clicked an alert");										
	}
	
	
	//@Test
	public void confirmJsAlert () throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss(); 
//		switchTo se mai foloseste si la:  
//		driver.frame -> tag-ul iframe (pagina html in pagina html)
//		driver.newWindow -> daca am mai multe tab-uri, ferestre, in cazul in care se fac anumite redirect-uri
		
		WebElement result = driver.findElement(By.cssSelector("p[id=\"result\"]"));		
		assertEquals(result.getText(), "You clicked: Cancel");				
	}
	
	
	@Test
	public void promtJsAlert () throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("test"); 
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id=\"result\"]"));		
		assertEquals(result.getText(), "You entered: test");				
	}
	
}
