package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aaa {
	WebDriver driver;
	WebElement user,pass,submit,logout;
  @BeforeSuite
  public void Login() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
  }
  
 @BeforeTest
  public void LunchSite(){
	 driver.get("file:///D:/Testing%20Training/Selenium%20Training/Offline%20Website/Offline%20Website/index.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
  @BeforeClass
  public void FindElement() {
	 user= driver.findElement(By.id("email"));
	 pass=driver.findElement(By.id("password"));
	 submit= driver.findElement(By.id("submit"));
  }
  
  @Test
   public void doLogin(){
	  user.sendKeys("queuecodes@gmail.com");
	  pass.sendKeys("123456");
	  submit.click();
  }
  
  @AfterMethod
  public void DoVerify() {
	  Assert.assertEquals(driver.getTitle(),"Queue Codes | Dashboard");
  }
	  
  @AfterTest
  public void Dologout() {
	  logout=driver.findElement(By.id("hlogout"));
	  logout.click();
  }
  
  @AfterSuite
  public void tearDown()
  {
	  driver.close();
  }
  }

