package curs10;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import utils.BaseTest;

public class Exercitiu1 extends BaseTest {

	@Test
	public void displayElements() {
	WebElement login = driver.findElement(By.linkText("Login"));
	assertTrue(login.isDisplayed());
	login.click();
	
	WebElement username = driver.findElement(By.id("log"));
	assertTrue(username.isDisplayed());
	
	WebElement password = driver.findElement(By.id("password"));
	assertTrue(username.isDisplayed());
	
	}
	
}
