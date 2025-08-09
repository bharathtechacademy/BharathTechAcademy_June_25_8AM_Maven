package loops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterators {
	
	//Iterators are used to traverse through a collection of elements.

	public static void main(String[] args) {
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("John");
		empNamesHashSet.add("Jane");
		empNamesHashSet.add("Doe");
		empNamesHashSet.add("Alice");
		
		// Using for-each loop to iterate through the HashSet
//		for (String name : empNamesHashSet) {
//			System.out.println(name);
//		}
		
		// Using an iterator to iterate through the HashSet
		Iterator<String> iterator = empNamesHashSet.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

	}

}
