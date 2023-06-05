import java.util.Scanner;
public class AdditionOfArray
{
public static void main(String args[]){
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
int[] c=new int[a.length];

for(int i=0,j=0,k=0;i<a.length;i++,j++,k++)
 {
		
			
				c[k]=a[i]+b[j];
			//}
           
        
		
 }
System.out.println("Addition of both array is:");
for(int i=0;i<c.length;i++)
 {
	 System.out.println(c[i]);
}

}


}
