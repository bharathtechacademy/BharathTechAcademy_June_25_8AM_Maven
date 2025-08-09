package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemeoryErrorInJava {

	public static void main(String[] args) {
		
		List<Integer[]> list = new ArrayList<Integer[]>();
		
		while(1>0) {
			list.add(new Integer[1000000000]);
		}

	}

}
