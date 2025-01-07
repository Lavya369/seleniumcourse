package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class anu {

	public static   void main(String[] args) throws InterruptedException 
	{
		   WebDriverManager.chromedriver().setup();		 
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.redbus.in/");
		   
		   driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
			String desired_monthyear ="April 2025";

		   while(true) 
		   {
			   WebElement monthyearHoliday=driver.findElement(By.xpath("(//div/div[2][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])"));
			   
			   String Fulltext = monthyearHoliday.getText();
			   String[]parts = Fulltext.split("\\s+");
			   
			   String monthyear= parts[0]+" "+parts[1];
			   System.out.println( "FullText:"+Fulltext);
			   
			   System.out.println("extracted month and year:" +monthyear);
			   if(monthyear.equals(desired_monthyear))
			   {
				   break;
				   
			   }
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("(//div/div[3][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])")).click();
			   

			   
		   }
		   Thread.sleep(1000);
		   int desiredDay=26;
		   
		   try 
		   {
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			 
			 WebElement	 dateElement = driver.findElement(By.xpath("//span[text()='"+desiredDay+"')"));
			 
			 wait.until(ExpectedConditions.elementToBeClickable(dateElement));
			 
			 JavascriptExecutor js= (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", dateElement);
			 
			 System.out.println( "date selected successfully"); 
		   }
		   catch(Exception e) 
		   {
			 System.out.println("Unable to select the date:" +e.getMessage());  
		   }
		   	finally 
		   	{
		   		driver.quit();
		   	}
		   	
	}



}
