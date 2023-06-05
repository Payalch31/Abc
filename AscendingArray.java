import java.util.Scanner;
public class AscendingArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  5 array elements::");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	
	}
	
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		}
	
	System.out.println("Sorted array is here::");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	
	}
	
	
	
	
	
	
}
}