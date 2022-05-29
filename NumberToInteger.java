package practiseProgram;
import java.util.Scanner;
public class NumberToInteger {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			   Scanner in = new Scanner(System.in);
			   System.out.println("enter number:");
			   int n = in .nextInt();
			   in.close();
			   //String s=???; Complete this line below
			  		  
			    String s=Integer.toString(n);

			   
			   if (n == Integer.parseInt(s)) 
			   {
			    System.out.println("Good job");
			   } else
			   {
			    System.out.println("Wrong answer.");
			   }
		}catch (Exception e) {
			   System.out.println("Unsuccessful Termination!!"+e);
		  }
		
	 }
}

