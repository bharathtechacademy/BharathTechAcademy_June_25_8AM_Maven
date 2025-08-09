package exceptionHandling;

public class StackOverflowErrorInJava {
	
	// StackOverflowError is thrown when a stack overflow occurs because an application recurses too deeply.
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
