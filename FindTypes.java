package week2.day2;

public class FindTypes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text="$$ Welcome to 2nd class of Automation $$";
     int letter=0, space=0,num=0,specialchar=0;
     char[] charArray1 = text.toCharArray();
     for (int i=0;i<charArray1.length;i++)
   
     {
    	 if(Character.isLetter(charArray1[i]))
    	 {
    	 letter=letter+1;
    	 
     }
    	 else if(Character.isDigit(charArray1[i]))
    	 {
    		 num=num+1;
    	 }
    	 
    	 else if(Character.isSpaceChar(charArray1[i]))
    	 {
    		 space=space+1;
    	 }
    	 else
    	 {
    		 specialchar=specialchar+1;
    		 
    	 }
    	 }
     System.out.println("letter " + letter);
     System.out.println("space " + space);
     System.out.println("num " + num);
     System.out.println("Special Characters " + specialchar);
    	 }

}
