package access.mod2;

import access.mod1.AccessMod1;

public class AccessMod3 extends AccessMod1 {

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println("Employee Name: " + obj.getName());
//		System.out.println("Employee ID: " + obj.getEmpId());
	}

}
