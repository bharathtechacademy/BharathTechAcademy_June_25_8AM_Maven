package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {

	public static void main(String[] args) {
		// Assertions are used to verify that a certain condition is true during test execution.
		
		// 1.Hard Assertion: If the condition is false, the test will stop execution immediately.
		// 2.Soft Assertion: If the condition is false, the test will continue execution but will report the failure at the end.
		
		//Hard Assertion Examples
		Assert.assertEquals("Google", "Google", "Error Message: Values do not match ! ");
		Assert.assertNotEquals("Google", "Bing", "Error Message: Values should not match ! ");
		Assert.assertTrue(5 > 3, "Error Message: Condition is not true ! ");
		Assert.assertFalse(3 > 5, "Error Message: Condition is not false ! ");
		Assert.assertNull(null, "Error Message: Object is not null ! ");
		Assert.assertNotNull("Selenium", "Error Message: Object is null ! ");
//		Assert.fail("Error Message: This test case is failed intentionally ! ");
		
		//Soft Assertion Example
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google", "Yahoo", "Error Message: Values do not match ! ");
		softAssert.assertNotEquals("Google", "Google", "Error Message: Values should not match ! ");
		softAssert.assertTrue(5 < 3, "Error Message: Condition is not true ! ");
		softAssert.assertFalse(3 < 5, "Error Message: Condition is not false ! ");
		softAssert.assertNull("Selenium", "Error Message: Object is not null ! ");
		softAssert.assertNotNull(null, "Error Message: Object is null ! ");
		softAssert.fail("Error Message: This test case is failed intentionally ! ");		
		System.out.println("Execution completed successfully");
		
		// To report all soft assertion failures by consoloditating them at the end of the test
		softAssert.assertAll();

	}

}
