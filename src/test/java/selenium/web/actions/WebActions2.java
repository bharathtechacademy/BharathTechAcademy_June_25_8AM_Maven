package selenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {
	static WebDriver driver;

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();

		//3. Delete all the cookies
		driver.manage().deleteAllCookies();
				
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
				
		//5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));

		//6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstName.sendKeys("Bharath");
		lastName.sendKeys("Reddy");
					
		//7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("bharathtechacademy@gmail.com");
						
		//8. Select Gender (Male)
		selectGender("Male");
						
		//9. Enter mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9553220022");
						
		//10.Select DOB (1-Feb-1991)
		selectDOB("1", "February", "1991");
						
		//11.Search and Select Computer Science
		selectSubject("Computer Science");
		
		//12.Select Hobbies as Sports and Reading
		String [] hobbies = {"Sports", "Reading"};
		selectHobbies(hobbies);
						
		//13.Upload photo
		String filePath = System.getProperty("user.dir") + "\\Files\\Photo.jpg";
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadButton.sendKeys(filePath);						
						
		//15.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitButton);
						
		//16. Close browser window
		driver.quit();
	}
	
	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='" + option + "']"));
		gender.click();
	}
	
	public static void selectDOB(String date, String month, String year) {
		WebElement dobInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dobInput.click();
		
		//wait for the date picker to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		// Select month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText(month);
		
		// Select year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText(year);
		
		// Select date
		WebElement dateElement = driver.findElement(By.xpath("//div[text()='"+date+"' and contains(@aria-label,'"+month+"')]"));
		dateElement.click();
		
	}
	
	public static void selectSubject(String subject) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		
		//Scroll till the subject input field is visible
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subjectInput);
		
		// Enter Subject name by using actions class
		Actions actions = new Actions(driver);
		actions.sendKeys(subjectInput,subject).perform();
		
		// Wait for the subject suggestion to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"), 0));
		
		// Select the subject from the suggestion list
		WebElement subjectOption = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
		subjectOption.click();		
	}

	public static void selectHobbies(String [] hobbies) {
		//Select each hobby from the list of hobbies using a for-each loop
		for (String hobby : hobbies) {
			WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyCheckbox.isSelected()) {
				hobbyCheckbox.click();
			}
		}
	}
}
