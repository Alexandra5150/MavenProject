package curs10;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class Exercitiu1 extends BaseTest {

	@Test
	public void displayElements() {
	
    //verificam daca elementul e vizibil inainte de click pe login
    WebElement logingemail = driver.findElement(By.id("log"));

    //verificam daca elementul e vizibil inainte de click pe login
    WebElement password = driver.findElement(By.id("password"));

    SoftAssert sa = new SoftAssert();
    sa.assertFalse(logingemail.isDisplayed());
    sa.assertFalse(password.isDisplayed());

    //accesam login
    WebElement login = driver.findElement(By.className("menu_user_login"));
    login.click();

    //verificam daca elementul e vizibil dupa click pe login
    sa.assertTrue(logingemail.isDisplayed());

    //verificam daca elementul e vizibil dupa click pe login
    sa.assertTrue(password.isDisplayed());
    sa.assertAll();
	
	}
	
}
