import java.util.Scanner;
public class TwoDArrayReverse {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][];
		a[0]=new int[1];
		a[1]=new int[2];
		a[2] = new int[3]; 
		a[3] = new int[4];
		int b[][]=new int[4][];
		b[0]=new int[1];
		b[1]=new int[2];
		b[2] = new int[3]; 
		b[3] = new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2D Array elements::");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			  a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
        sc.close();
		System.out.println("Copying the elements in second array....");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			  b[i][j]=a[i][j];
			  System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	
		System.out.println("Array elements in reverse order::....");
		for(int i=(a.length-1);i>=0;i--)
		{
			for(int j=(b[i].length-1);j>=0;j--)
			{
			  System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	
	
	}
		
		
}


