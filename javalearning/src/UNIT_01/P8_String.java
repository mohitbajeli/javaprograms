package UNIT_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		int j,i;
		int f=0;
		for( i=0,j=s.length()-1;i<s.length();i++,j--)
		{
			if(s.charAt(i)==(s.charAt(j)))
			{
				f++;
			}
		}
		if(f==s.length()-1)
		{
			System.out.println("Yes string is a pallindrome\n");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		int i;
		int j;
		String t = new String();
		for(i=s.length()-1,j=0;i>0;i--,j++)
		{
			t +=s.charAt(i);
		}
		

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		   System.out.println(s1.equals(s2));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true  
		
	}
}