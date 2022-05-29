package practiseProgram;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/Type_B.txt";
		
	try{BufferedReader br= new BufferedReader( new FileReader(fileName));
		String Line;
		while ((Line=br.readLine())!=null)
		{
			System.out.println(Line);
		}
	  }catch(Exception e)
		{ System.out.println(e);}
	}	

}
