package stringOperations;

public class StringOperations {

	public static void main(String[] args) {

		// Store text value in a variable
		String value = " Username : Admin | Password : admin123 ";
		System.out.println("Original String: " + value);

		// Total number of characters in the string : String.length();
		int length = value.length();
		System.out.println("Total number of characters in the string: " + length);

		// Get the character at a specific index : String.charAt(index);
		char characterAtIndex = value.charAt(5);
		System.out.println("Character at index 5: " + characterAtIndex);

		// Reverse the string
		String reversedString = "";
		// Using a loop to reverse the string
		for (int i = value.length() - 1; i >= 0; i--) {
			reversedString += value.charAt(i);
		}
		System.out.println("Reversed String: " + reversedString);

		// Remove unwanted leading and trailing spaces : String.trim();
		String trimmedValue = value.trim();
		System.out.println("Trimmed String:" + trimmedValue);

		// Remove spaces from the string : String.replace(oldChars, newChars);
		String noSpacesValue = value.replace(" ", "");
		System.out.println("String without spaces: " + noSpacesValue);

		// Remove alphabets from the string : String.replaceAll(regularExpression,
		// newChars); [a-zA-Z][0-9]
		String noAlphabetsValue = value.replaceAll("[a-zA-Z]", "");
		System.out.println("String without alphabets: " + noAlphabetsValue);

		// Remove numbers from the string : String.replaceAll(regularExpression,
		// newChars); [0-9]
		String noNumbersValue = value.replaceAll("[0-9]", "");
		System.out.println("String without numbers: " + noNumbersValue);

		// Remove special chars from the string : String.replaceAll(regularExpression,
		// newChars); [^a-zA-Z0-9]
		String noSpecialCharsValue = value.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String without special characters: " + noSpecialCharsValue);

		// Convert the string to lower case : String.toLowerCase();
		String lowerCaseValue = value.toLowerCase();
		System.out.println("String in lower case: " + lowerCaseValue);

		// Convert the string to upper case : String.toUpperCase();
		String upperCaseValue = value.toUpperCase();
		System.out.println("String in upper case: " + upperCaseValue);

		// Extract a substring(Part Of The String) from the string :
		// String.substring(startIndex, endIndex+1);
		String username = value.substring(12, 17);
		String password = value.substring(31);
		System.out.println("Extracted Username: " + username);
		System.out.println("Extracted Password: " + password);

		// Extract text using Split the string into an array of strings based on a
		// delimiter : String.split(delimiter);
		String[] splitValue = value.split(" ");
		System.out.println("Extracted Username: " + splitValue[3]);
		System.out.println("Extracted Password: " + splitValue[7]);

		// Compare two strings : equals(),equalsIgnoreCase() ,contains(), startsWith(),
		// endsWith()
		// equals() checks for exact match (case to case)
		// equalsIgnoreCase() checks for exact match (ignoring case)
		// contains() checks if one string contains another string
		// startsWith() checks if the string starts with a specific prefix
		// endsWith() checks if the string ends with a specific suffix
		String str1 = "Bharath";
		System.out.println(str1.equals("Bharath"));
		System.out.println(str1.equals("bharath"));
		System.out.println(str1.equalsIgnoreCase("bharath"));
		System.out.println(str1.contains("hara"));
		System.out.println(str1.contains("Hara"));
		System.out.println(str1.startsWith("Bhar"));
		System.out.println(str1.startsWith("bhar"));
		System.out.println(str1.endsWith("ath"));
		System.out.println(str1.endsWith("ATH"));

		// Should not use == operator to compare strings as it compares the reference of
		// the objects not the content.

		// Join two strings : String.concat(string);
		String firstName = "Bharath ";
		String lastName = "Reddy";
		String fullName = firstName.concat(lastName);
		System.out.println("Full Name: " + fullName);

		// Check if the string is empty (not even spaces )or blank (spaces allowed):
		// String.isEmpty(), String.isBlank();
		String emptyString = "";
		String blankString = "   ";
		System.out.println("Is emptyString empty? " + emptyString.isEmpty());
		System.out.println("Is emptyString blank? " + emptyString.isBlank());
		System.out.println("Is blankString empty? " + blankString.isEmpty());
		System.out.println("Is blankString blank? " + blankString.isBlank());

		// String, StringBuilder, StringBuffer

		// String is immutable, meaning once created, it cannot be changed.
		// StringBuilder and StringBuffer are mutable, meaning they can be changed.

		// StringBuffer is synchronized and thread-safe, making it suitable for multi-threaded environments.
		// StringBuilder is not synchronized, making it faster but not thread-safe.

		// String
		String val = "Bharath ";
		String val2 = val.concat("Reddy");
		System.out.println(val);

		// StringBuffer
		StringBuffer stringBuffer = new StringBuffer("Bharath ");
		stringBuffer.append("Reddy");
		System.out.println(stringBuffer); // Output: Bharath Reddy

		// StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Bharath ");
		stringBuilder.append("Reddy");
		System.out.println(stringBuilder); // Output: Bharath Reddy

	}

}
