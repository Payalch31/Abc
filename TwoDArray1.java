import java.util.Scanner;
public class TwoDArray1
{
public static void main(String args[])
{
int a[][]=new int[4][]; 
a[0] = new int[1]; 
a[1] = new int[2];
a[2] = new int[3]; 
a[3] = new int[4];
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

}
}