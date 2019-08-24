package work6;
import java.util.*;
public class tooglestrings {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s = new Scanner(System.in);
			String n = s.next();
			
			
			System.out.println(pass(n));
			
			
			
			
			
			
		}
	
		public static StringBuilder pass(String n)
		{
				StringBuilder m=new StringBuilder();
			
							
			for(int i=0;i<n.length();i++)
			{
				char x=n.charAt(i);
				if(x>96&&x<123)
				{
					x=(char)(x-32);
				m.append(x);
				}
				else if(x<91&&x>64)
				{
					x=(char)(x+32);
					m.append(x);
				}
				
			}
			
			
			
			return m;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}
