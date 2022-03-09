package genere;
import java.io.*;
public class generehtml {
	public static boolean genhtml(String login) throws IOException {
		String fileName = "/Users/pierre-richardpascal/eclipse-workspace/genere/src/" + login;
	    String encoding = "UTF-8";
		FileReader ficheagent = new FileReader("/Users/pierre-richardpascal/eclipse-workspace/genere/src/FicheAgent/" + login.replace(".html", ".txt"));
        BufferedReader bufferagent = new BufferedReader(ficheagent);
        String lineAgent;
        String nom = null;
        String prenom = null;
        String poste = null;
        int i;
        String equipement = "<p>";
        int CptLigne = 0;
        
        
        for (i = 1; i < 15; i++) {
            // Si le numéro de la ligne = 4 récupérer la ligne car c'est la qu'on obtient le mdp
        	lineAgent = bufferagent.readLine();
        	if (lineAgent != null) {
        		CptLigne ++;
        	}
            if (i == 1){
                nom = lineAgent;
            }
            if (i == 2){
                prenom = lineAgent;
            }
            if (i == 3){
                poste = lineAgent;
            }
            if (i>4) {
            	if(i <= CptLigne) {
            		if(lineAgent != null) {
            			System.out.println(lineAgent);
            			equipement = equipement +"</p><p>"+ lineAgent;
            			
            		}
            		
            	}
            }
            
          }
	    try{
	    	
	    
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
		writer.println("	</head>");
		writer.println("	<body>");
		writer.println("		<article>");
		writer.println("		<div class='container'> ");
		writer.println("			<h1>"+nom +" "+ prenom+"</h1>");
		writer.println("			<img class='image'src = 'photoAgent/"+login.replace(".html", ".jpg")+"' height = '200'>");
		writer.println("		</div> ");
		writer.println("		</article>");
		writer.println("		<p>Vous occuperez le poste de : "+ poste +" </p>");
		writer.println("		<p>Vos équipement seront les suivants :</p>");
		writer.println("		<nav>");
		writer.println("		<div id = 'checkbox'>");
		writer.println("			<ul>");
		writer.println("				" + equipement);
		writer.println("			</ul>");
		writer.println("		</div>");
		writer.println("		</nav>");
		
		writer.println("	</body>");
		writer.println("</html>");
	    writer.close();
	    }
	    catch (IOException e){
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		return true;
	}
}
