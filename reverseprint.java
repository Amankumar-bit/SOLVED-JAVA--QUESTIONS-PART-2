package work6;

import java.util.*;

public class reverseprint {

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
		for (int j = 0; j < n; j++) {
			if (j % 2 == 0)

			{
				for (int i = 0; i < t; i++) {
					System.out.print(a[i][j] + ", ");
				}
			} else

			{
				for (int i = t - 1; i >= 0; i--) {
					System.out.print(a[i][j] + ", ");
				}
			}
		}
		System.out.print("END");
	}
}