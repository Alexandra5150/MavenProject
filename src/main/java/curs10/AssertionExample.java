package curs10;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

public class AssertionExample {

	String expectedTitle = "Test";
	String actualTitle = "altceva";
	
	@Test
	public void checkTitle() {
		if (expectedTitle.equals(actualTitle)){
			System.out.println("test is passed");
		}else {
			System.out.println("test is fail");
		}
	}
	
	@Test
	public void checkTitle2() {
		assertEquals(expectedTitle, actualTitle); //hard assertion -> nu mai ruleaza nimic ce e dupa el
	}
	
	//soft assertion putem folosi la smoke test de ex
}
