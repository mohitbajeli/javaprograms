package javapracticeques;
import java.util.Scanner;
public class finallyinjava {
	public static int keyword()
	{
		int a=50;
		int b=0;
		try
			{
			  int c=a/b;
			  return c; //so in this after returning c if there is no finally block then the code after return will not run.
			}           //also after the running of catch block the finally block will run.
			catch(Exception e)
			
			{
				System.out.println(e);
			
			}
			finally {
				System.out.println("end of the program");
			}
		
		return -1;
		
	}

	public static void main(String[] args) {
	int c =keyword();
	System.out.println(c);
	int a=5;
	int b=5;
	while(true) {
		try
		{
			int d=a/b;
			System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e); //so here we will see after the exception comes the catch block will run and break the loop 
			                       //but after that also the finally block will run one more time.
			break;
		}
		finally
		{
			System.out.println("i am finally");
		}
		b--;
	  }
	}

	}


