package javapracticeques;

public class trycatch {

	public static void main(String[] args) {
		int a=6000;
		int b= 0;
		try {
			int c= a/b;
			System.out.println("the result is "+c);
		}
		catch(Exception e)
		{
			System.out.println("exception occured the reason is ");
			System.out.println(e);
			
		}
		System.out.println("end of the program");
		

	}

}
