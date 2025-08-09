package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptionsInSelenium {

	public static void main(String[] args) {
		
//		Add browser options to the Selenium WebDriver to customize the browser's behavior and appearance.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Start the browser maximized
		options.addArguments("--incognito"); // Start the browser in incognito mode
		options.addArguments("--disable-popup-blocking"); // Disable popup blocking
		options.addArguments("--disable-notifications"); // Disable notifications
		options.addArguments("--disable-infobars"); // Disable infobars
		options.addArguments("--disable-extensions"); // Disable browser extensions
		options.addArguments("--allow-notifications");// Allow notifications
		options.addArguments("--ignore-certificate-error");// Ignore certificate errors
		options.addArguments("--lang=en-US"); // Set the browser language to English (US)
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver(options);
		
//		2: Maximize the browser window to full screen
//		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.google.co.in");

	}

}
