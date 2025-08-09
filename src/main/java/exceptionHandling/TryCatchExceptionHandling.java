package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		String[] empNames = new String[5];

		try {
			empNames[0] = "John";
			empNames[1] = "Jane";
			empNames[2] = "Doe";
			empNames[3] = "Smith";
			empNames[5] = "Emily";
			System.out.println(empNames.length);
		} catch (Exception e) {
			System.out.println("An exception occurred: " + e.getMessage());
			empNames[5] = "Shyamili";
		} finally {
			System.out.println("Execution is completed successfully");		
		}

		
	}

}
