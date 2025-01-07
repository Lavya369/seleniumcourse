package ammulu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cl0ud
{
	public static   void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		//jsExecutor.executeScript(document.getElementBYTagName("//div[@class='RNNXgb']".setAttribute('Style','border:2px solidred;')));
		
		
	}
	
}


//div[@class='RNNXgb']

//html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]




