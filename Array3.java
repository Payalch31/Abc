import java.util.Scanner;
public class Array3
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int[] a={45,78,56,31,23};
 int[] b={45,23,1,2,3,85,56};
 System.out.println(" elsements of first array::");
 for(int i=0;i<a.length;i++)
 {
	 System.out.print(a[i]+ "  "); 
}
 
 System.out.println("\n Elements of second array::");
 for(int i=0;i<b.length;i++)
 {
	 System.out.print(b[i]+ "  "); 
}
 
 System.out.println("\n\nCommon elements between these two arrays are:::");
 
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<b.length;j++)
	 {
	 if(a[i]==b[j])
	 {
		 
	 System.out.print(a[i]+ " ");
	 }		 
	 }
}
 
  }

}