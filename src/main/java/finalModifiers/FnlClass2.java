package finalModifiers;

public class FnlClass2 extends FnlClass1 {
	
	public void printName() {
		System.out.println("Bharath Reddy");
	}

	public static void main(String[] args) {

		FnlClass1 obj = new FnlClass1();
		obj.printName();
		obj.changeValue(3.14159);
		System.out.println("Value of pie: " + obj.pie);
	}

}
