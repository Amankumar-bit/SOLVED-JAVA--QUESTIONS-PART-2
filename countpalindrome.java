package work6;

import java.util.Scanner;

public class countpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String n = s.next();
		String h;
		//System.out.println(n);
		int k=0;int u=0;int d=0;
		
			for(int i=0;i<n.length();i++)
			{
				for(int j=i+1;j<=n.length();j++)
				{
					
					h=n.substring(i,j);
					//System.out.println(h);
					if(pass(h)==1)
					{
						//System.out.println(pass(h));
						d++;
					}
					else
					{
						continue;
					}
				}
			}
		
		
		System.out.println(d);
	}
	public static int pass(String n)
	{
		
			StringBuilder compare=new StringBuilder();
		
		
			for(int i=n.length()-1;i>=0;i--)
			{
				compare.append(n.charAt(i));
			
			}
			int count=0;
			//System.out.println(compare);
			for(int i=0;i<n.length()-1;i++)
			{
				if(compare.charAt(i)==n.charAt(i))
				{
				count++;
				}
				else
				{
					continue;
				}
			}

			if(count==n.length()-1)
			{
			return 1;
			}
			
		return -1;
	}

}
