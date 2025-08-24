package selenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions6 {

	public static void main(String[] args) {
		
		// 1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Launch the application
		driver.get("https://books-pwakit.appspot.com/");
		
		// 4.Locate the host element
		WebElement hostElement = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		
		// 5. Access the shadow DOM
		SearchContext shadowRoot = hostElement.getShadowRoot();
		
		// 6. Locate the element inside the shadow DOM
		WebElement appHeader = shadowRoot.findElement(By.cssSelector("app-header"));
		
		//7. Locate  the search input field inside the shadow DOM
		WebElement searchInput = appHeader.findElement(By.cssSelector("input#input"));
		searchInput.sendKeys("Sample Book");
		
		//8. close the browser
		driver.quit();

	}
	
	

}
