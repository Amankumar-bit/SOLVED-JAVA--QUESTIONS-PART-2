package work6;

import java.util.Scanner;

public class basiccompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String n = s.next();
		
		
		System.out.println(pass(n));
		
		
		
		
		
		
	}

	
	public static StringBuilder pass(String n)
	{
		int count=1;
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
							
							m.append(count+1);
							
							
						}
				count++;
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
						if(count>1)
						{
						m.append(count);
						}
						if(i==n.length()-1)
						{
							m.append(y);
							if(count>1)
							{
							m.append(count);
							}
						}
						
						
					x=y;
						count=1;
					}
						
		}
		
		
		
		return m;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}