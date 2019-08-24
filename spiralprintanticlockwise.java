package work6;
import java.util.Scanner;
public class spiralprintanticlockwise{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the dimensions");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		int[][] arr=new int [n][t];
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<t;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<t;j++)
			{
				System.out.print(arr[i][j]);
			}
		System.out.println();
		}
	int h=1;
   int count=n*t;
   System.out.println(count);
   int u=0;
   int bottom=n-1;
	 int left=0;
	 int right=t-1;
	 int top=0;
   while(h<=count)
   	 {
	   if(u==0&&h<=count)
	   {
		   int c=top;
		   while(c<=bottom)
		   {
			  System.out.print(arr[c][left]+", "); 
			   c++;

				  h++;
		   }
			  left++;
			  u++;
	   }
	   if(u==1&&h<=count)
	   {
		   int c=left;
		   while(c<=right)
		   {
			  System.out.print(arr[bottom][c]+", "); 
			   c++;

				  h++;
		   }
			  bottom--;
			u++;
	   }

	   if(u==2&&h<=count)
	   {
		   int c=bottom;
		   while(c>=top)
		   {
			  System.out.print(arr[c][right]+", "); 
			   c--;

				  h++;
		   }
			  right--;
			u++;
	   }
	   if(u==3&&h<=count)
	   {
		   int c=right;
		   while(c>=left)
		   {
			  System.out.print(arr[top][c]+", "); 
			
			  c--;

			  h++;
		   }
			  top++;
			u++;
	   }
 
	   u=0;
	   
	
   	 }
   System.out.print("END");
	
	
	
	
	
	
	
	
	
	
	
	
	


	}

}
