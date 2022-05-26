package javapracticeques;
import java.util.Scanner;
public class handlingspecificexception {

	public static void main(String[] args) {
		int [] marks=new int[3];
		marks[0]=23;
		marks[1]=46;
		marks[2]=36;
		System.out.println("enter the index ");
		Scanner sc= new Scanner(System.in);
		int ind=sc.nextInt();
		System.out.println("enter the number you want to divide ");
		int num=sc.nextInt();
		try {
			System.out.println("the number at index is "+marks[ind]);
			System.out.println("the number when divided by the number is "+marks[ind]/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occured and the exception is ");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception occured and the exception is ");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("some other exception occured ");
			System.out.println(e);
		}
		

	}

}
