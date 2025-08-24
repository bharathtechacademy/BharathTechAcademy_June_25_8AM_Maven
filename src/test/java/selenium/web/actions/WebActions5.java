package selenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions5 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set the path for the ChromeDriver executable
		WebDriver driver = new ChromeDriver();
		
		// 2. Maximize the browser window
		driver.manage().window().maximize();
		
		// 3. Launch the application
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		// 4. Locate the checkbox element
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		// 5.Select the checkbox
		checkbox.click();
		
		// 6. Locate remove checkbox button
		WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
		removeButton.click();
		
		// 7. Wait for the checkbox to be removed
		Thread.sleep(5000); 
		
		// 8. Click on the checkbox 
		checkbox.click();
		
		// 9. Close the browser
		driver.quit();

	}

}
