package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitMethods {
	
	// Selenium Wait Methods
	
	// 1. Implicit Wait ==> It will wait for a specified amount of time before throwing a "NoSuchElementException" if the element is not found globally.
	// 2. Explicit Wait ==> It will wait for a specific condition to occur before proceeding further in the code. It is applied to a specific element.
	// 3. Fluent Wait ==> It is a more flexible version of Explicit Wait. It allows you to define the polling interval and ignore specific exceptions while waiting for a condition to be met.

	public static void main(String[] args) {
//		1. Launch chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the WebElement
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
//		Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
//		Explicit Wait		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logo));
		
//		Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));
		fluentWait.until(ExpectedConditions.visibilityOf(logo));
	}

}
