package practiseProgram;
import java.util.*;
import java.io.*;
import java.lang.Math;
//https://www.codingbroz.com/java-lambda-expressions-solution/
public class examp_series {
//series	(a+2^0 .b), (a+2^0 .b+2^1.b),……..( a+2^0 .b+2^1.b+…..+2^n-1.b)//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        
		        for(int i=0;i<t;i++){
		             int s=0,sum =0,cons=0;
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            if( (n>=1&&n<=15) && (a>=0&&a<=50) && (b>=0&&b<=50) )
		             {
		                for (int j=0;j<=(n-1);j++)
		                 { 
		                   if(j == 0)
		                   {
		                    cons = 1;
		                    sum = a + (cons*b) + sum;
		                    }else
		                    {
		                    cons = cons * 2;
		                    sum = (cons * b) + sum;
		                     }
		                  System.out.print (sum + " ");
		                  
		                 
		                }
		             }
		       System.out.println();
		                         
		        }
		        in.close();
		    }
		    }

	}

}
