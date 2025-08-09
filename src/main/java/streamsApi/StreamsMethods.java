package streamsApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsMethods {

	public static void main(String[] args) {
		//There are numbers 1,37,3,9,13,9,37,46,58,91,37,94
		
		//Identify unique numbers from the list.
		List<Integer> numbers = List.of(1, 37, 3, 9, 13, 9, 37, 46, 58, 91, 37, 94);
		List<Integer> uniqueNumbers = new ArrayList<>();
		
		for(int val : numbers) {
			if(!uniqueNumbers.contains(val)) {
				uniqueNumbers.add(val);
			}
		}
		
		System.out.println("Unique numbers using for loop: " + uniqueNumbers);
		
		//sort the unique numbers in ascending order.
		for(int i = 0; i < uniqueNumbers.size() - 1; i++) {
			for(int j = i + 1; j < uniqueNumbers.size(); j++) {
				if(uniqueNumbers.get(i) > uniqueNumbers.get(j)) {
					int temp = uniqueNumbers.get(i);
					uniqueNumbers.set(i, uniqueNumbers.get(j));
					uniqueNumbers.set(j, temp);
				}
			}
		}
		
		//arrange in reversed order.
		for(int i = 0; i < uniqueNumbers.size() / 2; i++) {
			int temp = uniqueNumbers.get(i);
			uniqueNumbers.set(i, uniqueNumbers.get(uniqueNumbers.size() - 1 - i));
			uniqueNumbers.set(uniqueNumbers.size() - 1 - i, temp);
		}
		
		//Using Streams API to identify unique numbers.
		List<Integer> uniqueNumbersList = numbers.stream().distinct().toList();
		System.out.println("Unique numbers using Streams API: " + uniqueNumbersList);
		
		//Count the unique numbers in the list.
		long count = numbers.stream().distinct().count();
		
		//Using Streams API to sort the unique numbers in ascending order.
		List<Integer> uniqueSortedNumbersList = numbers.stream().distinct().sorted().toList();
		System.out.println("Unique numbers sorted in ascending order using Streams API: " + uniqueSortedNumbersList);

		//Using Streams API to sort the unique numbers in descending order.
		List<Integer> uniqueReverseSortedNumbersList = numbers.stream().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Unique numbers sorted in descending order using Streams API: " + uniqueReverseSortedNumbersList);
	}

}
