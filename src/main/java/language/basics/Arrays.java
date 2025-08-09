package language.basics;

public class Arrays {

	public static void main(String[] args) {

		// 1D Array to store 3 empNames when we know the size
		String[] empNames = { "John", "Jane", "Doe" };

		// 1D Array to store 3 empNames when we don't know the values
		String[] empNames2 = new String[3];
		empNames2[0] = "Alice";
		empNames2[1] = "Bob";
		empNames2[2] = "Charlie";
//		empNames2[3] = "Mamta";
		
		//2D Array to store 2 projects with 3 empNames each
		String[][] projects = {
			{ "Project A - John", "Project A - Jane", "Project A - Doe" },
			{ "Project B - Alice", "Project B - Bob", "Project B - Charlie" }
		};
		
		//2D Array to store 2 projects with 3 empNames each when we don't know the values
		String[][] projects2 = new String[2][3];
		
		projects2[0][0] = "Project A - John";			
		projects2[0][1] = "Project A - Jane";
		projects2[0][2] = "Project A - Doe";
		projects2[1][0] = "Project B - Alice";
		projects2[1][1] = "Project B - Bob";

		//3D Array to store 2 companies with 3 projects each with 4 empNames in each project when we don't know the values
		String[][][] companies = new String[2][3][4];
		
		//Company 1-Project 1
		companies[0][0][0] = "Company A - Project 1 - John";
		companies[0][0][1] = "Company A - Project 1 - Jane";
		companies[0][0][2] = "Company A - Project 1 - Doe";
		
		//Company 1-Project 2
		companies[0][1][0] = "Company A - Project 2 - Alice";
		companies[0][1][1] = "Company A - Project 2 - Bob";
		companies[0][1][2] = "Company A - Project 2 - Charlie";
		
		//company 2-Project 1
		companies[1][0][0] = "Company B - Project 1 - John";
		companies[1][0][1] = "Company B - Project 1 - Jane";
		companies[1][0][2] = "Company B - Project 1 - Doe";
		
		//company 2-Project 2
		companies[1][1][0] = "Company B - Project 2 - Alice";
		companies[1][1][1] = "Company B - Project 2 - Bob";
		companies[1][1][2] = "Company B - Project 2 - Charlie";
		
	}

}
