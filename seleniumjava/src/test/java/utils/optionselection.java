package utils;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class optionselection {

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		Select obj = new Select(element);
		Random r = new Random();
		int randNum = r.nextInt(46);
		System.out.println(randNum);
		
		obj.selectByIndex(randNum);
		System.out.println(obj.getFirstSelectedOption());
		
//		obj.selectByIndex(1);
//		Thread.sleep(2000);
//		
//		obj.selectByVisibleText("Amazon Devices");
//		Thread.sleep(2000);
//		
//		obj.selectByValue("search-alias=fashion");
//		
//		WebElement fOption = obj.getFirstSelectedOption();
//		System.out.println(fOption.getText());
//		
//		List<WebElement> dropOptions = obj.getOptions();
//		System.out.println(dropOptions.size());
//		for(int i=0;i<dropOptions.size();i++)
//		{
//			if(dropOptions.get(i).getText().equals("Books"))
//			{
//				System.out.println(dropOptions.get(i).getText());
//				dropOptions.get(i).click();
//			}
//			 
//		}
		
		
	

	}

}
