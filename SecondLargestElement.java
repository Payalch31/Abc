import java.util.Scanner;
public class SecondLargestElement
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 8 array elements::");
	int a[]=new int[8];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	
	}
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]<a[j])
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
	System.out.println("..............................");
	for(int i=0;i<a.length;i++)
	{
	if(a[i]!=a[i+1])
	{
	System.out.println("Second largest element from array is::"+a[i+1]);	
	return;
	}
	}
	
	
}
}