package nov20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.apache.log4j.Logger;

public class tc_002 extends BaseTest
{
		private final static Logger log = Logger.getLogger(tc_002.class);

	public static void main(String[] args) throws Exception
	{
		init();
		log.info("init the properties files....");
		
		launch("chromebrowser");
		log.info("Opened the Browser : " +  getP().getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		log.info("Opened the application : " + getChildProp().getProperty("amazonurl"));
		
		selectDropdownOption("amazonsearchdropbox_id","Books");
		log.info("select Dropdown Option By using locator : " + getOrProp().getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Entered the searc text By using locator : " + getOrProp().getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element By using locator :" + getOrProp().getProperty("amazonsearchbutton_xpath"));
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys(Keys.ENTER);
	}

				
					
					
			

	
}
