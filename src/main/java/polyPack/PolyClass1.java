package polyPack;

//Polymorphism is a core concept in OOP that allows methods to do different things based on the object that it is acting upon.

public class PolyClass1 {

	// Method Overloading: Same method name with different parameters with in the same class

	public void sumOfNumbers(int a, int b) {
		System.out.println("Sum of two numbers: " + (a + b));
	}

	public void sumOfNumbers(int a, int b, int c) {
		System.out.println("Sum of three numbers: " + (a + b + c));
	}
	
	public void printEmpName(String name) {
		System.out.println("Employee Name in Parent: " + name);
	}

	public static void main(String[] args) {
		
		PolyClass1 poly = new PolyClass1();
		poly.sumOfNumbers(10, 20); // Calls the first method
		poly.sumOfNumbers(10, 20, 30); // Calls the second method

	}

}
