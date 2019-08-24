package work6;

import java.util.Scanner;

public class binarysearch {

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
		int m = s.nextInt();
		System.out.println(binary(m,arr));
		

	}

	public static int binary(int m,int[]arr)
	{
		int	start=0;
		int	end=arr.length-1;
		for(int i=0;i<arr.length;i++)
			{
		
		int	mid=(start+end)/2;
		if(m==arr[mid])
			{
			return mid;
			}
		else if(m>arr[mid])
			{
			start=mid+1;
			}
		else
			{
			end=mid-1;
			}
		

			}
		return -1 ;
	}
	
	

}