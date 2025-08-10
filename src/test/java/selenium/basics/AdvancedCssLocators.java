package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssLocators {
	
	// CSS Selector Syntax 4: Advanced CSS locators with relationship between elements ==> ancestor > parent > child
	
	
	// ancestor :ul[class='leftmenu']
	// parent : li
	// target : a[href='services.htm']
	
	// ul[class='leftmenu'] > li > a[href='services.htm']  ( ancestor > parent > target )
	
	// target --> parent --> ancestor(parent's parent) --> ancestor's parent (grand parent) --> ancestor's parent's parent (grand grand parent)


	public static void main(String[] args) {
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
//		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5: Locate the services left menu link using cssSelector locator -Syntaxt 4
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));
		

	}

}
