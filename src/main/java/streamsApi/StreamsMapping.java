package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	public static void main(String[] args) {
		//There are numbers 1,3,9,13,37,46,58,91,94- calculate the square of each number and store them in a new list.
		
		List<Integer> numbers = List.of(1, 2, 3, 9, 13, 37, 46, 58, 91, 94);
		List<Integer> squareList = new ArrayList<>();
		
		for(int val : numbers) {
			squareList.add(val * val);
		}
		
		System.out.println("Square of numbers using for loop: " + squareList);
		
		List<Integer> squareNumbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Square of numbers using Streams API: " + squareNumbers);
		
	}

}
