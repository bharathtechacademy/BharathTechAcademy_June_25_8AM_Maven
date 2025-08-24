package selenium.web.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Reports;
import utilities.WebCommons;

public class WebActions7 extends WebCommons{
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//Start the report
		Reports.setupReport();
		
//		1. Launch chrome browser window
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run the browser in headless mode (without GUI)
		driver = new ChromeDriver(options);
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
		//Start the test in the report (TEST CASE 1)
		Reports.startTest("Verify Parabank Login with Invalid Credentials");
		
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		log("info", "Application is launched successfully");
		
//		5. Verify application title
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Application title does not match!");
		log("pass", "Application title is verified successfully");
		
//		6. Verify application logo 
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Application logo is not displayed!");
		log("pass", "Application logo is verified successfully");
		takeScreenshot(logo, "ApplicationLogo");
		
//		7. Verify application caption		
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));		
		String expectedCaption = "Experience the difference";
		String actualCaption = caption.getText();
		Assert.assertEquals(actualCaption, expectedCaption, "Application caption does not match!");
		log("pass", "Application caption is verified successfully");
		
//		8. Enter Invalid credentials in Username and Password textboxes
		
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		log("info", "Entering invalid credentials in username and password fields");
		
		//clear any existing text in the fields
		usernameField.clear();
		passwordField.clear();
		
		// Enter invalid credentials
		usernameField.sendKeys("invalidUser");
		passwordField.sendKeys("invalidPass");
		
//		9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		Wait for error message to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
		
//		10. Verify error message is displayed (The username and password could not be verified.)		
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		String expectedErrorMessage = "The username and password could not be verified.";
		String actualErrorMessage = errorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match!");
		log("pass", "Error message is verified successfully");
		logScreenshot(driver,"InvalidLogin");

		//stop the test and end the report
		Reports.endReport();
		
		//Start a new test in the report (TEST CASE 2)
		
		
		Reports.startTest("Verify Admin Page Functionality");
//		11. Click on Adminpage link		
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();				
		
//		12. Wait for admin page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		log("pass", "Admin page is displayed successfully");
		
//		13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		log("info", "Data access mode is selected as SOAP successfully");
		
//		14. Scrolldown till Loan provider		
		WebElement loanProviderDropdown = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loanProviderDropdown);		
		
//		15. Select Loanprovider as 'Web Service'
		Select selectLoanProvider = new Select(loanProviderDropdown);
		selectLoanProvider.selectByVisibleText("Web Service");
		log("info", "Loan provider is selected as Web Service successfully");
		
//		16. Click on Submit button		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		log("info", "Clicked on Submit button successfully");
		
//		17.wait for Successful submission message		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		log("pass", "Settings saved successfully message is displayed");
		logScreenshot(driver,"Settings");
		//Stop the test and end the report
		Reports.endReport();
				
//		18.Click on Services Link		
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//		19.Wait for Services page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookstoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookstoreServices);
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rowElements = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]/child::tbody/child::tr"));
		List<WebElement> columnElements = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]/child::tbody/child::tr[1]/child::td"));

		int totalRows = rowElements.size();
		int totalColumns = columnElements.size();
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		for(int row=1; row <= totalRows; row++) {
			for(int col=1; col <= totalColumns; col++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]/child::tbody/child::tr["+row+"]/child::td["+col+"]"));
				String cellData = cell.getText();
				System.out.println("Row " + row + ", Column " + col + " Value is : " + cellData);
			}
			
		}
		
//		24.Close browser window
		driver.quit();

	}
	
	public static void selectDataAccessMode(String option) {
		WebElement dataAccessModeRadioButton = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dataAccessModeRadioButton.click();
	}

}
