package testng.framework.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestNGWebCommons {

	@BeforeSuite(alwaysRun=true)
	public void startReporting() {
		System.out.println("Reporting process started.....");
	}
	
	@AfterSuite(alwaysRun=true)
	public void stopReporting() {
		System.out.println("Reporting process stopped and Report generated.....");
	}
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"BROWSER","URL"})
	public void launchBrowserAndApplication(String browser, String url) {
		System.out.println(browser+" is launched...");
		System.out.println(url+" is launched...");
	}
	
	@AfterMethod(dependsOnMethods= {"logoutFromApplication"},alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Browser is closed....");
	}

}
