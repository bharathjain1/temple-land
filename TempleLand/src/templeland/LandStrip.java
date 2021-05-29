package templeland;
import java.util.*;

public class LandStrip {

	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			System.out.println("enter the strips");// Enter the strip length
			int n=sc.nextInt();
			int ab[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ab[i]=sc.nextInt();//Enter the values
				
			}
			if((n%2==0)||ab[0]!=1)//If on mod=0 then conditions doesnt satisfies.
			{
				System.out.println("no");
				continue;
				
			}
			
				int c=1;
				int l=n-1;
				int p=0;
				for(int i=0;i<n/2;i++)
						{
							if(ab[i]!=c||ab[l]!=c)// comparing the values if values are not same then condition not satisfies.
						{
								p=1;
								break;
						}
							else
						{
								c++;//if values are same then condition satisfies and c value  increments and l decrements.
								l--;
							}
						}
				if(ab[n/2]!=c)// if c value not equals mid value then condition does not satisfy
					p=1;
				if(p==0)
					System.out.println("yes");
				else
					System.out.println("no");
			
			
		}

	}

}
