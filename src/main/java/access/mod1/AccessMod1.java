package access.mod1;

public class AccessMod1 {

	private String name = "Rajeswaar";

	private int getEmpId() {
		return 1001;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println("Employee Name: " + obj.name);
		System.out.println("Employee ID: " + obj.getEmpId());
	}

}
