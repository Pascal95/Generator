package genere;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Errhtpasswd = null;
		Boolean ErrHtml = null;
		String nomFichier = null;
		String NomAgent;
		File staff = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/staff.txt");
		if (staff.createNewFile()) {
			System.out.println("Le staff.txt est crée");
        }else {
            System.out.println("File already exists");
        }
		//Genere le htpasswd
		Errhtpasswd = genehtpasswd.generehtpasswdstaff();
		if (!Errhtpasswd.equals("ok") ) {
			System.out.println(Errhtpasswd);			
		}
		
		// Genere les fiches agent
		File dir = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/FicheAgent");
		File[] liste = dir.listFiles();
		for(File item : liste) {
			nomFichier = item.getName().replace(".txt",".html");
			File f = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/"+ nomFichier);			  
            // Créer un nouveau fichier
            // Vérifier s'il n'existe pas

            if (f.createNewFile()) {
           
            	
            	System.out.println("Le fichier "+nomFichier+ " a bien été crée.");
            }
            else {
            	System.out.println("File already exists");            	
            }
            ErrHtml = generehtml.genhtml(nomFichier);
            
        }
		//Genere index
		File index = new File("/Users/pierre-richardpascal/eclipse-workspace/genere/src/index.html");
        if (index.createNewFile()) {
        	genereindex.genindex();
        }else {
            System.out.println("File already exists");
        }
        
		//genere staff

		}
	}

