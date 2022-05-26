package javapracticeques;


class MyException extends Exception{
	@Override
	public String getMessage() {
          return "exception occured";		
	}
	@Override
	public String toString() {
		return "i am tostring";
	}
	
}
public class customexceptionclass {

	public static void main(String[] args) {
		int a=1;
		{
			try {
				if(a<9) {
					throw new MyException(); //throw keyword is used to throw custom exception made explicitily by programmer.
					//throw new ArithmeticException("exception");
				}
			} 
		   
		
			catch(Exception e)
			{
			System.out.println("caught the exception");	
			System.out.println(e.getMessage());
			System.out.println(e); //when we print e then tostring method will get printed.
			e.printStackTrace();
			System.out.println("finished");
			}
	}
}
}
