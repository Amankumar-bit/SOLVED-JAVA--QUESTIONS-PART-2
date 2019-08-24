package work6;

import java.util.Scanner;

public class differenceascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		Scanner s = new Scanner(System.in);
		String n = s.next();
		
		StringBuilder sb=new StringBuilder();		
		
		for( i=0;i<n.length()-1;i++)
		{
			
			
			int c=n.charAt(i+1)-n.charAt(i);
			System.out.println(c);
			sb.append(n.charAt(i));
			sb.append(c);
			
		}
		sb.append(n.charAt(i));
		System.out.println(sb);
		
		
		
	}

}