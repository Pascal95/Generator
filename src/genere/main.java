package genere;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Errhtpasswd = null;
		Boolean ErrHtml = null;
		String nomFichier = null;
		//Genere le htpasswd
		Errhtpasswd = genehtpasswd.generehtpasswd();
		if (!Errhtpasswd.equals("ok") ) {
			System.out.println(Errhtpasswd);			
		}
		
		// Genere le html
		File dir = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/FicheAgent");
		File[] liste = dir.listFiles();
		for(File item : liste) {
			nomFichier = item.getName().replace(".txt",".html");
			File f = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/"+ nomFichier);			  
            // Créer un nouveau fichier
            // Vérifier s'il n'existe pas
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
            ErrHtml = generehtml.genhtml(nomFichier);
            
        }
			
		}
	}

