package genere;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class generestaff {
	public static void genstaff(String login) throws FileNotFoundException, UnsupportedEncodingException{
		String fileName = "/Users/pierre-richardpascal/eclipse-workspace/genere/src/staff.txt";
		String encoding = "UTF-8";
	    try (PrintWriter writer = new PrintWriter(fileName, encoding)) {
			writer.println(login +"ok");
			System.out.println(login);
		    writer.close();
		}
	}
}
