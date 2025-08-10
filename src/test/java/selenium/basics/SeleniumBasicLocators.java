package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicLocators {
	
	// 1. ID  ==> id attribute value of the element with in the HTML
	// 2. Name  ==> name attribute value of the element with in the HTML
	// 3. Class Name ==> class attribute value of the element with in the HTML
	// 4. Tag Name ==> Html tag name of the element with in the HTML
	// 5. Link Text  ==> Text value of the hyperlink element with in the HTML
	// 6. Partial Link Text ==> Partial text value of the hyperlink element with in the HTML

	public static void main(String[] args) {

//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
//		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.google.co.in");
		
//		5: Locate the search box using ID locator
		driver.findElement(By.id("APjFqb"));
		
//		6: Locate the search box using name locator
		driver.findElement(By.name("q"));
		
//		7: Locate the search box using Class Name locator
		driver.findElement(By.className("gLFyf"));
		
//		8: Locate the search box using Tag Name locator
		driver.findElement(By.tagName("textarea"));
		
//		9: Locate the 'How Search Works' using  link text locator
		driver.findElement(By.linkText(" How Search works "));
		
//		10: Locate the 'How Search Works' using  partial link text locator
		driver.findElement(By.partialLinkText("How Search"));

		
	}

}
