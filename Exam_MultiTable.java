package practiseProgram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Exam_MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int i,t;
	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        for (i=1; i<=10;i++)
	        { t=N*i;
	          System.out.println(String.format("%dx%d=%d",N,i,t));
	            
	        }
	        bufferedReader.close();
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
	       
	    }
	}


