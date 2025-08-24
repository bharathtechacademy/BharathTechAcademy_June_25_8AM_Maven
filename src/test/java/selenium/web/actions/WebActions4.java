package selenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions4 {

	public static void main(String[] args) {
		// 1. Launch browser window
		WebDriver driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application (https://jqueryui.com/slider/)
		driver.get("https://jqueryui.com/slider/");
		
		//wait for the page to load completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Slider']"), 0));

		// 5. Switch to iframe containing slider
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		// 6. Locate slider element
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));

		// 7. Locate slider handle 
		WebElement sliderHandle = slider.findElement(By.xpath("//span[contains(@class,'slider-handle')]"));
		
		// 8. Use Actions class to drag the slider
		Actions actions = new Actions(driver);

		// Move slider handle by 200 pixels to the right
		actions.dragAndDropBy(sliderHandle, 100, 0).perform();
		actions.dragAndDropBy(sliderHandle, 100, 0).perform();
	

		// Move slider handle back to the left by 100 pixels
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();
		
		//Switch back to the main content
		driver.switchTo().defaultContent();
		
		// Print Slider header text
		WebElement header = driver.findElement(By.xpath("//h1[text()='Slider']"));
		System.out.println("Slider Header: " + header.getText());

		// 9. Close the browser
		driver.quit();

	}

}
