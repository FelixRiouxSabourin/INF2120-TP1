import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;


/*

CLASSE PRINCIPALE
Le programme commence ici. Elle contient le main.
IMPORTANT : Il faut que le fichier se trouve dans le dossier "src" afin que le
    path fonctionne.
 */

public class gitPrincipal {

    /*
    Lance le programme.
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println("Entrez le nom d'un fichier : ");

            String curDir = System.getProperty("user.dir");
            Scanner sc = new Scanner(System.in);

            Scanner scanner = new Scanner(new File(curDir + "\\" + sc.nextLine()));

            int d = scanner.nextInt();
            double h = scanner.nextDouble();
            double x0 = scanner.nextDouble();
            Mere echantillonnage = null;
            //lire yi
            ArrayList<Double> yi = null;
            yi = new ArrayList<>();

            while (scanner.hasNextDouble()) {
                yi.add(scanner.nextDouble());
            }
            //tester yi
            if (yi == null || yi.size() < d) {
                System.err.println("***ERREUR: La valeur de yi est incorrecte. Fin du programme.");
                System.exit(1);
            }
            //selon d, initializer la classe correspondante
            if (d == 1) {
                echantillonnage = new Lineaire1(h, x0, yi);
                calculer(echantillonnage, d);
            } else if (d == 2) {
                echantillonnage = new Quadratique2(h, x0, yi);
                calculer(echantillonnage, d);
            } else if (d == 3) {
                echantillonnage = new Cubique3(h, x0, yi);
                calculer(echantillonnage, d);
            } else {
                System.err.println("***ERREUR: La valeur de d est incorrecte. Fin du programme.");
                System.exit(1);
            }
        }catch (Exception e ){
            System.out.println("le fichier entre n est pas valide");
        }
    }


    // Calcule les resultats de l'echantillonage
    public static void calculer(Mere echantillonnage, double d){

        //calculer les x
        echantillonnage.fillXij();
        //fill yij
        echantillonnage.fillYij(d);

        int i = 0;
        for (int j = 0; j < echantillonnage.getYij().size() && i <
                echantillonnage.getYi().size(); i++ , j = j + 3){

            System.out.println(echantillonnage.getYi().get(i));
            System.out.println(echantillonnage.getYij().get(j));
            System.out.println(echantillonnage.getYij().get(j+1));
            System.out.println(echantillonnage.getYij().get(j+2));
        }

        System.out.println(echantillonnage.getYi().get(i));
    }

}