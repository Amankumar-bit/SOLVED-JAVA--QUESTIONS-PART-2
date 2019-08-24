package work6;

import java.util.Scanner;

public class formbiggest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n;
		
		
		
		for(int i=0;i<t;i++)
		{
			StringBuilder d=new StringBuilder();
			StringBuilder c=new StringBuilder();
	 n = s.nextInt();
		 
			int [] a =new int[n];
				for(int k=0;k<n;k++)
				{
				         	a[k]= s.nextInt();
		
				}
		
				int num=a[0];  
				int later;
			for(int j=0;j<n-1;j++)
			{         
		int lum=a[j+1];
			
			 d.append(num);
			 d.append(lum);
			 c.append(lum);
			 c.append(num);
 String be=d.substring(0,d.length());
			 String af=d.substring(0,d.length());
//			 int l=Integer.parseInt(be);
//			 int m=Integer.parseInt(af);

			int p= be.compareTo(af)>0?0:1;
			if(p==0)
			{
				System.out.println(d);
			}
			else
			{
				System.out.println(c);
			
			}

			}
				
				
		
		}
		
		
		
		
		
		
		
		
		
	}
		
}
