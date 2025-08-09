package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {

	public static void main(String[] args) {
		
		//1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//2. Navigate to the URL "https://www.google.com"
		//3. close the browser window

	}

}
