package javapracticeques;
import java.util.Scanner;
class Myexception1 extends Exception
{
	@Override
	public String getMessage()
	{
		return "this is the new exception";
	}
}
public class q1 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("haha");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("hehe");
		}
		//problem 2
	/*	int [] marks= new int[3];
		marks[0]=34;
		marks[1]=45;
		marks[2]=56;
		boolean num=true;
		while(num) {
			System.out.println("enter the index");
		Scanner sc= new Scanner(System.in);
       int ind = sc.nextInt();
       try {
    	   System.out.println("the number at index is "+marks[ind]);
       }
       catch(ArrayIndexOutOfBoundsException e)

       {
    	   System.out.println(e);
    	   num=false;
       }
	}*/
		
		//problem 3
		int [] marks= new int[3];
		marks[0]=34;
		marks[1]=45;
		marks[2]=56;
		boolean num=true;
		while(num) {
			System.out.println("enter the index");
		Scanner sc= new Scanner(System.in);
       int ind = sc.nextInt();
       try {
    	   
    	   System.out.println("the number at index is "+marks[ind]);
       }
       catch(Exception e)

       {
    	   System.out.println(e);
    	   num=false;
       }
       if(ind>3)
       {
    	   try {
    	   throw new MyException1();
       }
       
    	   catch(Exception e)
    	   {
    		   System.out.println(e.getMessage());
    	   }
    	   
	
       }
       }
	}
	}
