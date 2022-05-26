package javapracticeques;

import java.util.Scanner;

public class nestedtrycatch {

	public static void main(String[] args) {
		int [] marks=new int[3];
		marks[0]=23;
		marks[1]=46;
		marks[2]=36;
		boolean num=true;
		while(num) {
		System.out.println("enter the index ");
		Scanner sc= new Scanner(System.in);
		int ind=sc.nextInt();
		try {
			
			try {
				System.out.println("the number at index is "+marks[ind]);
				num=false;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception occured at level 2");
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception occured at level 1");
			System.out.println(e);
		}
		}
	}

}
