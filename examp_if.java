package practiseProgram;
import java.util.Scanner;

public class examp_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		try{ System.out.println("enter name and no:");
		    String s= scanner.nextLine();
		    System.out.println(s);
	        int N = scanner.nextInt();
	       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if (N>=2 &&N<=5 && N%2!=0)
	           {//if (N%2!=0 )
	              System.out.println("weired");
	           }
	         else if (N>=6&& N<=20 && N%2==0 )  
	            { //if(N%2==0)
	               System.out.println("weired");
	            }
	         else if (N>20 && N%2==0)
	               { 
	                System.out.println("not weired");
	               }
	        scanner.close();
	        }catch(Exception e)
	         {
	             System.out.println(e);
	         }
	    }
	}


