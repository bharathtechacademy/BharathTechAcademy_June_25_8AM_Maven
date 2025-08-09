package methodsInJava;

public class ParameterizedConstructors {
	
	int empId;
	
	ParameterizedConstructors(int id) {
		empId = id;
	}
	
	void printEmpDetails(String empName) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
	}
	
	void printEmpAddress(String empAddress) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Address: " + empAddress);
	}
	
	void printEmpSalary(double empSalary) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Salary: " + empSalary);
	}
	
	void printEmpVisa(String empVisa) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Visa: " + empVisa);
	}

}
