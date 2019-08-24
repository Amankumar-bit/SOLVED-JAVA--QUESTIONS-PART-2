package work6;

import java.util.Arrays;
import java.util.Scanner;

public class ciricularsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		int sum = 0;
		int big =Integer.MIN_VALUE;                   //done  

		int mi = 0;

		for (int p = 0; p < t; p++) {

			int n = s.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++)

			{

				int m = s.nextInt();

				a[j] = m;
			}

			int no = 1;
			while (no <= n - 1) {
				int start = 0;
				int end = no;
				while (true) {
					if (start == a.length) {
						break;
					} else if (end > a.length - 1 || mi > 0) {
						for (int h = start; h <= a.length - 1; h++) {
							sum = sum + a[h];
						}
						if (end > a.length - 1) {
							end = end - (a.length);
						}
						for (int hs = 0; hs <= end; hs++) {
							sum = sum + a[hs];

						}
						mi++;
					} else {
						for (int i = start; i <= end; i++) {
							sum += a[i];

						}
					}

					big = Math.max(big, sum);
					sum = 0;
					start++;
					end++;

				}

				mi = 0;
				no++;

			}
Arrays.sort(a);
int b[]=new int [n];
for(int i=0;i<n;i++)
{
	b[i]=a[n-1-i];
}
			int li = 0;
			for (int i = 0; i < n; i++) {
				int max=Math.max(big,b[i]);
				if (max==b[i]) {
					li++;
					System.out.println(b[i]);
					break;
				}
			}
			if (li == 0) {
System.out.println(big);
			}
			big = 0;
			li=0;
		}

	}

}
