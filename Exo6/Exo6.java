import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.*;


public class Exo6 {
    public static void main (String [] args){
      try {
        // on récupére l'url qui fini en jpg
        URL url = new URL("http://cdn.playbuzz.com/cdn/f66c0537-4323-4544-8c4b-43b1f9efe9b2/894a1671-e7fb-4e37-a750-0cd6834c6dee.jpg");
        BufferedImage img = ImageIO.read(url);// On récupère les données et stockage dans un buffer
        File file = new File("./downloaded.jpg");// On crée le fichier de destination
        //On lui dit dans quel fichier il doit télécharger l'image et il télécharge l'image
        ImageIO.write(img, "png", file);//On écrit dans le fichier le buffer récupéré
      }catch (Exception e) {
        e.printStackTrace();
      }
    }
}
