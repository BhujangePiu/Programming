public class Alpha
{

	public static void main (String[] args)
	{
		int i,j;
        char ch ='A';
		 int num=5;
		 for (i=65;i<70;i++)
		 {
       ch='A';

			 for(j=65;j<=i;j++)
			 {
				 System.out.print(ch);

				ch++; 
				 
				 
				 }

            System.out.println();
		 }
		
		showSaurabhInfo("abc",1);
		
		
	}

	public static void showSaurabhInfo(String name,int no){
		name="saurabh";no=1001;
		System.out.println("my name is "+name+"print number = ");
	}

}
