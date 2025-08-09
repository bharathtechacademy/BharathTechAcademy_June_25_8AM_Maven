package methodsInJava;

public class WithMethods {
	
	public static void main(String[] args) {
		
		WithMethods obj = new WithMethods();
		
		System.out.println("***********Test Case 1************");		
		obj.launchBrowserAndApplication("chrome");
		obj.loginToApplication("Bharath", "bharath123");
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutFromApplication();		
		
		System.out.println("***********Test Case 2************");		
		obj.launchBrowserAndApplication("firefox");
		obj.loginToApplication("Bharath", "bharath123");
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutFromApplication();		
		
		System.out.println("***********Test Case 3************");		
		obj.launchBrowserAndApplication("edge");
		obj.loginToApplication("Bharath", "bharath123");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutFromApplication();		
		System.out.println("***********Test Case 3-Invalid************");
		obj.launchBrowserAndApplication("edge");
		obj.loginToApplication("Invalid", "invalid123");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutFromApplication();		
		
		System.out.println("***********Test Case 4************");	
		obj.launchBrowserAndApplication("chrome");
		obj.loginToApplication("Bharath", "bharath123");
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		obj.logoutFromApplication();
	}
	
	void launchBrowserAndApplication(String browserName){
		System.out.println("Launch the "+browserName+" browser");
		System.out.println("Enter url https://www.icici.com/ and launch application");		
	}	

	void loginToApplication(String username, String password){
		System.out.println("Enter username as "+username);
		System.out.println("Enter password as "+password);
		System.out.println("Click on Login button");
	}
	
	void logoutFromApplication(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	double getAccountBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;
	}

}
