package language.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// 1. byte: 8-bit signed integer, range from -128 to 127
		byte age = 32; // 1 byte, range: -128 to 127
		
		// 2. short: 16-bit signed integer, range from -32,768 to 32,767
		short year = 2023; // 2 bytes, range: -32,768 to 32,767
		
		// 3. int: 32-bit signed integer, range from -2^31 to 2^31-1
		int population = 1000000; // 4 bytes, range: -2,147,483,648 to 2,147,483,647
		
		// 4. long: 64-bit signed integer, range from -2^63 to 2^63-1
		long distanceToMoon = 384400000000L; // 8 bytes, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		// 5. float: 32-bit floating point, range approximately -3.40282347E+38 to 3.40282347E+38
		float pi = 3.14f; // 4 bytes, precision: ~7 decimal digits
		
		// 6. double: 64-bit floating point, range approximately -1.7976931348623157E+308 to 1.7976931348623157E+308
		double e = 2.718281828459045; // 8 bytes, precision: ~15 decimal digits
		
		// 7. char: 16-bit Unicode character, range from '\u0000' to '\uffff'
		char initial = 'A'; // 2 bytes, represents a single character
		
		// 8. boolean: represents true or false
		boolean isJavaFun = true; // 1 byte, can be either true or false
		
		//Storing Text values in String 
		String greeting = "Hello, World!"; // String is not a primitive type, but a reference type in Java
		
		

	}

}
