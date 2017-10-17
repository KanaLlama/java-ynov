import java.io.File;
import java.util.Scanner;

public class Exo2 {
    public static void main (String [] args){
        //On crée le scanner et on récupère l'user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un path :");
        String path = scanner.nextLine();
        System.out.println("Vous avez saisi : " + path);
        //On recupere la liste des fichiers pour en faire un tableau utilisable
        File listDir = new File(path);
        File[] filesList = listDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println("dir  : " + f.getName());
            if(f.isFile()){
                System.out.println("file : " + f.getName());
                //En fonction de sa nature (directory/file) on a un message différent

            }
        }




    }
}
