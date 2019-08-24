package work6;

import java.util.Scanner;

public class cyclicraj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a;
		int[] b;
		a=new int[n];
		b=new int[n];

		for (int i=0;i<n;i++)
		{
			int t = s.nextInt();
			a[i]=t;
		}  
		int sum=0;
		int o = s.nextInt();			//no of operations
		
		
	for(int h=0;h<o;h++)
		{
			int x = s.nextInt();
			for(int i=0;i<n;i++)
				{
				int m=n+i-x;
					if(m>(n-1)) 
					{
						m=m-n;
						b[i]=a[i]+a[m];	
					}
					else
					{
						b[i]=a[i]+a[n+i-x];
					}
			
				}
			for(int j=0;j<n;j++)
			{
		 
				a[j]=b[j];
		
			}
	
		}
			for(int j=0;j<n;j++)
			{
				sum=sum+a[j];
			
	
	
			}
			int m=(int)Math.pow(10, 9)+7;
			int mn=sum%m;
			System.out.print(mn);
					
	
	}
	}
