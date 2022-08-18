package MyTestNGprog;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotattionsTestNG {
  @Test
  public void f1() 
  {
	  System.out.println("This is First @Test Method Method");
  }
  
  @Test
  public void f2()
  {
	 System.out.println("This is second @Test Method"); 
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("BEFORE METHOD Executes *before EACH TEST* ");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("AFTER METHOD Executes *after EACH TEST* ");
  }

  @BeforeClass
  public void beforeClass() 
  {

	  System.out.println("Before class execute *BEFORE FIRST METHOD OF THAT CLASS* ");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class execute *AFTER LAST METHOD OF THAT CLASS*");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test runs *BEFORE THE EXECUTION OF ALL THE TEST METHODS* ");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test runs *AFTER THE EXECUTION OF ALL THE TEST METHODS BUT AFTER @BeforeSuite* ");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suite Execute *BEFORE ALL TEST METHODS");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suite Execute *AFTER ALL TEST METHODS");
  }

}
