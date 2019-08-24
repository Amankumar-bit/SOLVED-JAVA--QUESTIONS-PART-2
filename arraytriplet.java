package work6;

import java.util.Scanner;

public class arraytriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		
		
			
			int [] a=new int[t];
			for (int j=0;j<t;j++)
				
			{			
				int m = s.nextInt();
			
				a[j]=m;
			}
			

			int n = s.nextInt();
       print(a,n);
			
			
				
	
	
	
	
	
	
	
	}
	
	public static void print(int[] a,int n) {
		
		
		
		for(int i=0;i<a.length;i++)
	     {
	    	 for(int j=0;j<a.length-i-1;j++)
	    	 {
	    		 if(a[j]>a[j+1])
	    		 {
	    			 int temp;
	    			 temp=a[j];
	    			 a[j]=a[j+1];
	    			 a[j+1]=temp;
	    			 //System.out.print(arr[j]);
	    		 }
	    		 else
	    		 {  //System.out.print(arr[j]);
	    			 continue;
	    			
	    		 }
	    	 }
	    
	     }
//		for(int k=0;k<5;k++)
//	     {
//	    	 System.out.print(a[k]);
//	     }
		
		int i=0;
		while(i<a.length)
		{
			
		   for(int k=0;k<a.length;k++)
			{
			   if(k!=i&&i<k)
			   	{
				   for(int l=0;l<a.length;l++)
				   {
					   if(l!=k&&k<l)
					   {
						   int c=a[i]+a[k]+a[l];
						   if(n==c)
						   {
							   int[] b=new int[3];
							   b[0]=a[i];b[1]=a[k];b[2]=a[l];
							   print(b);
				               System.out.println(b[0]+", "+b[1]+" and "+b[2]);
						   }
						   else
						   {
				continue;
						
						   }
					   }
				   }
			   
			   	}
			}
			i++;
		}	
	
	}


	public static int[] print(int[] b)
	{
		
		for(int i=0;i<b.length;i++)
	     {
	    	 for(int j=0;j<b.length-i-1;j++)
	    	 {
	    		 if(b[j]>b[j+1])
	    		 {
	    			 int temp;
	    			 temp=b[j];
	    			 b[j]=b[j+1];
	    			 b[j+1]=temp;
	    			 //System.out.print(arr[j]);
	    		 }
	    		 else
	    		 {  //System.out.print(arr[j]);
	    			 continue;
	    			
	    		 }
	    	 }
	    
	     }
		
		
		
		
		
		return b;
		
	}


}
