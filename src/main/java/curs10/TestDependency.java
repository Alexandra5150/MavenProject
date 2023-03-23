package curs10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

public class TestDependency {

	@Test(priority = 1)
	public void method1() {
		assertTrue(false);
		System.out.println("method1");
	}
	
	@Test(priority = 2, dependsOnMethods = "method1")
	public void method2() {
		System.out.println("method2");
	}
	
	@Test(priority = 3)
	public void method3() {
		System.out.println("method3");
	}
	
	
	
}
