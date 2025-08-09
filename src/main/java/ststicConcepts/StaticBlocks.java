package ststicConcepts;

public class StaticBlocks {
	
	
	static int salary ;
	String name = "Bharath";
	
	static {
		salary = 10000;
	}
	

	public static void main(String[] args) {
		StaticBlocks obj = new StaticBlocks();
		System.out.println(obj.name);
		System.out.println(StaticBlocks.salary);
	}

}
