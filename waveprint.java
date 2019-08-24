package work6;

import java.util.Scanner;

public class waveprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n = s.nextInt();
		int[][] a = new int[t][n];

		for (int i = 0; i < t; i++)

		{
			for (int j = 0; j < n; j++) {
				int m = s.nextInt();

				a[i][j] = m;

			}

		}

		for (int i = 0; i < t; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j] + ", ");

				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(a[i][j] + ", ");
				}
			}
			
		}
		System.out.print("END");
	}
}