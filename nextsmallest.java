package work6;

import java.util.Scanner;

public class nextsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int lount = 0;

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n;
		int h = 0;
		int u = 0;

		for (int i = 0; i < t; i++)
		{

			n = s.nextInt();
			int[] a = new int[n];
			for (int k = 0; k < n; k++)
			{
				a[k] = s.nextInt();

			}
			for (int l = 0; l < n; l++) 
			{count = 0;
if(l<n-2)
{
				for (int j = l + 1; j < n; j++)
				{
					

					if (a[l] < a[j]&&a[l]!=a[j])
					{
						count++;
						h = j;
						u = a[j];
						break;
					} else {
						continue;
					}

				}
			
				

				if (count > 0)
				{lount=0;
					for (int f = h + 1; f < n; f++) 
					{
						if (u > a[f]&&u!=a[f])
						{
							lount++;
							System.out.print(a[f] + " ");
							break;
						} 
						
					}
					if (count>0&&lount == 0) {
						System.out.print(-1 + " ");
					}
				}
				
					
				else if (count == 0)
				{
						System.out.print(-1 + " ");
				}
					

				
	
	}
else {
	System.out.print(-1+" ");
}
			}

		}
	}
}