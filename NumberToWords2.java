import java.util.Scanner;
public class NumberToWords2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number::");
	int n=sc.nextInt();
	int reverse=0;
	while(n!=0)
	{
		int rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
	}
	//System.out.print(reverse);
	while(reverse!=0)
	{
		int rem=reverse%10;
	
	   switch(rem){
	   case 0:System.out.print("Zero   ");
				break;
		case 1:System.out.print("One   ");
				break;	
        case 2:System.out.print("Two   ");
				break;	
         case 3:System.out.print("Three   ");
				break;				
	   case 4:System.out.print("Four   ");
				break;	
		case 5:System.out.print("Five   ");
				break;	
		case 6:System.out.print("Six   ");
				break;
		case 7:System.out.print("Seven   ");
				break;		
		case 8:System.out.print("Eight   ");
				break;
		case 9:System.out.print("Nine   ");
				break;
				
		default:System.out.print("Invalid Input   ");
				break;
	   }
	reverse=reverse/10;
	}
	
}
}