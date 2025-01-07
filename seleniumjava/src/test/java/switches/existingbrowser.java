package switches;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class existingbrowser 
{

	public static void main(String[] args) throws IOException
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
//		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
//		Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");

//		Runtime.getRuntime().exec("killall -9 Google Chrome");
//		Runtime.getRuntime().exec("killall -9 firefox");
//		Runtime.getRuntime().exec("killall -9 Microsoft Edge");
//		Runtime.getRuntime().exec("killall -9 Safari");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}
