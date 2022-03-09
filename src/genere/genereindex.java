package genere;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class genereindex {
	public static void genindex() throws FileNotFoundException, UnsupportedEncodingException {
		String fileName = "/Users/pierre-richardpascal/eclipse-workspace/genere/src/index.html";
		String encoding = "UTF-8";
	    PrintWriter writer = new PrintWriter(fileName, encoding);
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("	<head>");
		writer.println("		<title>Profil</title>");
		writer.println("		<link rel = 'stylesheet' type = 'text/css' href = 'style.css'/>");
		writer.println("		<style>");
		writer.println("			img {width: 200px;height: 200px;}");
		writer.println("			.container {display: flex;flex-wrap: nowrap;justify-content: space-between;}");
		writer.println("			nav {list-style: none;color: #000000;margin: 0 auto;width: 500px;}");
		writer.println("			header {text-align: center;color: #659224;}");
		writer.println("			.titre {color: #379ec1;}");
		writer.println("			#checkboxes ul {margin: 0;list-style: none;vertical-align: center;}");
		writer.println("		</style>");
		writer.println("	<body>");
		writer.println("		<img src = 'gosecuri.png' style='text-align:center'>");
		File dir = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/FicheAgent");
		File[] liste = dir.listFiles();
		for(File item : liste) {
			writer.println("		<a href = '"+ item.getName().replace(".txt",".html") +"'>"+item.getName().replace(".txt", "")+"</a>");
		}
		writer.println("	</body>");
		writer.println("</html>");
	    writer.close();
	}
}
