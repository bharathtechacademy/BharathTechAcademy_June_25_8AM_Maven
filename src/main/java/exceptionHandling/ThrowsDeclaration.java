package exceptionHandling;

public class ThrowsDeclaration {
	
	// throws declaration ==> when we are sure about the exception

	public static void main(String[] args) throws InterruptedException {		
		System.out.println("Bharath");
		Thread.sleep(2000); 
		System.out.println("ABC");
		Thread.sleep(3000); 
		System.out.println("XYZ");
	}

}
