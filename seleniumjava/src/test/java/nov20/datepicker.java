package nov20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args)
	{
		   WebDriverManager.chromedriver().setup();		 
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   driver.get("https://jqueryui.com/datepicker/");
		   
		   //method1 using sendkeys()
		  // driver.switchTo().frame(0);//switch to frame
		   //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/02/2024");
		   
		  //expected data 
		   String year="2025";
		   String month="may";
		   String date="20";
		   
		   driver.findElement(By.xpath("//input[@id='datepicker']")).click();//open date picker
		   //select month and year
		   while(true)
		   {
			    String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			   String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year
			   
			   if(currentmonth.equals(month)&&currentyear.equals(year))
			   { 
				   break;
			   }
			   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next
		   } 
	}

}
