import java.util.Scanner;
public class DuplicateElementsinArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 9 array elements::");
	int a[]=new int[9];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	
	}
	
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		  if(a[i]==a[j])
		  {
			  System.out.print(a[j]+" ");
		   count++;
		}
		}
		
	}
	System.out.print("\n");
System.out.println("the total number of duplicate elements are::"+count);

}
}