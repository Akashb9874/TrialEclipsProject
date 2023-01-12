package com.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
  @BeforeSuite
  public void BeforeSuite() {
	  System.out.println("In BeforeSuite ");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }  

  @BeforeClass
  public void BeforeClass() {
	  System.out.println("BeforeClass");
  }

  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @Test
  public void Test() {
	  System.out.println("Test");
  }

  @AfterMethod
  public void AfterMethod(){
		System.out.println("AfterMethod");
	  }

  @AfterClass
  public void AfterClass() {
	  System.out.println("AfterClass");
  }

  @AfterTest
  public void AfterTest() { 
  System.out.print("AfterTest");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}
