package testNGpackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import nov20.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest														//dec17
{
	
	 @BeforeMethod
	  public void startUp(Method method) throws Exception 
	  {
		  System.out.println(method.getName() +"  has started...");
		  	Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		    init();
			test = getTest();
			test = getReport().createTest(this.getClass().getName());
			test.log(Status.INFO, "init the properties files....");
			
			launch("chromebrowser");
			test.log(Status.INFO, "Opened the Browser : " +  getP().getProperty("chromebrowser"));
			
			navigateurl("amazonurl");
			test.log(Status.INFO, "Opened the application : " + getChildProp().getProperty("amazonurl"));
	  }	
		
	  @Test
	  public void amazonAction(Method method) 
	  {
		  System.out.println(method.getName() +"  is Executing...");
		    selectDropdownOption("amazonsearchdropbox_id","Books");
			test.log(Status.PASS, "select Dropdown Option By using locator : " + getOrProp().getProperty("amazonsearchdropbox_id"));
			
			typeText("amazonsearchtextbox_id","Harry Potter");
			test.log(Status.FAIL, "Entered the search text By using locator : " + getOrProp().getProperty("amazonsearchtextbox_id"));
			
			clickElement("amazonsearchbutton_xpath");
			test.log(Status.INFO, "Clicked on Element By using locator :" + getOrProp().getProperty("amazonsearchbutton_xpath"));
	  }
	  

	  @AfterMethod
	  public void packUp(Method method) 
	  {
		  System.out.println(method.getName() +"  has ended...");
		  getReport().flush();
		  driver.quit();
	  }

}
