package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class PrintStatements {
	
/*******	Benefits of Print Statements   
 * @throws FileNotFoundException **********/
	
	/**
	 * 1.Debugging and Error Detection Print statements help easily verify variable
	 * values and program flow without requiring complex debugging tools.
	 * 
	 * 2.Monitoring Program ExecutionProvides real-time feedback by allowing
	 * developers to monitor program execution step-by-step during runtime.
	 * 
	 * 3.Education and Learning Simplifies learning for beginners by showing
	 * immediate results, making it easier to understand program behavior.
	 * 
	 * 4.Testing and ValidationHelps check program output and ensure expected
	 * behavior during development.
	 * 
	 * 5.Logging System Prototypes Print statements can act as placeholders for
	 * logging mechanisms during the early stages of development before implementing
	 * a full-fledged logging system.
	 * 
	 * @author Bharath
	 * 
	 * @version 0.1
	 * 
	 * @param args The main method accepts a single parameter, an array of strings
	 * 
	 * 			(String[] args). This is used to pass command-line arguments to the
	 * 
	 * @return This method does not return anything. The main method is void and
	 * 
	 * Example: To run a simple Java program, you can execute it from the command
	 * line or an IDE, and the program will begin executing from the main method.
	 * 	* In this example: The statement inside the main method prints "Hello, World!"
	 */

	
	/*
	 * This is the main method that serves as the entry point for any Java
	 * application. The Java Virtual Machine (JVM) starts program execution from the
	 * main method. Without the main method, the program cannot be executed (the JVM
	 * needs the main method to begin execution).
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Print the content and then go to next line
		System.out.println("Hello, World!");
		System.out.println("Hello, Java!");
		
		//Print the content and stays in the same line
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		// Print the formated content and then stay on same line
		// %s - String-text values
		// %d - digits-numbers
		// %.2f - Floating point-numbers with 2 decimals
		// %b -boolean - true / false
		// %c - chars - like 'A', '@'
		
		//System.out.println("Student Name is Anitha and She Completed BTech, Id is 1234 and Visa Status is true");
		//System.out.println("Student Name is Abhishek and She Completed BTech, Id is 1235 and Visa Status is false");
		System.out.printf("Student Name is %s and She Completed BTech, Id is %d and Visa Status is %b","Afreen",1236,false);
		System.out.println();

		// Print the errors in print statements
		System.err.println("ERROR: Expected Result is not matching with Actual");
		System.out.println();
		
		
		// Print logs 
		Logger log = Logger.getLogger("MyLogger");
		log.info("Currently Line 55 is executed");
		log.warning("Currently there is warning observed in line 56");
		
		
		// Print & Export logs into logger file
		PrintWriter logger = new PrintWriter("C:\\Training\\June_2025_8AM\\AutomationTraining\\AutomationTraining\\Logs\\logs.txt");
		logger.println(LocalDateTime.now()+"Currently Line 66 is running..");
		logger.println(LocalDateTime.now()+"Currently Line 67 is running..");
		logger.println(LocalDateTime.now()+"Currently Line 68 is running..");
		logger.close();
		

	}

}
