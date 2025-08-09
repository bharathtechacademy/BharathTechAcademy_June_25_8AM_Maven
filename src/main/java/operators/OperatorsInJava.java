package operators;

public class OperatorsInJava {
	
	//Operators in Java are special symbols that perform operations on variables and values.
	
//	1. Arithmetic Operators ==> to perform mathematical operations ( + , -, * , / , % (modulus) , ++ (increment), --(decrement))
//	2. Assignment Operators ==> to assign value to variables (= ,+=, -=, *=, /=, %=)
//	3. Conditional / Comparison Operators ==> to compare primitive data types (> , <, >=, <=, ==, != )
//	4. Logical Operators ==> will be used to build the logics ( &&(and) , ||(or) , !(not) )
//	5. Ternary Operator ==> shot form of conditional statements ==> ?: (condition ? true : false)

	public static void main(String[] args) {

//		1. Arithmetic Operators ==> to perform mathematical operations ( + , -, * , / , % (modulus) , ++ (increment), --(decrement))
		int a = 10;
		int b = 20;
		
		System.out.println("Addition: " + (a + b)); // Addition
		System.out.println("Subtraction: " + (a - b)); // Subtraction
		System.out.println("Multiplication: " + (a * b)); // Multiplication
		System.out.println("Division: " + (b / a)); // Division
		System.out.println("Modulus: " + (b % a)); // Modulus (remainder)
		
		//++ (increment) ==> increase the value by 1 ==> a++ ==> a= a+1;
		//--(decrement) ==> decrease the value by 1 ==> b-- ==> b= b-1;
		
		//a++ ==> post-increment ==> adding ++ after the variable ==> first JVM will execute the line with old value and increase the value at the end.
		System.out.println(a++);
		System.out.println(a);
		
		//++b ==> pre-increment ==> adding ++ before the variable ==> first JVM will increase the value then it will execute the statement.
		System.out.println(++b);
		
		System.out.println(a--);
		System.out.println(--b);
		
		
//		2. Assignment Operators ==> to assign value to variables (= ,+=, -=, *=, /=, %=)
		System.out.println("***********Assignment Operators*************");
		
		int c = 30;		
		
		c+=10; // c= c + 10; // c = 30 + 10 ==> c = 40
		System.out.println(c);
		
		c-=10; // c= c - 10; // c = 40 - 10 ==> c = 30
		System.out.println(c);
		
		c*=10; // c= c * 10; // c = 30 * 10 ==> c = 300
		System.out.println(c);

		c/=10; // c= c / 10; // c = 300 / 10 ==> c = 30
		System.out.println(c);
		
		c%=10; // c= c % 10; // c = 30 % 10 ==> c = 0
		System.out.println(c);
		
		
//		3. Conditional / Comparison Operators ==> to compare primitive data types (> , <, >=, <=, ==, != )
		
		System.out.println("***********Conditional / Comparison Operators*************");
		
		int x = 5;
		int y = 10;
		
		System.out.println(x > y); // false
		System.out.println(x < y); // true
		System.out.println(x >= y); // false
		System.out.println(x <= y); // true
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		
//		4. Logical Operators ==> will be used to build the logics ( &&(and) (all conditions should be true), ||(or) (at-least 1 condition true), !(not) (opposite))
		System.out.println("***********Logical Operators*************");
		
		int i= 10;
		int j= 20;
		int k= 10;
		
		System.out.println(i > j && i == k); // false && true ==> false
		System.out.println(i > j || i == k); // false || true ==> true
		System.out.println(!(i > j || i == k)); // not (false || true) ==> not (true) ==> false
		
//		5. Ternary Operator ==> shot form of conditional statements ==> ?: (condition ? true : false)
		System.out.println("***********Ternary Operator*************");
		
		int p = 10;
		int q = 20;
		
		int max = (p > q) ? p : q; // if p is greater than q then max = p else max = q
		System.out.println(max);
		
		String result = (p > q) ? "p is greater" : "q is greater"; // if p is greater than q then result = "p is greater" else result = "q is greater"
		System.out.println(result);
	}

}
