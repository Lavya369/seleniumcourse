package nov20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttestcase {

	public static void main(String[] args)
	{
		
		WebDriver driver;
		
		
		//WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver1 =new FirefoxDriver(); 
		//driver1.get("https://www.flipkart.com/");
		
				//WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver(); 
			driver.get("https://www.flipkart.com/");
				
		
		//WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
		driver.get( "https://www.amazon.in/");
		
		
		
		
		
	}

	
}
