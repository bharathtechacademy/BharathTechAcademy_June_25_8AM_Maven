package conditionalStatements;

public class IfEleseConditionalStatements {
	
	// if-else conditional statements  ==> when we don't know the result of condition
	
//	if(condition) {
//		// if block-code to be executed if condition is true
//	if(true) {
//		System.out.println("Condition is true");
//	} else {
//		// else block code to be executed if condition is false
//		System.out.println("Condition is false");
//	}
//	} else if(condition) {
//		// else if block-code to be executed if the previous condition is false and this condition is true
//	} else {
//		// else block code to be executed if all previous conditions are false
//	}

	public static void main(String[] args) {
		
		double percentage = 87.23;
		
		if (percentage >= 60) {
			System.out.println("You got First Class");		
			
			if (percentage >= 85) {
				System.out.println("Hey , You are eligible for Gold Medal");
			} else {
				System.out.println("But , You are not eligible for Gold Medal");
			}	
			
		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("You got Second Class");
		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("You got Third Class");
		} else {
			System.out.println("Sorry, You Failed Bro");
		}
		
		String name = "John";
		
		if (name.equals("John")) {
			System.out.println("Hello John");
		} else if (name.equals("Jane")) {
			System.out.println("Hello Jane");
		} else {
			System.out.println("Hello Guest");
		}
		
		


	}

}
