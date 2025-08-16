package selenium.basics;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementActions {
	
	//Buttons, Textbox, Dropdown, Checkbox, Radio-button, Hyperlink, Text/Labels, Scrollbar, Images, Calendar,  WebTables, Alerts, Frames

	public static void main(String[] args) throws IOException {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Launch the application
		driver.get("https://example.com");
		
//		5: Locate the WebElement
		WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
		
		/********** Common WebElement Actions **********/
		
		// Check if the element is displayed on the page
		boolean isDisplayed = element.isDisplayed();
		
		// Check if the element is enabled on the page
		boolean isEnabled = element.isEnabled();
		
		// Check if the element is selected already on the page
		boolean isSelected = element.isSelected();
		
		/************* Element Specific Actions *************/
		
		/********** Button Element **********/
		
		// Verify the label of the button
		String buttonLabel1 = element.getText();
		String buttonLabel2 = element.getAttribute("value");
		
		// Click on the button
		element.click();
		
		// double click on the button
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		
		// right click on the button
		actions.contextClick(element).perform();
		
		// Mouse hover on the button
		actions.moveToElement(element).perform();
		
		// Drag and drop the button
		actions.dragAndDrop(element, element).perform();
		
		// Click on the hidden button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
		// Type on the hidden textbox
		js.executeScript("arguments[0].value='Sample Text';", element);
		
		// Scroll to the button element using JavaScript
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		/********** Textbox Element **********/
		WebElement textbox = driver.findElement(By.xpath("//input[@id='textbox']"));

		// Clear the text in the textbox	
		textbox.clear();
		
		// Verify placeholder text in the textbox
		String placeholderText = textbox.getAttribute("placeholder");
		
		// Enter text in the textbox
		textbox.sendKeys("Sample Text");
		
		//Enter text and press Enter key using Actions class
		actions.sendKeys(textbox, "Sample Text").sendKeys(Keys.ENTER).perform();
		
		/********** Dropdown Element **********/
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

		// Verify the dropdown is single select or multi-select
		Select select = new Select(dropdown);
		boolean isMultiple = select.isMultiple();
		
		// Select an option from the dropdown		
		select.selectByVisibleText("Option 1");// Select by visible text
		select.selectByValue("option2"); // Select by value
		select.selectByIndex(0); // Select by index		
		
		// Verify the selected option in the dropdown
		String selectedOption = select.getFirstSelectedOption().getText();
		
		// Verify all options in the dropdown		
		for (WebElement option : select.getOptions()) {
			System.out.println("Option: " + option.getText());
		}
		
		// If the dropdown is multi-select, then select multiple options & de-select multiple options
		select.selectByVisibleText("Option 1");// Select by visible text
		select.selectByValue("option2"); // Select by value
		select.selectByIndex(0); // Select by index		
		
		if (isMultiple) {
			select.deselectByVisibleText("Option 1");// Deselect by visible text
			select.deselectByValue("option2"); // Deselect by value
			select.deselectByIndex(0); // Deselect by index		
		}
		
		/********** Checkbox Element **********/
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));

		// Verify the checkbox is selected or not
		boolean isCheckboxSelected = checkbox.isSelected();
		
		// Select the checkbox if not selected
		if (!isCheckboxSelected) {
			checkbox.click();
		}
		
		/********** Radio-button Element **********/
		// Select the radio-button
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='radio']"));
		radioButton.click();
		
		/********** Images Element **********/
		WebElement image = driver.findElement(By.xpath("//img[@id='image']"));

		// Verify if the image element is displayed
		boolean isImageDisplayed = image.isDisplayed();
		
		// Get the source of the image /image is valid		
		String imageSource = image.getAttribute("src");
		
		// Verify the image dimensions		
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();		
		
		// Get the position of the image		
		int imageX = image.getLocation().getX();
		int imageY = image.getLocation().getY();
		
		// Load the image and verify a specific pixel color
		int pixelColor = ImageIO.read(new File(imageSource)).getRGB(imageX, imageY);
		
		/********** Hyperlink Element **********/
		WebElement hyperlink = driver.findElement(By.xpath("//a[@id='hyperlink']"));

		// Verify the hyperlink label
		String hyperlinkLabel = hyperlink.getText();
		
		// Verify the hyperlink URL
		String hyperlinkURL = hyperlink.getAttribute("href");
		
		// Click on the hyperlink
		hyperlink.click();
		String currentURL = driver.getCurrentUrl();
		
		/********** Text/Label Elements **********/
		WebElement label = driver.findElement(By.xpath("//label[@id='label']"));

		// Verify the text/label is displayed
		boolean isLabelDisplayed = label.isDisplayed();
		
		// Get the text/label value
		String labelText = label.getText();

		/********** Calendar Element **********/
		// Verify the calendar is displayed
		// Select a date from the calendar
		
		/********** WebTable Element **********/
		// Verify the webtable is displayed
		// Get the column headers in the webtable
		// Get the number of rows and columns in the webtable
		// Get the text from a specific cell in the webtable
		
		/********** Alerts Element **********/
		// Verify if the alert is displayed
		
		//Switch to alert
		Alert alert = driver.switchTo().alert();
		
		// Accept the alert
		alert.accept();
		
		// Dismiss the alert
		alert.dismiss();
		
		// Get the text from the alert
		String alertText = alert.getText();
		
		// Send text to the alert (if applicable)
		alert.sendKeys("Sample Text");
		
		/********** Frame Element **********/

		// Switch to the frame
		driver.switchTo().frame("frameNameOrId"); // Switch by name or ID
		driver.switchTo().frame(0); // Switch by index
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frameId']"))); // Switch by WebElement
		
		// Switch back to the default content
		driver.switchTo().defaultContent();
		
		/********** Screenshots **********/
		// Take a screenshot of the entire page		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		
		// Take a screenshot of a specific element
		File elementScreenshot = element.getScreenshotAs(OutputType.FILE);
		
		/********** Shadow DOM Actions **********/
		// Locate the shadow host element		
		WebElement shadowHost = driver.findElement(By.cssSelector("shadow-host-selector"));
		
		// Access the shadow root
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);
		
		// Locate an element inside the shadow DOM
		WebElement shadowElement = shadowRoot.findElement(By.cssSelector("shadow-element-selector"));

		
	}

}
