package methodsInJava;

public class ParamConstructors2 {

	public static void main(String[] args) {
		ParameterizedConstructors pc = new ParameterizedConstructors(101);
		pc.printEmpDetails("John Doe");
		pc.printEmpAddress("123 Main St, Springfield");
		pc.printEmpSalary(75000.50);
		pc.printEmpVisa("B1/B2 Visa");
	}

}
