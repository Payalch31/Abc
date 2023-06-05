import java.util.Scanner;
public class SmallnumberArray
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
 
 int min=a[0];
  for(int i=0;i<a.length;i++)
 {
	 if(a[i]<min)
			min=a[i];
}
 System.out.println("Smallest number is::"+min);
 
}
}