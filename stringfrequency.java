package work6;

import java.util.Scanner;

public class stringfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s = new Scanner(System.in);
		String n = s.next();
		
		
		System.out.println(pass(n));
		
		
		
		
		
		
	}

	
	public static char pass(String n)
	{
		
		char i;
		int compare=0;
		int count =0;
		char x=0;
		for(i='a';i<='z';i++)
		{
			count=0;
			for(int j=0;j<n.length();j++)
			{
				if (i==n.charAt(j))
				{
					count++;
				}
			}
			if(count>compare)
			{
				compare=count;
				x=i;
			}
		}
		return x;
		
		
		
		
		
		
		
		
		
		
	}
}