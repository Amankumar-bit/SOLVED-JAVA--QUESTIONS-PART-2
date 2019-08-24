package work6;

import java.util.Scanner;

public class rainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] a;

		int sum = 0;
		for (int h = 0; h < t; h++) 
		{
		int  n = s.nextInt();
			a = new int[n];

			for (int i = 0; i < n; i++)
			{
				a[i] = s.nextInt();
			}
			int [] l=new int [n];
			int [] r=new int [n];
			l[0]=a[0];
			for(int k=1;k<n;k++)
			{
				l[k]=Math.max(l[k-1],a[k]);
			}
			r[n-1]=a[n-1];
			for(int p=n-2;p>=0;p--)
			{
				r[p]=Math.max(r[p+1],a[p]);
			}
			for
			(int u=0;u<n;u++)
			{
				sum+=Math.min(l[u], r[u])-a[u];
			}
			System.out.println(sum);
	}

}
	}
