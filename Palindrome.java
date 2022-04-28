package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare string
		String text1="Chitra";
		String text2="";
		// find the length of string 
		int length = text1.length();
		for(int i =length-1 ;i>=0;i--)
		{
			text2 = text2 + text1.charAt(i);
			
		}
		if(text1.equalsIgnoreCase(text2))
			
		{
			System.out.println(text1 +  "is a palindrome");
		}
		else
		{
			System.out.println(text1 + " is not a palindrome");
		}
	}

}
