public class Array4
{
	public static void main(String args[])
	{
	
	  byte x[]={10,11,12,20,35};
	  for(int i=0;i<x.length-1;i++)
	  {
		  x[0]=(byte)(x[0]+x[i+1]);
		  
		  System.out.println(x[0]);
	  }
	  
	 // System.out.println(x[0]);
	  
/*	 for(int i=0;i<=4;i++)
	  {
		 System.out.println(x[i]);
	  }
	  System.out.println(x[0]);
	/*for(int i=x.length-1;i>=1;i--)
	{
			System.out.println(x[i]);
	}
	
	
	 
	
	*/
	
	}
	
	
	
	
}