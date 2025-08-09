package polyPack;

public class PolyClass2 extends PolyClass1 {
	
	// Method Overriding: Same method name with same parameters in the child class
	public void printEmpName(String name) {
		System.out.println("Employee Name in Child Class: " + name);
	}

	public static void main(String[] args) {
		PolyClass2 poly = new PolyClass2();
		poly.printEmpName("John Doe"); // Calls the overridden method in the child class

	}

}
