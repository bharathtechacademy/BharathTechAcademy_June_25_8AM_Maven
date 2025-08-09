package ststicConcepts;

public class OuterClass {

	public static void main(String[] args) {
//		MainClass mainClass = new MainClass();		
		System.out.println(MainClass.name);
		System.out.println(MainClass.getAge());
		
		
		// Accessing Normal Inner Class
		MainClass.InnerClass innerClass = new MainClass().new InnerClass();
		System.out.println(innerClass.role);
		
		// Accessing Static Inner Class
		MainClass.StaticInnerClass staticInnerClass = new MainClass.StaticInnerClass();
		System.out.println(staticInnerClass.designation);
	}

}
