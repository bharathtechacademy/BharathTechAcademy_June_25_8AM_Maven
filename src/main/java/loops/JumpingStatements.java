package loops;

public class JumpingStatements {

	// Jumping statements are used to JUMP FROM ONE ITERATION TO ANOTHER.

	// 1. break statement ==> IT WILL BREAK THE LOOP AND TERMINATE THE EXECUTION OF THE LOOP.
	// 2. continue statement ==> IT WILL SKIP THE CURRENT ITERATION AND CONTINUE WITH THE NEXT ITERATION.
	// 3. return statement

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
//				break; // This will break the loop when i is 5
				continue; // This will skip the current iteration when i is 5
			}
			
			System.out.println(i);

		}

	}

}
