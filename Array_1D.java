package practiseProgram;
import java. util.Scanner;

public class Array_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner scan = new Scanner(System.in);
        System.out.println("enter aray size:");
        int n = scan.nextInt();
        int [] a=new int[n];
        int val;
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
        {  val=scan.nextInt();
            a[i]=val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

	}

}
