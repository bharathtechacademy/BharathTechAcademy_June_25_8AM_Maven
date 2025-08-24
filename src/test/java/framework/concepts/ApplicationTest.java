package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {
		
		CommonFunctions cf = new CommonFunctions();
		AppCommons app = new AppCommons();
		
		cf.startReporting();
		
		// Test Case 1
		System.out.println("=========Executing test case 1==========");
		cf.launchBrowserAndApplication("Chrome", "http://www.icici.com");
		app.loginIntoApplication("testuser", "test@123");
		app.verifyApplicationHomePage();
		System.out.println("Executing test case 1 steps...");
		app.logoutFromApplication();
		cf.closeBrowser();
		
		// Test Case 2
		System.out.println("=========Executing test case 2==========");
		cf.launchBrowserAndApplication("Chrome", "http://www.icici.com");
		app.loginIntoApplication("testuser", "test@123");
		app.verifyApplicationHomePage();
		System.out.println("Executing test case 2 steps...");
		app.logoutFromApplication();
		cf.closeBrowser();
		
		// Test Case 3
		System.out.println("=========Executing test case 3(DATA SET 1)==========");
		cf.launchBrowserAndApplication("Chrome", "http://www.icici.com");
		app.loginIntoApplication("testuser", "test@123");
		app.verifyApplicationHomePage();
		System.out.println("Executing test case 3 steps... with  data set 1");
		app.logoutFromApplication();
		cf.closeBrowser();
		
		// Test Case 4
		System.out.println("=========Executing test case 3(DATA SET 2)==========");
		cf.launchBrowserAndApplication("Chrome", "http://www.icici.com");
		app.loginIntoApplication("testuser", "test@123");
		app.verifyApplicationHomePage();
		System.out.println("Executing test case 3 steps... with  data set 2");
		app.logoutFromApplication();
		cf.closeBrowser();
		
		cf.stopReporting();

	}

}
