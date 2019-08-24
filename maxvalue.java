package work6;

import java.util.Scanner;

public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] arr;
		arr=new int[t];
		for (int i=0;i<t;i++)
		{
			int n = s.nextInt();
			arr[i]=n;
		}
		
		System.out.println(max(arr));
		

	}
	
	
	
	public static int max(int[]arr)
	{
		
		
		for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr.length-i-1;j++)
	    	 {
	    		 if(arr[j]>arr[j+1])
	    		 {
	    			 int temp;
	    			 temp=arr[j];
	    			 arr[j]=arr[j+1];
	    			 arr[j+1]=temp;
	    			 //System.out.print(arr[j]);
	    		 }
	    		 else
	    		 {  //System.out.print(arr[j]);
	    			 continue;
	    			
	    		 }
	    	 }
	    
	     }
		
		
		
		return arr[arr.length-1];
		
		
		
		
		
		
		
		
		
	}
}
