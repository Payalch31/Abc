import java.util.Scanner;
public class AdditionOfDigitsArray
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
int[] sum=new int[5];
//sum[0]=0;
int temp=0;
sum[0]=0;
for(int i=0,j=0;i<a.length;i++,j++)
{
 //  for(int j=0;j<sum.length;j++)
   //{
   
 while(a[i]!=0)
 {
	temp=a[i]%10;
	sum[j]=sum[j]+temp;
	 a[i]=a[i]/10;
 //}	 
   }
   

}
System.out.println("After adding each digit of element the resultant array is::");
for(int i=0;i<a.length;i++)
    {
	 System.out.print(sum[i]+" ");
   }


}
}