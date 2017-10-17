import java.io.File;
import java.util.Scanner;

public class Exo1 {
    public static void main (String [] args){
      // Ici on crée le scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un path :");
        String path = scanner.nextLine();
        System.out.println("Vous avez saisi : " + path);

        //Ici on test si le chemin d'accés existe ou non
        // on crée un fichier et on test son existence
        // si il existe on print Dossier sinon Fichier

        File f = new File(path);
        if (f.exists()) {
            if (f.isDirectory()){
                System.out.println("Dossier");
            }else {
                System.out.println("Fichier");
            }
            // Si le fichier est présent il montrera alors ce message

        }
        else{
            System.out.println("N'existe pas");
            //Si en revanche le fichier n'est pas présent il montrera ce message
        }
    }
}
