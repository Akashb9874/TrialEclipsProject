package com.comprehensive;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BookStore {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.indiabookstore.net/");
		  driver.findElement(By.xpath("//input[@id=\"searchBox\"]")).sendKeys("Selenium testing tools Cookbook ");
		  driver.findElement(By.xpath("//button[@id=\"searchButtonInline\"]")).click();
		  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("(.//div[1]/div[1]/div/img)[2]")).click();
		  Thread.sleep(5000);
	   	String Auther= driver.findElement(By.xpath("//*[@class=\"authorsContainer\"]")).getText();
		System.out.println(Auther);
		Thread.sleep(5000);
		String ISBN= driver.findElement(By.xpath("//div[@class=\"isbnContainer\"]")).getText();
		Thread.sleep(3000);
		System.out.println("BOOK PAGE ISBN = "+ ISBN);
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//div/div/div[2]/div[2]/div[2]/div[3]/a")).click();
		String parent=driver.getWindowHandle();
	      for(String mychild:driver.getWindowHandles())
	      {
	   	   driver.switchTo().window(mychild);
	      }
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,2500)", "");
	       Thread.sleep(8000);
		  String AmISBN=driver.findElement(By.xpath(".//ul/li[5]/span/span[2]")).getText();
		  Thread.sleep(5000);
		  System.out.println("Amazon Page ISBN = "+ AmISBN);
		  Thread.sleep(5000);
		  String a=AmISBN.substring(0,3);
		  String b=AmISBN.substring(4,14);
		  String t=a.concat(b);
		  if(ISBN.equals(t)){
			 System.out.println("ISBN matched");
		   }else  
		   {
			 System.out.println("ISBN NOT matched"); 
		   }
		  String Stock=driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-success\"]")).getText();
		  System.out.println("Availablity = "+ Stock);
		  
		  if(Stock.equals("Only 1 left in stock."))
		  {
			  System.out.println("Book in Stock");
		  }else
		  {
			  System.out.println("Not Avilable");
		  }
		  String Price=driver.findElement(By.xpath("//*[@id=\"price\"]")).getText();
		  String ne=Price.substring(1,8);
		  System.out.println("Price = " + ne);
		  driver.close();
		  driver.quit();
     }
   }
//changes ///
/////
//ok
//tokan   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

