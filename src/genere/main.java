package genere;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Errhtpasswd = null;
		Boolean ErrHtml = null;
		String nomFichier = null;
		String NomAgent;
		File staff = new File("/Users/anisayoudj/Sites/staff.txt");
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
		File dir = new File("/Users/anisayoudj/Sites/FicheAgent");
		File[] liste = dir.listFiles();
		for(File item : liste) {
			nomFichier = item.getName().replace(".txt",".html");
		  
            // Créer un nouveau fichier
            // Vérifier s'il n'existe pas
            ErrHtml = generehtml.genhtml(nomFichier);
            System.out.println("Le fichier "+nomFichier+ " a bien été crée.");
            
        }
		//Genere index
		File index = new File("/Users/anisayoudj/Sites/index.html");
        if (index.createNewFile()) {
        	genereindex.genindex();
        }else {
            System.out.println("File already exists");
        }
        
		//genere staff

		}
	}

