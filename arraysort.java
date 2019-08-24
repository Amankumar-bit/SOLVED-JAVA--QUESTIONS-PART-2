package work6;

import java.util.Scanner;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		String n = s.next();
		
		
		System.out.println(pass(n));
		
		
		
		
		
		
	}

	
	public static StringBuilder pass(String n)
	{
		int count=0;
		StringBuilder m=new StringBuilder();
		char x=n.charAt(0);
		for(int i=1;i<n.length();i++)
		{
		//	char x=n.charAt(0);
			char y=n.charAt(i);
					if(x==y)
					{
						 if(i==n.length()-1)
						{
							m.append(y);
						}
//						count++;
//						if(count==1)
//						{
//							m.append(x);
//						}
//						else
//						{
//						continue;
//						}
					}
					
					else
					{	
						 
						m.append(x);
						if(i==n.length()-1)
						{
							m.append(y);
						}
						
						
					x=y;
						count=0;
					}
						
		}
		
		
		
		return m;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}