import java.util.*;
public class RemoveElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the count of how many element u want in an array::");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the n array elements::");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n-1];
		System.out.println("Enter index which element you want to remove::");
		int pos=sc.nextInt();
		sc.close();
		
		for(int i=0;i<a.length-1;i++)
		{
			if(pos<i)
			{
				b[i]=a[i];
			}
			else if(pos==i)
			{
				b[i]=a[i+1];
			
			}
			else
			{
				b[i]=a[i];
			}
			
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(b[i]+" ");

		}
		
		

	}

}
