package variablesInJava;

public class Variables1 {
	
	String topic2 = "Database"; //Instance variable
	
	static String topic3 = "Java"; //Static variable
	
	public static void main(String[] args) {		
		String topic1 = "Selenium"; //Local variable
		System.out.println(topic1);
		
		Variables1 v1 = new Variables1();
		System.out.println(v1.topic2);
		
		System.out.println(topic3);
	}
	
}
