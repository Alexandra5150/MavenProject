package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test //executa tot chiar daca fails, putem folosi la smoke test
	public void softAssertion() {
		
		System.out.println("soft assert start");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		
		System.out.println("soft assert continues");
		sa.assertEquals(10, 16);
		sa.assertEquals("Text", "Nimic");
		
		System.out.println("soft assert ends here");
		
		sa.assertAll(); // trb sa o punem mereu ca sa vedem rezultatele lui soft assertion e ca un try-catch
		
	}
	
	
	@Test //nu mai executa nimic dupa ce un pas fails, putem folosi cand e un caz de business
	public void hardAssertion() {
		
		System.out.println("hard assert start");
		assertTrue(false);
		
		System.out.println("soft assert continues");
		assertEquals(10, 16);
		assertEquals("Text", "Nimic");
		
		System.out.println("soft assert ends here");
				
	}
		
}
