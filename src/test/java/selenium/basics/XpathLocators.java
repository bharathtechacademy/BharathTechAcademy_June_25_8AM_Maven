package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//XPath locators are used to find elements in an XML document or HTML page.
	
	// Absolute XPath: Starts from the root element and goes down to the target element.
	// Example: /html/body/div[1]/div[2]/ul[1]/li[3]/a
	
	// Relative XPath: Starts from the current node and finds the target element.
	// Example: //div[@class='example']
	
	// Relative XPath Syntaxes
	
	/****************BASIC - LEVEL 1*******************/	
	// Syntax 1: //tagname[@attribute='attribute-value']
	// Syntax 2: //tagname[text()='text-value']
	
	/****************LEVEL 2 - with contains / starts-with *******************/
	// Syntax 3: //tagname[contains(@attribute, 'partial-value')]
	// Syntax 4: //tagname[contains(text(), 'partial-value')]
	
	// Syntax 5: //tagname[starts-with(@attribute, 'partial-value-starts-with')]
	// Syntax 6: //tagname[starts-with(text(), 'partial-value-starts-with')]	
	
	/****************LEVEL 3 - combine multiple attributes & text values using 'and'  operator *******************/
	// Syntax 7: //tagname[@attribute1='value1' and @attribute2='value2' and text()='text-value']
	
	/****************LEVEL 4 - Advanced Xpaths with Relationships*******************/	
	// Syntax 8: referenceElement/relationship::targetElement
	
	//child
	//parent
	//ancestor
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	// ==> with in the family
	// / ==> child
	
	//Search Criteria:
	
	// target --> target-sibling -->  parent --> ancestor(parent's parent) --> ancestor's parent (grand parent) --> ancestor's parent's parent (grand grand parent)
	
	
	// ancestor: //ul[@class='leftmenu']
	// parent: //li
	// sibling :
	// target : //a[text()='Services']
	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//ul[@class='leftmenu']//a[text()='Services']
	//li[text()='Solutions']/following-sibling::li[2]/child::a[text()='Services']

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5: Locate the parabank 'LOGO' using XPath locator -Syntaxt 1
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		6: Locate the parabank 'CAPTION' using XPath locator -Syntaxt 2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		
//		7: Locate the parabank 'LOGO' using XPath locator -Syntaxt 3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		8: Locate the parabank 'CAPTION' using XPath locator -Syntaxt 4
		driver.findElement(By.xpath("//p[contains(text(),'the difference')]"));
		
//		9: Locate the parabank 'LOGO' using XPath locator -Syntaxt 5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		10: Locate the parabank 'CAPTION' using XPath locator -Syntaxt 6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		11: Locate the parabank 'LOGO' using XPath locator -Syntaxt 7
		driver.findElement(By.xpath("//img[@class='logo' and @alt='ParaBank' and @title='ParaBank'  and contains (@src,'logo')]"));
		
//		12: Locate the parabank 'CAPTION' using XPath locator -Syntaxt 7
		driver.findElement(By.xpath("//p[text()='Experience the difference' and @class='caption']"));
		
		
//		13: Locate the parabank 'Services' Link using XPath locator -Syntaxt 8
		driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		

	}

}
