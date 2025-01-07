package testNGpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import nov20.BaseTest;

  public class RadioButton extends BaseTest
  {
		
		@BeforeMethod
		@Parameters("browser")
		public void beforeMethod(String btype) throws Exception 
		{
			System.out.println("startProcess");
		    init();
		    test = getReport().createTest(this.getClass().getName());
			test.log(Status.PASS, "Initiating the Property Files...");
					
			launch(btype);
			test.log(Status.INFO, "Opened the Browser :- " + getP().getProperty("chromebrowser"));
							
			navigateurl("radiourl");
			test.log(Status.PASS, "Navigated to app :-" + getChildProp().getProperty("radiourl"));
		 }
		
		
		@Test
		public void radioButtonTest()
		{
			WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
			List<WebElement> rbutton=radio.findElements(By.name("group1"));
			for(int i=0;i<rbutton.size();i++)
			{
				System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
			}
		}
	 

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("endProcess");
		  getReport().flush();
			driver.quit();
	  }

}
