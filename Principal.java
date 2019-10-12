import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        System.out.println("Entrez le nom d'un fichier : ");

        Scanner sc = new Scanner(System.in);

        Mere.setNomFichier("src\\" + sc.nextLine());

        ArrayList<Double> resultat = new ArrayList<>();

        switch (Mere.d(Mere.getNomFichier())){
            case 1:
                resultat = Lineaire1.resultat();
                break;
            case 2:
                resultat = Quadratique2.resultat();
                break;
            case 3:
                resultat = Cubique3.resultat();
                break;
        }

        // System.out.println(Mere.factoriel(Mere.d(Mere.getNomFichier())));

        /*
        for (Double aDouble : resultat) {
            System.out.println(aDouble);
        }

         */

         System.out.println(Mere.d(Mere.getNomFichier()));


    }

}
