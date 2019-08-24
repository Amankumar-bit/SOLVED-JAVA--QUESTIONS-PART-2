package work6;

import java.util.Scanner;

public class reverse {

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
		
		rev(arr);
		

	}
	
	
	

	public static void rev(int[]arr)
	{
		int c=arr.length;
		if (c%2==0)
		{
			for(int i=0;i<arr.length/2;i++)
			{
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;
			//System.out.println(arr[i]);
			}
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]);
			}
			
		}
		else
		{
			for(int i=0;i<arr.length/2+1;i++)
			{
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;	
			}
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]);
			
			}
		
	
	
	}




}
}
