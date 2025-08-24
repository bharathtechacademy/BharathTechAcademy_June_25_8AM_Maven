package testng.framework.concepts;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtil;

public class ApplicationTest extends TestNGAppCommons {
	
	@DataProvider(name="testdata")
	public String[][] data(Method method) {
		String[][] userdata = ExcelUtil.readExcelData("TestData.xlsx", method.getName());
		return userdata;
	}
	
//	@DataProvider(name="test4data")
//	public String[][] data2() {
//		String[][] userdata = { { "admin", "admin@gmail.com" ,"FGFJHGFJHGFJ"}, { "user", "user@gmail.com","GHDHGDHGFD" } };
//		return userdata;
//	}
	
	@Test(priority=2,timeOut=2000, groups= {"Regression","Sanity"})
	public void TestCase1() throws InterruptedException {
//		Assert.fail("Test case 1 failed");
		System.out.println("Executing test case 1 steps...");
//		Thread.sleep(1000);
		System.out.println("Execution Completed for test case 1 ...");

	}
	
	@Test(priority=1,invocationCount =2, dependsOnMethods= {"TestCase1"},groups= {"Regression","Smoke"})
	public void TestCase2() {
		System.out.println("Executing test case 2 steps...");
	}

	@Test (dataProvider="testdata",groups= {"Smoke","Sanity"})
	public void TestCase3(String user, String email) {
		System.out.println("Executing test case 3 steps...with  user: " + user + " and email: " + email);
	}	
	
	@Test (dataProvider="testdata",priority=-1 , enabled =true,groups= {"Regression","Sanity","Smoke"})
	public void TestCase4(String user, String email,String securitykey) {
		System.out.println("Executing test case 4 steps...with  user: " + user + " and email: " + email+" and key :"+securitykey);
	}	
	
	
	
}


