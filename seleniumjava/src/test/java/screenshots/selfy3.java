package screenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selfy3 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String link1 = driver.findElement(By.linkText("Best Sellers")).getText();
		System.out.println("Link Name is:"+link1);
		
		String link2 = driver.findElement(By.linkText("Best Sellers")).getAttribute("innerText");
		System.out.println("Link Name is:"+link2);
		
		List<WebElement> link3 = driver.findElements(By.tagName("a"));//get all links using tagname
		System.out.println(link3.size());
		
		for(int i=0;i<link3.size();i++)
		{
			if(!link3.get(i).getText().isEmpty())//print without emptyspace
			{
			System.out.println(link3.get(i).getText());
			}
		}
			
		 List<WebElement> link4 = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int j=0; j<link4.size();j++)
		{
			System.out.println(link4.get(j).getText());
		}
		
	}

}
