package work6;

import java.util.*;

public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int m = s.nextInt();
			a[i] = m;
		}

		int t = s.nextInt();

		for (int i = 0; i < t; i++) {
			int count = 0;

			int k = s.nextInt();
			int g = s.nextInt();

			for (int h = 0; h < n; h++) {
				if (k % a[h] ==0)
				{
					count++;
				}
//					else if(a[h]==0)
//					{
//						continue;
//					}
				
			}
			if (count >= g) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}

		}

	}

}
