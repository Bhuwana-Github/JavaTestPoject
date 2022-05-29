package practiseProgram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		    // create a writer
		    BufferedWriter bw = Files.newBufferedWriter(Paths.get("output.txt"));
   // BufferedWriter bw1 = Files.newBufferedWriter(Paths.get("output.txt"));
    // write text to file
		    bw.write("Hey, there!");
		    bw.newLine();
		    bw.write("What's up?");

		    // close the writer
		    bw.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
	}
	}

}
