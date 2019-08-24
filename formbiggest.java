package work6;

import java.util.*;

public class formbiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n;

		for (int i = 0; i < t; i++) 
		{
			StringBuilder m=new StringBuilder();
			n = s.nextInt();

			int[] a = new int[n];
			for (int k = 0; k < n; k++)
			{
				a[k] = s.nextInt();

			}
		
			if (n>1&&(a[1]==0||a[0]==0))
			{Arrays.sort(a);
			int[] b=new int [n];
for(int u=0;u<n;u++)
{
	b[u]=a[u];
}
for(int u=0;u<n;u++)
{
	a[u]=b[n-u-1];
}
			}
			for(int j=0;j<n;j++)
			{
				for(int k=1;k<n-j;k++)
				{
					
					if(compare(a[k-1],a[k])==true)
					{
						int temp=a[k-1];
						a[k-1]=a[k];
						a[k]=temp;
					}
				}
			
			}
			
        for (int j = 0; j < n; j++)
			{
			m.append(a[j]);
			}
        System.out.print(m);
        System.out.println();
		}
		
		
		
	}

	public static Boolean compare(long num, long lum) {
		long be = (long) Math.pow(10, size(num));
		long af = (long) Math.pow(10, size(lum));

		long before = (num * af) + lum;
		long later = (lum * be) + num;
		if (before >= later) {
			return false;
		}

		return true;

	}

	public static int size(long com) {
		int m = 0;
		while (com != 0) {
			com = com / 10;
			m++;
		}
		return m;
	}

}
