import java.io.File;
import java.util.Scanner;

public class Exo3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        //On récupère l'entrée de l'user
        System.out.println("Saisissez un path :");
        String path = scanner.nextLine();
        System.out.println("Vous avez saisi : " + path);
        //On liste les fichiers pour ensuite récupérer leurs infos ainsi que les listes
        File listDir = new File(path);
        File[] filesList = listDir.listFiles();
        for(File f : filesList){

            if(f.isFile() && f.getName().substring(f.getName().lastIndexOf('.')).equals(".jpg")){
                System.out.println(f.getName());
                //Ici on récupérer les fichiers et leurs extentions et on compare avec celle de l'user
            }
        }

    }
}
