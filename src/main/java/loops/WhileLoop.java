package loops;

public class WhileLoop {

//	while(condition) {
//		// code to be executed
//		// increment/decrement statement
//		//condition to break the loop
//	}

	public static void main(String[] args) {

		int i = 1;

		while (i > 0) {
			
			boolean isPageLoaded = false;			
			if (isPageLoaded || i>100) {
				break; //break the loop & stop the execution
			}
			
			System.out.println("Refresh the Page");
			i++;
		}

	}

}
