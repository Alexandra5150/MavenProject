package curs12;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ImplicitWait extends BaseTest {

	@Test
	public void testWait() throws InterruptedException {
		
		//in link-ul 1, elementul exista in pagina si este hidden
		//astfel incat IMPLICIT WAIT il gaseste si nu se activeaza, nu asteapta
		//in link-ul 2 elementul NU exista -> IMPLICIT WAIT nu il gaseste si se activeaza (il astepta)
		
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
//		Thread.sleep(10000);//bad practice pt ca noi asteptam o conditie sa se indeplineasca		
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(), "Hello World!");
		
		
	}
	
	
	
}
