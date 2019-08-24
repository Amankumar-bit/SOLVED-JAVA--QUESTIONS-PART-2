package work6;
import java.util.*;
public class pascaltraingle {

	public static void main(String[] args) {
		
		int c=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{int d=1;
		 c=d;
			for(int j=0;j<=i;j++)
			{
				System.out.print(d+"\t");
				
				d=d*(i-j)/(j+1);
				
			}
		//	System.out.print(c);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
