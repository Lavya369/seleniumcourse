package nov20;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager  extends BaseTest
{
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{ 
		if(htmlreport == null)
		{
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir")+"//report//htmlreport.html");
		htmlreport.config().setDocumentTitle("Atomation Report");
		htmlreport.config().setReportName("Functional Report");
		htmlreport.config().setTheme(Theme.STANDARD);
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("os", System.getProperty("os.name"));
		report.setSystemInfo("os Version", System.getProperty("os.version"));
		report.setSystemInfo("TesterName", System.getProperty("user.name"));
		report.setSystemInfo("Browser", getP().getProperty("chromebrowser"));
		//report.setSystemInfo("Browser", ((RemoteWebDriver) driver).getCapabilities().getBrowserName());
		//report.setSystemInfo("Browser Version", ((RemoteWebDriver) driver).getCapabilities().getBrowserVersion());
		
		report.setSystemInfo("Environment", getMainProp().getProperty("env"));

		
		}
		return report;
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
