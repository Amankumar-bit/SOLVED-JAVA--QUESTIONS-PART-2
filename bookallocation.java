package work6;

import java.util.Scanner;

public class bookallocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		Scanner si = new Scanner(System.in);
		int t = si.nextInt();

		for (int i = 0; i < t; i++) {
			int max = 0;
			int min;
			int mid;
			int net = 0;
			int b = si.nextInt();
			int s = si.nextInt();
			int[] book = new int[b];
		if(s>b) {
			System.out.println(-1);
			break;
			
		}
			for (int j = 0; j < b; j++) {
				book[j] = si.nextInt();

			}

			for (int j = 0; j < b; j++) {
				max += book[j];

			}

			min = 0;

			while (min <= max) {
				mid = (min + max) / 2;
				if (isvalid(book, mid, s) == true) {
					net = mid;
					max = mid - 1;

				} else {
					min = mid + 1;
				}
			}

			System.out.println(net);

		}

	}

	public static boolean isvalid(int[] book, int mid, int s) {
		int sum = 0;

		int count = 1;
		for (int i = 0; i < book.length; i++) {
			
			if(book[i]>mid)
				return false;
			if (sum + book[i] > mid) {
				sum = book[i];
				count++;
				if (count > s) {
					return false;
				}

			} else {

				sum = sum + book[i];

			}

		}

		return true;

	}

}
