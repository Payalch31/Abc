import java.util.Scanner;
public class ReverseOrderArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
 int[] a=new int[5];
 
 System.out.println("Enter the 5 Elements of first array::");
 for(int i=0;i<a.length;i++)
 {
	 a[i]=sc.nextInt(); 
}
 int[] b=new int[a.length];
 b[0]=a[(a.length-1)];
 for(int i=(a.length-1),j=0;j<b.length;i--,j++)
 {
   // for(int j=0;j<b.length;j++)
	//{
	b[j]=a[i];
	//}
 }
 System.out.println("Array in reverse order");
 for(int k=0;k<b.length;k++)
 {
 System.out.println(b[k]);
 }
 
}
}