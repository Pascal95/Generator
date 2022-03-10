package genere;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class genehtpasswd {
	public static String generehtpasswdstaff () {
		String msgErr = null;
        String fileName = "/Users/anisayoudj/Desktop/pr/.htpasswd";
        String encoding = "UTF-8";
        String filestaff = "/Users/anisayoudj/Sites/staff.txt";
        File repertoire = new File("/Users/anisayoudj/Sites/FicheAgent");
        String liste[] = repertoire.list(); 
        int i;
        String line = new String();

        try{
        PrintWriter writer = new PrintWriter(fileName, encoding);
        PrintWriter staff = new PrintWriter(filestaff, encoding);
        if (liste != null) {         
            for (int iFichier = 0; iFichier < liste.length; iFichier++) {
                //On recupere le nom des fichiers
                FileReader file = new FileReader("/Users/anisayoudj/Sites/FicheAgent/" + liste[iFichier]);
                BufferedReader buffer = new BufferedReader(file);
                String nomStaff = liste[iFichier].replace(".txt","");
                for (i = 1; i < 10; i++) {
                    // Si le numéro de la ligne = 4 récupérer la ligne car c'est la qu'on obtient le mdp
                    if (i == 4){
                        line = buffer.readLine();
                    }
                    else{
                        buffer.readLine();
                    }
                  }
                //on ecrit dans le fichier le login et password dans htpasswd
                writer.println(liste[iFichier].replace(".txt","")+ ":" + line);
            }
            staff.close();
            writer.close();
            return msgErr = "ok";
        } else {
        	msgErr = "Nom de repertoire invalide";
        	return msgErr;
        }

        }
        catch (IOException e){
          msgErr = "An error occurred.";
          e.printStackTrace();
          return msgErr;
        }
	}
}
