import java.util.Scanner;

public class PairOfAdditionSpecifiedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		System.out.println("Enter array elements::");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
		}
		//System.out.println("Enter the element whose addition of pairs needs to find::");
		int num=43;
		sc.close();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
			  // sum=sum+a[i]+a[j];
			   
			   if(a[i]+a[j]==num)
			   {
				   System.out.print("Numbers are::");
			   System.out.print(a[i]+" "+a[j]);
			   
				break;
			   }
			}
		
		}
		

	}

}
