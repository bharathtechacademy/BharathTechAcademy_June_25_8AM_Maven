package exceptionHandling;

public class ThrowAnCustomException {

	public static void main(String[] args) {
		int age = 17; // Example age
		
		if (age < 18) {
			throw new IllegalArgumentException("You are not eligible to vote");
		} else {
			System.out.println("You are eligible to vote");
		}
		
		System.out.println("Execution continues after the if-else block");

	}

}
