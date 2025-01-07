package testNGpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import nov20.BaseTest;

public class Linkstesting extends BaseTest
{
@BeforeMethod
@Parameters	
public	void setup(String btype) throws Exception
{
	
System.out.println("startProcess");
init();
test=getReport().createTest(this.getClass().getName());
test.log(Status.INFO, "Initiating the Property Files...");

launch(btype);
test.log(Status.INFO , "Opened the Browser:-" +getP().getProperty("chromebrowser"));


navigateurl("googleurl");
test.log(Status.PASS , "Navigated to app:-" +getChildProp().getProperty("googleurl"));



}
	
@Test
 public void linktesting()
{
	String expval = "Google Images";
	driver.findElement(By.linkText("Images")).click();
	Reporter.log("clicked on Image link");
	String actval=driver.getTitle();
	
	
	Assert.assertEquals(actval, expval);
	
  }
@AfterMethod
public void tearDown() 
{
System.out.println("endProcess");
getReport().flush();
driver.quit();


}
}
