package calssesAndObjects;

public class Class1 {

	String name = "Bharath Reddy";
	int empId = 12345;
	String designation = "SDET";
	boolean havingVisa = true;
	String[] address = { "Hitech-City", "Hyderabad", "500081" };
	

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
	
		System.out.println( obj.name);
		System.out.println( obj.empId);
		System.out.println( obj.address[1]);
	}

}
