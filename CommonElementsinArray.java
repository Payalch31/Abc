import java.util.Scanner;
public class  CommonElementsinArray
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int[] a=new int[6];
 int[] b=new int[6];
 System.out.println("Enter the 6 Elements of first array::");
 for(int i=0;i<a.length;i++)
 {
	 a[i]=sc.nextInt(); 
}
 
 System.out.println("Enter the 6 elements of second array::");
 for(int i=0;i<b.length;i++)
 {
	 b[i]=sc.nextInt(); 
}
 int count=0;
 System.out.print("Common elements in arrays are::");
 for(int i=0;i<a.length;i++)
 {
		for(int j=0;j<b.length;j++)
		{
 
           if(a[i]==b[j])
	    // count++;
        System.out.print(b[j]+" ");
		}
 }
 
 
 }

}