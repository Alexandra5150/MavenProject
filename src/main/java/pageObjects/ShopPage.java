package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseTest;

public class ShopPage extends BaseTest {

	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By dropDown = By.name("orderby");
	
	
	public void selectByValue(String value) {		
		WebElement orderDropDown = driver.findElement(dropDown);
		Select selectObj = new Select(orderDropDown);
		selectObj.selectByValue(value);		
	}
	
	
	public String getSelectedOption () {		
		WebElement orderDropDown = driver.findElement(dropDown);
		Select selectObj = new Select(orderDropDown);
		return selectObj.getFirstSelectedOption().getText();		
	}
	
	
	public void selectByIndex (int index) {		
		WebElement orderDropDown = driver.findElement(dropDown);
		Select selectObj = new Select(orderDropDown);
		selectObj.selectByIndex(index);		
	}
	
	
	public void selectByVisibleText (String text) {		
		WebElement orderDropDown = driver.findElement(dropDown);
		Select selectObj = new Select(orderDropDown);
		selectObj.selectByVisibleText(text);		
	}
	
}
