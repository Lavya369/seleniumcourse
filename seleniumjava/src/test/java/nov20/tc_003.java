package nov20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import org.apache.log4j.Logger;

public class tc_003 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		test = getTest();
		test = getReport().createTest("TC_003");
		test.log(Status.INFO, "init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Opened the Browser : " +  getP().getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		test.log(Status.INFO, "Opened the application : " + getChildProp().getProperty("amazonurl"));
		
		selectDropdownOption("amazonsearchdropbox_id","Books");
		test.log(Status.PASS, "select Dropdown Option By using locator : " + getOrProp().getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.FAIL, "Entered the search text By using locator : " + getOrProp().getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked on Element By using locator :" + getOrProp().getProperty("amazonsearchbutton_xpath"));
			
		getReport().flush();
		
	}
		
	}
		
		
		
		
				
					
					
			

	

