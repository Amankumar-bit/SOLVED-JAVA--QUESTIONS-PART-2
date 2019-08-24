package work6;


import java.util.Scanner;

public class linearsearch {

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
		System.out.println(linear(m,arr));
		

	}

	public static int linear(int m,int[]arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(m==arr[j])
			{
			return j;	
			}
			
		
		}
		return -1;
	}
	
	
	
}
