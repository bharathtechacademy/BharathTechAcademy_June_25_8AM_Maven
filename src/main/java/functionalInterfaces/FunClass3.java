package functionalInterfaces;

import java.util.function.Function;

public class FunClass3 {

	public static void main(String[] args) {
//		FunInterfaceClass2 obj = new FunInterfaceClass2();
//		obj.sumOfNumbers(10, 20);
		
//		FunInterfaceClass1 obj = (a, b) -> a+b;
//		System.out.println(obj.sumOfNumbers(10, 20));
		
//		FunInterfaceClass1 obj = a->a*a;
//		System.out.println(obj.squareOfNumber(10));
		
		Function<Integer, Integer> obj = a -> a * a;
		System.out.println(obj.apply(10));
	}

}
