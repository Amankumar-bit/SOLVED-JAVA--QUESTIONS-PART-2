package work6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class inverseofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] b;
		b=new int[n];
		int[] a = new int[n];
int l=0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			 
		}
		inverse(a,l,n,b);
//		for(int k=0;k<n;k++)
//			{
//			System.out.print(c[k]);
//			}
		
		
		
	}

	
	public static void inverse(int[] a,int l,int n,int[] b)
	{	
		
		if(l==n) {
		return ;
		}

		int c=a[l];
         b[c]=l;
         
         inverse(a,l+1,n,b);
         System.out.print(b[n-1-l]+" "); 
    //    return b;
		
		
	}
}
