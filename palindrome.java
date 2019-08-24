package work6;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
	String n = s.next();
	//System.out.println(n);
	System.out.println(pass(n));
}
public static Boolean pass(String n)
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
		return true;
		}
		
	return false;
}

}
