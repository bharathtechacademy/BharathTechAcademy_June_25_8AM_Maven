package stringOperations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {
		//Type conversion vs Type casting		
		
		//Type conversion
		int stdCode =144;
		int phoneNumber = 343536;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phoneNumber);
		
		//String to Integer conversion
		String balance ="  Account Balance: 999.99$ ";
		balance =balance.replaceAll("[^0-9.]", "");
		double Balance = Double.valueOf(balance);
		if(Balance>1000) {
			System.out.println("You have sufficient balance");
		} else {
			System.out.println("You have insufficient balance");
		}
		
		//Convert date and time into String
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyhhmmss");
		String uniqueId =dateFormat.format(Calendar.getInstance().getTime());
		System.out.println(uniqueId);
		
		//Type Casting ==> Converting a  data type to a similar data type
		
		//Auto Casting (Widening Casting)
		byte marks = 98;
		int Marks = marks; // byte to int
		System.out.println("Marks after widening casting: " + Marks);
		
		//Narrow Casting
		int age = 25;
		// int to byte (possible loss of data)
		byte Age = (byte) age; // int to byte
		System.out.println("Age after narrowing casting: " + Age);
		
		//Upcasting
		//Downcasting
	}

}
