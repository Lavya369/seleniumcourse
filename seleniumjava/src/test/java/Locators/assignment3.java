package Locators;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3
{


	
	public static void main(String[] args)
	{
		 WebDriverManager.chromedriver().setup();		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
        
        WebDriverWait wait = new WebDriverWait( driver,Duration.ofSeconds(10));
	      String desiredMonth = "April 2025";
	       String desiredDay = "19";

	       while (true)
	       {
	    	   String month =	driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	    	   if(month.equals(desiredMonth))
	    	   {
	    		   break;	
	    	   }
	    	   else 
	    	   {
	    	   
	    		  	driver.findElement(By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();	//next/ 
	    	   }
	    	   	List<WebElement> ele=driver.findElements(By.xpath(" (//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/p"));
        	
	    	   	for(WebElement element:ele) 
	    	   	{	
	    	   		String date= element.getText();
	    	   		if(date.equals(desiredDay)) 
	    	   		{
	    	   			element.click();
	    	   			break;
	    	   		}
	    	   	}
	    	   			
	    	   		
	    	
	       }
      	
        	
	}	
        	
}         	
        	
        	
      
        
