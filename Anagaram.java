package week2.day2;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare  2 strings 
		String text1="stops";
		String text2="potss";
		// Check the length of strings 
		if(text1.length()==text2.length())
		{
	    //Convert the string to char
		char[] char1= text1.toCharArray();
		char[] char2=text2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		boolean text=Arrays.equals(char1, char2);
		// Check the array 
		if(text)
		{	
		System.out.println("Anagram");
		}
		else
		{
		System.out.println(" Not Anagram");
		}
		
	}
	}

}
