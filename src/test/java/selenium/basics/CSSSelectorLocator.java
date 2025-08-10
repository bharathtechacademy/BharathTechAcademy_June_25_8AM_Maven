package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {
	
	// CSS Selector ==> CSS Selector is a pattern that is used to select the element based on the CSS properties of the element.
	
	// CSS Selector Syntax 1: tagName#id
	// CSS Selector Syntax 2: tagName.className
	// CSS Selector Syntax 3: tagName[attribute='value']
	// CSS Selector Syntax 4: Advanced CSS locators with relationship between elements ==> ancestor > parent > child
	
	public static void main(String[] args) {
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
//		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.google.co.in");
		
//		5: Locate the search box using cssSelector locator -Syntaxt 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		6: Locate the search box using cssSelector locator -Syntaxt 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		7: Locate the search box using cssSelector locator -Syntaxt 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));

	}

}
