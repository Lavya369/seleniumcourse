package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class example1 {

	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		// String link1= driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody/tr[9]/td[4]")).getText();
			//System.out.println("link1 :"+ link1);	 
		
		String link2= driver.findElement(By.xpath("//a[contains(text(),'Delton Cables') /parent::td//following-sibling::td[3]")).getText();	
		System.out.println("link2 :"+ link2);	 

	}

}
