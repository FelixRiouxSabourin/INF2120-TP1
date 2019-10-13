import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Mere {

    protected static String nomFichier;

    public Mere(String nomFichier){
        Mere.nomFichier = nomFichier;
    }

    // Cherche la variable de classe nomFichier
    // Elle est public et static afin de pouvoir utiliser le le nom du fichier a
    // partir de n'importe ou.
    public static String getNomFichier() {
        return nomFichier;
    }

    // Definit la variable de classe nomFichier
    // Elle est public et static afin de pouvoir definir le le nom du fichier a
    // partir de n'importe ou.
    public static void setNomFichier(String nomFichier) {
        Mere.nomFichier = nomFichier;
    }

    // Prend en argument le nom du fichier et retourne d.
    // On utilise FileReader et BufferedReader pour ecrire dans la variable d
    // la premiere ligne du fichier texte specifie par l'utilisateur du programme.
    public static int d(String nomFichier) throws IOException {

        int d = 0;
        nomFichier = getNomFichier();

        try {

            FileReader fileReader = new FileReader(nomFichier);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            d = Integer.parseInt(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return d;
    }

    // Prend en arguemnt nomFichier et retourne le ArrayList valeurDouble
    // valeurDouble est un ArrayList qui contient tous les doubles contenus
    // dans le fichie specifie par l'utilisateur du programme.
    public static ArrayList<Double> valeurDouble(String nomFichier) {

        ArrayList<Double> valeurDouble = new ArrayList<>();
        nomFichier = Mere.getNomFichier();


        try {

            Scanner fichier = new Scanner(new File(nomFichier));
            int i = 0;
            while (fichier.hasNext()) {

                valeurDouble.add(i, Double.parseDouble(fichier.nextLine()));
                i++;

            }

            valeurDouble.remove(0);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return valeurDouble;
    }

    // Prend en arguemnt l'ArrayList valeurDouble et retourne h
    // h est le premier double de notre ArrayList valeurDouble.
    public static double h(ArrayList valeurDouble) {

        double h = 0;
        valeurDouble = valeurDouble(Mere.getNomFichier());

        h = (double) valeurDouble.get(0);

        return h;
    }

    // Prend l'ArrayList valeurDouble et retourne x0
    // x0 est le deuxieme double de notre ArrayList valeurDouble.
    public static double x0(ArrayList<Double> valeurDouble) {
        double x0;
        valeurDouble = valeurDouble(Mere.getNomFichier());

        x0 = valeurDouble.get(1);

        return x0;
    }

    // Prend l'ArrayList valeur double et retourne l'ArrayList valeursY
    // Les deux premieres valeurs de l'ArrayList valeurDouble sont supprimees
    // puis le reste est stocke dans la nouvelle ArrayList valeursY
    public static ArrayList<Double> valeursY(ArrayList valeurDouble){

        ArrayList <Double> valeursY;
        valeurDouble = valeurDouble(Mere.getNomFichier());

        valeurDouble.remove(0); //supprimer h
        valeurDouble.remove(0); //supprimer x0

        valeursY = valeurDouble;

        return valeursY;

    }

    // Prend l'ArrayList valeursY et retourne l'ArrayList xij
    // La variable max correspond a la derniere valeur de l'ArrayList valeursY
    // remplit le ArrayList avec trois valeurs de x entre chaque x
    public static ArrayList<Double> xij(ArrayList <Double> valeursY){

        valeursY = valeursY(valeurDouble(Mere.getNomFichier()));

        ArrayList<Double> xij;
        xij = new ArrayList<>();

        double max = valeursY.get(valeursY.size()-1);
        double i=0;
        double j;

        while (i <= max){
            j= x0(valeurDouble(Mere.getNomFichier())) + i*h(valeurDouble(Mere.getNomFichier()));
            xij.add(j);
            i+=0.25;
        }

        if ( xij.get(xij.size()-1) > valeursY.get(valeursY.size()-1) ) {

            xij.remove(xij.size() - 1);
        }

        return xij;

    }

    public static int factoriel (int d) throws IOException {
        int factoriel = 1;
        d = d(Mere.getNomFichier());

        for (int i = 2; i <= d; i++){
            factoriel = factoriel * i;
        }

        return factoriel;
    }

    // Calcule le delta a partir de l'ArrayList valeursY
    public static ArrayList<Double> deltayi (ArrayList <Double> valeursY) throws IOException {

        valeursY = valeursY(valeurDouble(Mere.getNomFichier()));
        ArrayList<Double> deltayi = new ArrayList<>();
        int i = 0;
        double j;

        while ( i < valeursY.size()-1) {
            j = valeursY.get(i+1) - valeursY.get(i);
            deltayi.add(j);
            i++;
        }

        return deltayi;

    }

}

