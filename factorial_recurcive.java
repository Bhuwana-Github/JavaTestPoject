package practiseProgram;

import java.util.Scanner;

public class factorial_recurcive 
	{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n, Result;
	try 
		 {	System.out.println(" Enter the value of N:");
			Scanner sr= new Scanner(System.in);
			n = sr.nextInt();
			
			factorial_recurcive obj = new factorial_recurcive();
			Result=obj.Factorial(n);
			System.out.println(" Factorial of N is :"+Result);
		} catch( Exception e)
			{
			 System.out.println(e);
			}
	}
  public int Factorial(int N)
	  { if(N<0)
	    	 return -1;
	    else if(N<2)
	    	 return 1;
	    else 
	    	
	    	return (N*Factorial(N-1));
	  }
	
}
