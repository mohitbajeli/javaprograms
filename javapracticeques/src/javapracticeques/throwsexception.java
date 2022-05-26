package javapracticeques;
class negativedimensionException extends Exception{
	@Override
	public String getMessage()
	{
		return " exception occured dimension cannot be negative";
	}
}
public class throwsexception {
public static int perimeter(int a,int b) throws negativedimensionException
{
   if(a<0 || b<0)
   {
	   throw new negativedimensionException();
   }
   int p=2*(a+b);
   return p;
}
	public static void main(String[] args) {
	try {
         int c=perimeter(-3,5);
         System.out.println("the perimeter is "+c);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());	
	}
	}
}
