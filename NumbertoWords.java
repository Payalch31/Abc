import java.util.Scanner;
public class NumbertoWords
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number::");
n=sc.nextInt();
//while(n>=0)
//{
switch(n)
{
case 1:System.out.print("One"+" ");
			break;
		
case 2:System.out.print("Two"+" ");
		break;
case 3:System.out.print("Three"+" ");break;
case 4:System.out.print("Four"+" ");break;
case 5:System.out.print("Five"+" ");break;
case 6:System.out.print("Six"+" ");break;
case 7:System.out.print("Seven"+" ");break;
case 8:System.out.print("Eight"+" ");break;
case 0:System.out.print("Zero"+" ");break;
default:System.err.print("Invalid Input");
}
//}




}




}