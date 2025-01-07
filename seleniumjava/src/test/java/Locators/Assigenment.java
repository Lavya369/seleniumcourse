package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigenment 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	
		String year = "2025";
		String month ="April";
		String  date ="19";
		
		driver.findElement(By.xpath("//i[contains(@class,'sc-cSHVUG NyvQv icon icon-datev2')]")) .click();//opens the date picker
		while(true) 
		{
		String datemonth = driver.findElement(By.xpath("//text[@class='dateText']")).getText()	;
		String arr[]= datemonth.split(" ");
		String dt = arr[0];
		String mon = arr[1];
		if(dt.equalsIgnoreCase(date)&& mon.equals(month) )
			break;
		else 
			driver.findElement(By.xpath(""));
		}
		
	}		
		

}
