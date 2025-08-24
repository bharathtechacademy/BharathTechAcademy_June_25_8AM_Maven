package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCommons {
	
	//method to return string format of date and time
	public static String uniqueID(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(Calendar.getInstance().getTime());
	}
	
	//method to take screenshot of the entire page
	public static String takeScreenshot(WebDriver driver, String screenshotName) {
		String path = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName+"_"+uniqueID("dd_MM_yyyy_hh_mm_ss") + ".png";
		File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	//method to take screenshot of a specific web element
	public static String takeScreenshot(WebElement element, String screenshotName) {
		String path = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName +"_"+uniqueID("dd_MM_yyyy_hh_mm_ss") + ".png";
		File screenshotFile= element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	// method to add logs to report
	public static void log(String status, String message) {
		if (status.equalsIgnoreCase("pass")) {
			Reports.logger.pass(message);
		} else if (status.equalsIgnoreCase("fail")) {
			Reports.logger.fail(message);			
		} else if (status.equalsIgnoreCase("info")) {
			Reports.logger.info(message);
		} else if (status.equalsIgnoreCase("skip")) {
			Reports.logger.skip(message);
		} else if (status.equalsIgnoreCase("fatal")) {
			Reports.logger.fatal(message);
		} else if (status.equalsIgnoreCase("error")) {
			Reports.logger.error(message);
		}
	}
	
	public static void logScreenshot(WebDriver driver, String screenshotName) {
		String screenshot = takeScreenshot(driver, screenshotName);
		try {
			Reports.logger.addScreenCaptureFromPath(screenshot);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void logScreenshot(WebElement element, String screenshotName) {
		String screenshot = takeScreenshot(element, screenshotName);
		try {
			Reports.logger.addScreenCaptureFromPath(screenshot);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	

}