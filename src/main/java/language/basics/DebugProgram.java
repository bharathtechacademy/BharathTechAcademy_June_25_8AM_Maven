package language.basics;

public class DebugProgram {
	
//	Resume (F8): Continue execution until the next breakpoint or the end of the program.
//	Terminate (Control + F2): Stop the program execution.
//	Step Over (F6): Execute the current line and pause at the next line.
//	Step Into (F5): If the current line contains a method call, it will step into that method.
//	Step Return (F7): If you are inside a method, it will execute the rest of the method and pause at the next line in the calling method.

	public static void main(String[] args) {
		
		int i = 1;
		System.out.println("Step 1: Program starts");
		System.out.println("Step 2: Preparing to execute next step");
		System.out.println("Step 3: Performing calculations");
		int j = i - 1;
		System.out.println(i / j);
		System.out.println("Step 5: Program execution completed");
		


	}

}
