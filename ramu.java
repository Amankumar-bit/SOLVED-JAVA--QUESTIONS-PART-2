package work6;

import java.util.Scanner;

public class ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int  t = s.nextInt();
		
		
		for(int i=0;i<t;i++)
		{
			
			
			int  c1 = s.nextInt();
			int  c2= s.nextInt();
			int  c3= s.nextInt();
			int  c4= s.nextInt();
			int  n = s.nextInt();
			int  m= s.nextInt();
			
			int []a=new int[n];
		for(int j=0;j<n;j++)
			{
				a[j]= s.nextInt();
			}
		
		int []b=new int[m];

			for(int k=0;k<m;k++)
			{
				b[k]= s.nextInt();
			}
			
			
			check(c1,c2,c3,c4,a,b,m,n);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void check(int c1,int c2,int c3,int c4,int [] a,int [] b,int m,int n)
	{
		int totalr=0;
	
		for(int i=0;i<n;i++ )
		{
			totalr+=Math.min(c1*a[i],c2);
			}
		 
	
		
		int minr=Math.min(totalr,c3);
		
		
		

		int totalc=0;
	
		for(int k=0;k<m;k++ )
		{
			totalc+=Math.min(c1*b[k],c2);
		}
		 
		
		int minc=Math.min(totalc,c3);
		
		
	int headtotal=minr+minc;
	
	int min=Math.min(headtotal, c4);
	
	
	System.out.print(min);
	System.out.println();
	}
	

}
