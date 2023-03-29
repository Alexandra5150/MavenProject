package curs11;

import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Exercitiu extends BaseTest {
	
	@Test
	public void homework () {
		
		WebElement theForestBook = driver.findElement(By.cssSelector("a[href=\"the-forest\"]"));
		theForestBook.click();
		
		WebElement reviews = driver.findElement(By.cssSelector("a[href=\"#tab-reviews\"]"));
		reviews.click();
		
		WebElement rememberMe = driver.findElement(By.cssSelector("input[id=\"wp-comment-cookies-consent\"]"));
		assertFalse(rememberMe.isSelected());
		
		WebElement submit = driver.findElement(By.cssSelector("input[id=\"submit\"]"));
		submit.click();
		
		driver.switchTo().alert().accept();
		
		WebElement star = driver.findElement(By.cssSelector("a[class=\"star-4\"]"));
		star.click();
		
		WebElement comment = driver.findElement(By.cssSelector("textarea[id=\"comment\"]"));
		comment.click();
		comment.sendKeys("text text text");
		
		WebElement name = driver.findElement(By.cssSelector("input[id=\"author\"]"));
		name.click();
		name.sendKeys("TestUserName");
		
		WebElement email = driver.findElement(By.cssSelector("input[id=\"email\"]"));
		email.click();
		email.sendKeys("abcd@abcd.com");
		
		rememberMe.click();
		assertTrue(rememberMe.isSelected());
		
		submit.click();
		
		WebElement result = driver.findElement(By.cssSelector("em[class=\"woocommerce-review__awaiting-approval\"]"));		
		assertEquals(result.getText(), "Your review is awaiting approval");
		
	}
	
}
