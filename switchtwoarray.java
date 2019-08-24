package work6;

import java.util.ArrayList;
import java.util.Scanner;

public class switchtwoarray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int j = 0; j < t; j++)

		{
			int n = s.nextInt();
			int m = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			ArrayList<Integer> store = new ArrayList<Integer>();
			ArrayList<Integer> store1 = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int l = 0; l < m; l++) {
					if (a[i] == b[l]) {
						int u = i;
						store.add(u);
						int y = l;
						store1.add(y);
					}
				}
			}
			store.add(n - 1);
			store1.add(m - 1);

			result(store, store1, b, a);

		}

	}

	private static void result(ArrayList<Integer> store, ArrayList<Integer> store1, int[] b, int[] a) {

		int sum = 0;
		int lum = 0;
		int headsum = 0;
		int j = 0;
		int i = 0;
		int l = 0;
		int k = 0;
		while (i < store.size() || l < store1.size()) {
			while (j <= store.get(i)) {
				sum = sum + a[j];

				j++;
			}

			while (k <= store1.get(l)) {
				lum = lum + b[k];

				k++;
			}
			headsum += Math.max(sum, lum);

			sum = 0;
			lum = 0;

			i++;
			l++;

		}
		System.out.println(headsum);
		System.out.println();
	}

}
