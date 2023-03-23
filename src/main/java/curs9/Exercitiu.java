package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Facem o clasa noua care va contine metodele scrise astazi @BeforeClass si @AfterClass (le puteti lua cu copy paste din cursul de astazi)
//Facem o metoda noua pe care o numim Login
//Folosind exemplul de astazi unde dam click pe butonul de Login si in pop-ul care a aparut am scris in input-ul username, vom introduce urmatoarele date :
//La username :TestUser
//La password :12345@67890
//Dupa care vom da click pe butonul Login

public class Exercitiu {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://keybooks.ro/");
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();		
	}
	
	@Test(priority = 1)
	public void Login() {
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
	}
	
	@Test(priority = 2)
	public void username() {
		
		WebElement username = driver.findElement(By.id("log"));
		username.sendKeys("TestUser");
	}
	
	@Test(priority = 3)
	public void password() {
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345@67890");
	}
	
	
	@Test(priority = 4)
	public void loginSubmit() {
		
		WebElement loginSubmit = driver.findElement(By.className("submit_button"));
		loginSubmit.click();
	}
	
	
}
