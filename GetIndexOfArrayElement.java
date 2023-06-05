import java.util.Scanner;

public class GetIndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array elements:::");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
		}
		System.out.println("Enter the element whose index needs to find::");
		int num=sc.nextInt();;
		sc.close();
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.print("Index of given element is::"+i);
			count++;
			}
			//else
			//	System.out.print("Number is not present");
		
		}
		if(count==0)
		System.out.print("Number is not present");	

	}

}
