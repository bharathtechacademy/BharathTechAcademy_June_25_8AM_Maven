package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium W3c Protocol");
	}

}


// new ChromeDriver();

/*
POST /session
 Content-Type: application/json

{
  "capabilities": {
    "alwaysMatch": {
      "browserName": "chrome"
    }
  }
}
*/

//driver.get("https://www.google.com");

/*
POST /session/12345/url
{
  "url": "https://www.google.com"
}

*/