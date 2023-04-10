package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ShippingPage {
	
	public WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By dropDownCountry = By.name("shipping_country");
	public By dropDownProvince = By.name("shipping_state");
	
	
	public void selectByIndex (int index) {		
		WebElement orderDropDown = driver.findElement(dropDownCountry);
		Select selectObj = new Select(orderDropDown);
		selectObj.selectByIndex(index);		
	}
	
	public void selectByValue(String value) {		
		WebElement orderDropDown = driver.findElement(dropDownProvince);
		Select selectObj = new Select(orderDropDown);
		selectObj.selectByValue(value);		
	}
	
	public String getSelectedOptionCountry () {		
		WebElement orderDropDown = driver.findElement(dropDownCountry);
		Select selectObj = new Select(orderDropDown);
		return selectObj.getFirstSelectedOption().getText();		
	}
	
	public String getSelectedOptionProvince () {		
		WebElement orderDropDown = driver.findElement(dropDownProvince);
		Select selectObj = new Select(orderDropDown);
		return selectObj.getFirstSelectedOption().getText();		
	}

}
