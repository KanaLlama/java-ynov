import java.io.*;
import java.util.*;

class Exo5 {

    public static void main(String[] args) {

        try {
            //On crée un scanner
            Scanner scanner = new Scanner(System.in);
            // On demande quelle est la source
            System.out.println("Quelle est la source :");
            String nameFileS = scanner.next();
            // On demande la destination
            System.out.println("Quelle est la destination :");
            String nameFileT = scanner.next();
            // On récupère le fichier source et on crée la destination
            File source = new File(nameFileS);
            File dest   = new File(nameFileT);


            FileInputStream inputfst = null;
            FileOutputStream outputfst = null;

            try  {
              // C'est une fonction ou avec input on choisi un fichier que
              // l'on veut copier et avec un output la où on veut le copier

              inputfst = new FileInputStream(source);
              outputfst = new FileOutputStream(dest);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
            //Ici le buffer est crée pour le transfert de fichier
            byte[] buffer = new byte[1024];
            int length;
            // Tant que le fichier n'est pas entièrement tranféré le buffer ne s'arrête pas
            while ((length = inputfst.read(buffer)) > 0) {
                outputfst.write(buffer, 0, length);
            }


            scanner.close(); // je ferme mon scanner
            inputfst.close(); // je quitte le ficher source
            outputfst.close(); // je quitte le ficher destination

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
