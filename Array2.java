import java.util.Scanner;
public class Array2
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int[] a=new int[5];
 int[] b=new int[5];
 System.out.println("Enter the 5 Elements of first array::");
 for(int i=0;i<a.length;i++)
 {
	 a[i]=sc.nextInt(); 
}
 
 System.out.println("Enter the 5 elsements of second array::");
 for(int i=0;i<b.length;i++)
 {
	 b[i]=sc.nextInt(); 
}
 
 System.out.println("Common Elements between these two arrays are:::");
 
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<b.length;j++)
	 {
	 if(a[i]==b[j])
	 {
		System.out.println(a[i]);
	 }		 
	 }
}
 
 
 
 }

}