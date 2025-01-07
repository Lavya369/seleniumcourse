package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Hadoop");
		Thread.sleep(3000);
		List<WebElement> listElements = driver.findElements(By.xpath("//div[@id='Alh6id']//ul/li/div//descendant::div[@class='wM6W7d']/span"));
		
		System.out.println("Elements size:"+listElements.size());
		
		for(int i=0;i<listElements.size();i++)
		{
			
			if(listElements.get(i).getText().contains("hadoop meaning"))
			{
				listElements.get(i).click();
				break;
			}
			//listElements.get(i).click();
			//listElements.get(i).sendKeys(Keys.ENTER);
			//break;
				
		}
			 

	}

}
