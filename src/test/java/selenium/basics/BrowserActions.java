package selenium.basics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserActions {

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Minimize the browser window
		driver.manage().window().minimize();
		
//		3: Set the browser window size to a custom resolution (430 x 932)
		driver.manage().window().setSize(new Dimension(430, 932));
		
//		4: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		5: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		6: Open Google India homepage
		driver.get("https://www.google.co.in");
		
//		7: Verify the application title matches the expected title "Google"
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
		
//		8: Navigate to Selenium official website
		driver.navigate().to("https://www.selenium.dev");
		
//		9: Navigate back to the previous page (Google)
		driver.navigate().back();
		
//		10: Navigate forward to the next page (Selenium)
		driver.navigate().forward();
		
//		11: Refresh the current page
		driver.navigate().refresh();
		
//		12: Get the main window handle (unique ID of the current browser window)
		String mainWindowHandleId = driver.getWindowHandle();
		System.out.println("Main Window Handle: " + mainWindowHandleId);
		
//		13: Open a new tab and navigate to Yahoo Search India
		driver.switchTo().newWindow(WindowType.TAB);		
		driver.get("https://in.search.yahoo.com");
		String newTabHandleId = driver.getWindowHandle();
		System.out.println("New Tab Handle: " + newTabHandleId);
		
//		14: Switch back to the main browser window
		driver.switchTo().window(mainWindowHandleId);
		
		//All window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: " + allWindowHandles);
				
//		15: Open a new window and navigate to Para Bank application
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		16: Switch back to the main browser window
		driver.switchTo().window(mainWindowHandleId);

//		17: Print the current page URL in the console		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Page URL: " + currentUrl);		
				
//		18: Get and print the size of the browser window (width x height)
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("Browser Window Size: " + width + " x " + height);
		
//		19: Close the current browser window
		driver.close();
		
//		20: Close all remaining browser windows and end the session
		driver.quit();	
		
	}

}
