package conditionalStatements;

public class SwitchCaseConditionalStatements {
	
	// switch-case conditional statements  ==> when we know the result and we want to choose one option among many.
	
	// switch(variable) {
	// 	case value1:
	// 		// code to be executed if variable equals value1
	// 		break; // optional, but recommended to prevent fall-through
	// 	case value2:
	// 		// code to be executed if variable equals value2
	// 		break; // optional, but recommended to prevent fall-through
	// 	// more cases as needed
	// 	default:
	// 		// code to be executed if variable doesn't match any case
	

	public static void main(String[] args) {
		
		String day = "Sunday";
		
		String result = "";
		
		switch (day) {

		case "Monday":
			System.out.println("Today is Weekday");
			result = "Today is Weekday";
			break;
		case "Tuesday":
			System.out.println("Today is Weekday");
			result = "Today is Weekday";
			break;
		case "Wednesday":
			System.out.println("Today is Weekday");
			result = "Today is Weekday";
			break;
		case "Thursday":
			System.out.println("Today is Weekday");
			result = "Today is Weekday";
			break;
		case "Friday":
			System.out.println("Today is TGIF");
			result = "Today is TGIF";
			break;
		case "Saturday":
			System.out.println("Today is Weekend");
			result = "Today is Weekend";
			break;
		case "Sunday":
			System.out.println("Today is Weekend");
			result = "Today is Weekend";
			break;
		default:
			System.out.println("Invalid day");
			result = "Invalid day";

		}

		System.out.println(result);

	}

}
