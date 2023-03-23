package curs10;

import org.testng.annotations.*; // * = importa tot
//import org.testng.annotations.BeforeSuite;

public class BeforeAfter {

	@BeforeSuite
	public void beforeSuite () {		
		System.out.println("before suite");		
	}
	
	@AfterSuite
	public void afterSuite () {		
		System.out.println("after suite");		
	}
	
	//@BeforeTest = se refera la tag-ul TEST din tesng.xml
	
	@BeforeClass
	public void beforeClass () {		
		System.out.println("before Class");		
	}
	
	@AfterClass
	public void afterClass () {		
		System.out.println("after Class");		
	}
	
	@BeforeMethod
	public void beforeMethod () {		
		System.out.println("before Method");		
	}
	
	@AfterMethod
	public void afterMethod () {		
		System.out.println("after Method");		
	}
	
	@Test
	public void test1 () {
		System.out.println("test1");
	}
	
	@Test
	public void test2 () {
		System.out.println("test2");
	}
	
}
