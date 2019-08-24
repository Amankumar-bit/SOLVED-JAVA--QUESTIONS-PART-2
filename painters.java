package work6;

import java.util.Arrays;
import java.util.Scanner;

public class painters {

	public static boolean isvalid(int[] board,int mid,int k)
	{
		int count;
		int sum=0;
		count =1;
		for(int i=0;i<board.length;i++)
		{
			if(sum+board[i]>mid)
			{
			 sum=board[i];
			 count++;
			 if(count>k)
			 {
				 return false;
			}
			}
			else
			{
				sum=sum+board[i];
			}
			
		}
		
		
	
		
		
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner si = new Scanner(System.in);
		
		int k = si.nextInt();
		int n = si.nextInt();
		int[] board = new int[n];
		for (int j = 0; j < n; j++) {
			board[j] = si.nextInt();

		}
	//Arrays.sort(board);
		int max=0;
		for (int j = 0; j < n; j++) {
		 max=max+board[j];

		}
		
		int min=board[0];
		for (int j = 1; j < n; j++) {
			 min=Math.max(min,board[j]);

			}
		int mid;
		
		int time=0;
		while(min<=max)
		{
			
		
		mid=(max+min)/2;
		
			if(isvalid(board,mid,k)==true)
			{
				time=mid;
				max=mid-1;
			}
			else
			{
				min=mid+1;
			}
		}
			

		
System.out.println(time);

	}
}
