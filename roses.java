package work6;

import java.util.Scanner;

public class roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int compare=0;
		int dj=0;
		int dk=0;
	for(int i=0;i<t;i++)
	{	compare=0;
		int n = s.nextInt();
		
		int[] a=new int [n];
		for(int j=0;j<n;j++)
		{
			
			int v = s.nextInt();
		a[j]=v;
		}
		
		int h = s.nextInt();
		
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(h==a[j]+a[k]&&k!=j)
				{
					if(a[k]>=a[j])
					{
					int u=a[k]-a[j];
				 
					if(u<=compare)
						{
						compare=u;
						
						dk=a[k];
							dj=a[j];
							
						}	
						else if(compare==0)
						{ u=a[k]-a[j];
						compare=u;
						}
					}
					else
						{
int							u=a[j]-a[k];
							if(u<=compare)
							{	
									compare=u;
						
									dk=a[k];
									dj=a[j];
							}
							else if(compare==0)
							{ u=a[j]-a[k];
							compare=u;
							}
			
						}
			
				}
		
			}
			
		}
		if(dk<dj)
		{
		System.out.println("Deepak should buy roses whose prices are "+dk+ " and "+dj+".");
		}
		else
		{
			System.out.println("Deepak should buy roses whose prices are "+dj+ " and "+dk+".");
		}
		}
		
	
		
	
	
	
	}

}
