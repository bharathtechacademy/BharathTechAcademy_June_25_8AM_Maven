package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {

	public static void main(String[] args) {

		//There are numbers 1,3,9,13,37,46,58,91,94- Filter the numbers which are even and greater than 10.
		
		List<Integer> numbers = List.of(1, 2, 3, 9, 13, 37, 46, 58, 91, 94);
		List<Integer> evenNumbers = new ArrayList<>();
		
		for(int val : numbers) {
			if(val % 2 == 0 && val > 10) {
				evenNumbers.add(val);
			}
		}
		
		System.out.println("Even numbers using for loop: " + evenNumbers);
		
		//Using Streams API to filter even numbers and greater than 10.
		List<Integer> evenNumbersList = numbers.stream().filter(x-> x % 2 == 0 && x >10).collect(Collectors.toList());
		System.out.println("Even numbers using Streams API: " + evenNumbersList);
		
		
	}

}
