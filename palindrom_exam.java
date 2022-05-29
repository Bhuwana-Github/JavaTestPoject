package practiseProgram;
import java.lang.*;
import java.util.Scanner;
public class palindrom_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b="";
		int i,length;
		System.out.println(" enter the word :");
		Scanner  sr= new Scanner(System.in);
		a=sr.nextLine();
		for(i=a.length()-1;i>=0;i--)
		{ b=b+a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
		
			System.out.println(" word is palindrom");
		
		else 
			System.out.println(" word is not palindrom");
	}
}
