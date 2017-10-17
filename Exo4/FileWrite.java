import java.io.*;
import java.util.Scanner;

class FileWrite {

    public static void main(String[] args) {
        try {
            String file = "./userStrings.txt";
            //On crée le scanner
            Scanner scan = new Scanner(System.in);
            //Ici on crée le fichier où l'on va écrire
            FileWriter fw = new FileWriter(file);
            //Tant que l'user ne marquera pas "quit" seul sur une ligne le programme ne quitte pas
            while(true){
                String input = scan.nextLine();
                if("quit".equalsIgnoreCase(input.trim())){
                    break;
                }
                //Et lorsque que quit sera écrit le programme se stopera
             fw.write(input + "\n"); //On retourne à la ligne

            }
            scan.close();
            fw.close();// le fichier est fermé
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
