package work6;

import java.util.Scanner;

public class binarytshirtdesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		
		for(int i=0;i<t;i++)
		{	
			int n = s.nextInt();
				for(int j=1;j<=n;j++)
				{
			     pass(j);
			     System.out.print(" ");
				}
				System.out.println();
		
		}
		
		
	}
	public static void pass(int j )
	{
		int rem;
		int q=j;
		int sum=0;
		int a=0;
        while(q!=0)
        { rem=q%2;
        	q=q/2;
        	
        	int m=(int) Math.pow(10,a);
        	sum=sum+(rem*m);
        	a++;
        	
        	
        }
		
		System.out.print(sum);

	
	
	}
	

}
