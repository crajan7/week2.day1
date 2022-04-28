package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="I am a software tester";
		String[] split1 = text.split("");
		String rev="";
		int count=0;
		for(int i=0;i<split1.length;i++)
		{
			count=i%2;
			if(count==0)
			{
				System.out.print(split1[i]);
				
			}
			else
			{
				char[] rev1=split1[i].toCharArray();
				
				for(int j=split1.length;j>=0;j--)
				{
				System.out.print(rev1[j]);
			}	
			
		}

	}

}
}
