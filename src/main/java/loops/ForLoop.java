package loops;

import java.util.HashSet;
import java.util.Set;

public class ForLoop {

	// For loop is used to iterate over a range of values or a collection.

//	for(condition1;condition 2;condition 3) { //conition 1==> where to start, condition 2==> where to end, condition 3==> how to increment/decrement
//		// code to be executed
//	}

	// For Each Loop is used to iterate over a collection or an array / to iterate over a pre-defined values.

	public static void main(String[] args) {
		String name = "Bharath";

		// Print the name for 10000 times

		for (int i = 1; i <= 10000; i++) {
			System.out.println(i + ". " + name);
		}
		
		// For each loop			
//		for(dataType variable : collection/array) {
//			// code to be executed
//		}
		
		
		String[] empNames = new String[3];
		empNames[0] = "Alice";
		empNames[1] = "Bob";
		empNames[2] = "Charlie";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(empNames[i]);
		}
		
		// For each loop to iterate over an array
		for (String empName : empNames) {
			System.out.println(empName);
		}
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("John");
		empNamesHashSet.add("Jane");
		empNamesHashSet.add("Doe");
		empNamesHashSet.add("Alice");
		empNamesHashSet.add("John");
		empNamesHashSet.add("Charlie");
		empNamesHashSet.remove("Alice");
		empNamesHashSet.add(null);
		
		// For each loop to iterate over a HashSet
		for (String x : empNamesHashSet) {
			System.out.println(x);
		}
		
		

	}

}
