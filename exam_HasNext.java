package practiseProgram;
import java.util.Scanner;
public class exam_HasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" Enter string :");
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		String line;
		while (keyboard.hasNextLine()) {
		    line = keyboard.nextLine();
		    if (line.isEmpty()) {
		        break;
		    }
		    input += line + "\n";
		}
		System.out.println(input);
		}
				
	}


