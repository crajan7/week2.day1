package week2.day2;

public class Charoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="welcome to chennai";
      int count=0;
      int length=str.length();
      char[] charArray1 = str.toCharArray();
      for(int i=0;i<length;i++)
      {
    	  if(charArray1[i]=='e')
    	  {
    		  count=count+1;
    		  
    	  } 
     
      }

System.out.println(" the occurence of letter e is " +count);

	}

}
