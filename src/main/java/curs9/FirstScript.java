package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
//		ChromeOptions chOpt = new ChromeOptions();
//		chOpt.addArguments("--remote-allow-origins=*");
//		WebDriver chrome = new ChromeDriver(chOpt);
//		chrome.get("https://keybooks.ro/");
		
		driver = new FirefoxDriver();
		driver.get("https://keybooks.ro/");
	}
	
	
	@Test
	public void openBrowser () throws InterruptedException {
		
		//driver.getTitle();
		
		System.out.println("Title is: " + driver.getTitle());
		
		driver.findElement(By.linkText("CONTACTS")).click();
		//Thread.sleep(4000); -> il folosim doar cand scriem testele, apoi stergem pt ca este bad practice					
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();		
	}
	
	
}
