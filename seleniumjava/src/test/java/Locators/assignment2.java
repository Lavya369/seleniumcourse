package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2 
{

    private static final Object desiredYear = null;

	public static void main(String[] args) throws InterruptedException
    {
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.redbus.in/");

		       
				driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
				String desired_month ="April 2025";

						

		       String desiredDate = "20";

		        while (true)
		        {
		           String actualMonthYear = driver.findElement(By.xpath("//div/div[2][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']")).getText();
		           String[] actualMonthYearArray = actualMonthYear.split(" ");
		           String actualMonth = actualMonthYearArray[0];
		           String actualYear = actualMonthYearArray[1];

		            if (actualMonth.equals(desired_month) && actualYear.equals(desiredYear)) {
		               System.out.println("Desired month and year found: " + actualMonth + " " + actualYear);
		                break;
		            } else {
		                System.out.println("Actual month and year: " + actualMonth + " " + actualYear);
		                driver.findElement(By.xpath("//div/div[3][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']")).click();
		          }
		        }

		      driver.findElement(By.xpath("//td[@class='wd day'][contains(text(),'" + desiredDate + "')]")).click();

		       Thread.sleep(3000);

		      //  driver.quit();
		   // }

    }
}  
	

