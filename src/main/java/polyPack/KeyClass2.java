package polyPack;

public class KeyClass2 extends KeyClass1 {
	
	public String name = "Java";
	
	public void printName(String name) {
		System.out.println("Name is: " + name);
//		System.out.println("Name is: " + new KeyClass2().name);
//		System.out.println("Name is: " + new KeyClass1().name);
		System.out.println("Name is: " + this.name);
		System.out.println("Name is: " + super.name);
	}

	public static void main(String[] args) {
		KeyClass2 obj = new KeyClass2();
		obj.printName("API");
		
	}

}
