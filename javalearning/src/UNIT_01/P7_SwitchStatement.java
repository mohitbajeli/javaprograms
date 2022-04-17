package UNIT_01;


/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

import java.util.*;
public class P7_SwitchStatement {
	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();
				

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
//		Scanner myObj = nextInt();
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt();  
		switch(n)
		{
		case 1:
			System.out.println("YEAR : 2022\n");
			break;
		case 2:
			System.out.println("MONTH: 04(APRIL)\n");
			break;
		case 3:
			System.out.println("DAY : Saturday\n");
			break;
		default:
			System.out.println("Not applicable\n");
			break;
		}
		
	}
}