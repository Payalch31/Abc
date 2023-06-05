import java.util.Scanner;
public class PrimeNumbersinArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
 int[] a=new int[5];
 
 System.out.println("Enter the 5 Elements of array::");
 for(int i=0;i<a.length;i++)
    {
	 a[i]=sc.nextInt(); 
   }
   
    System.out.println("Prime numbers in an array::");
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=2;j<=a[i];j++)
		{
		   if(a[i]%j==0)
			   count++;
		}
		if(count>2)
		{
		//System.out.print("No prime numbers are found in array");
		}
		else
		{
			System.out.print(a[i]+" ");
		}
		
		}
}
}