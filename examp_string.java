package practiseProgram;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;

public class examp_string {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		
		try{ System.out.println("enrer no,double and string:");
	        
		    Scanner scan = new Scanner(System.in);
	       String s1=" ";
	       String s2=" ";
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	         scan.nextLine();//before read string
	          
            
	        // Write your code here.
	         s1=b.readLine();
	        s2=scan.nextLine(); 
	       //String s=s1;
	     //  System.out.println(s);
	        System.out.println("String: " + s1 +" " );
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        }
	        catch (Exception e)
	           { System.out.println(e);}
	    }
	
	}


