package work6;

import java.util.Arrays;
import java.util.Scanner;

public class aggcow {

	
	
	public static boolean isvalid(int[] sti,int mid,int c)
	{
		
		int count=1;            //we can always put the cow at the first place so we always put count =1
		int pre=sti[0];
	if (sti.length<c)
		return false;
		
		for(int i=1;i<sti.length;i++)
		{
			if((sti[i]-pre)>=mid)
			{
				pre=sti[i];
				count++;
			}
		
		}
		
		if(count>=c)
		{
			return true;
			
		}
		else
			{
			return false;
			}
		
		
	}
	public static void main(String[] args) {
		

		int result=0;

		Scanner si = new Scanner(System.in);
		int st = si.nextInt();
		int c = si.nextInt();
		int [] sti=new int[st];
	
			for(int i=0;i<st;i++)
			{
				sti[i]= si.nextInt();
			}
			Arrays.sort(sti);
			int  mid;
			int 	min=0;
			int max= sti[st-1]-sti[0];
	
			
					
			
			while(min<=max)
			{
				mid =(max+min)/2;
	
				if(isvalid(sti,mid,c)==true)
				{
					result=mid;
					min=mid+1;
		
				}
				else
				{
		
					max=mid-1;
					}
		
			}
			System.out.println(result);

	}

}
