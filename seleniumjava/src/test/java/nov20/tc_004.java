package nov20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class tc_004 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		test = getTest();
		test = getReport().createTest("TC_004");
		test.log(Status.INFO, "init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Opened the Browser : " +  getP().getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		test.log(Status.INFO, "Opened the application : " + getChildProp().getProperty("amazonurl"));
		
		WebElement element = driver.findElement(By.linkText("Best Sellers"));
		String actualLink = element.getText();
		String expectedLink =  "Best Seller";
		
		if(actualLink.equals(expectedLink))
			reportPass("Both links are equal...");
		else
			reportFailure("Both links are not equal...",element);
		
		getReport().flush();
	}

	

}
//System.out.println("Both links are equals");
//System.out.println("Both links are  not equals ...");
