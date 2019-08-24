package work6;

import java.util.Scanner;

public class stringascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m;
		Scanner s = new Scanner(System.in);
		String n = s.next();
		
		System.out.println(pass(n));
	}
	
	public static StringBuilder pass(String n)
	{
		char h;
		
		StringBuilder m=new StringBuilder();
		for(int i=0;i<=n.length()-1;i++)
		{
			h=n.charAt(i);
			if((i+1)%2!=0)
			{
				h++;
				m.append(h);
			}
			else 
			{
				h=(char)(h-1);
				m.append(h);
			}
		}
	return m;
	}

}
