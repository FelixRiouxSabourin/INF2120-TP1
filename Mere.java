import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class Mere {

        protected static String nomFichier;

        public Mere(String nomFichier){
            Mere.nomFichier = nomFichier;
        }

        public static String getNomFichier() {
            return nomFichier;
        }

        public static void setNomFichier(String nomFichier) {
            Mere.nomFichier = nomFichier;
        }


        public static int d(String nom) throws IOException {

            int d = 0;
            nom = getNomFichier();

            try {

                FileReader fileReader = new FileReader(nom);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                d = Integer.parseInt(bufferedReader.readLine());


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return d;
        }


        public ArrayList<Double> valeurDouble(String nomFichier) {

            ArrayList<Double> valeurDouble = new ArrayList<Double>();
            nomFichier = Mere.getNomFichier();

            try {

                Scanner fichier = new Scanner(new File(nomFichier));

                if (fichier.hasNextDouble()) {

                    valeurDouble.add(fichier.nextDouble());

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return valeurDouble;
        }

        public double h(ArrayList valeurDouble) {

            double h = 0;
            valeurDouble = valeurDouble(Mere.getNomFichier());

            h = (double) valeurDouble.get(0);

            return h;
        }

        public double x0(ArrayList valeurDouble) {
            double x0 = 0;
            valeurDouble = valeurDouble(Mere.getNomFichier());

            x0 = (double) valeurDouble.get(1);

            return x0;
        }

        public ArrayList valeursY(ArrayList valeurDouble){
            valeurDouble = valeurDouble(Mere.getNomFichier());
            valeurDouble.remove(0); //supprimer h
            valeurDouble.remove(0); //supprimer x0

            return valeurDouble;

        }

        public ArrayList xij(ArrayList valeursY){

            ArrayList xij = new ArrayList();
            valeursY=valeursY(valeurDouble(Mere.getNomFichier()));
            double max = (double) valeursY.get(valeursY.size()-1);
            double i=0;
            double j=0;
            while (i <= max){
                j= x0(valeurDouble(Mere.getNomFichier())) + i* h(valeurDouble(Mere.getNomFichier()));
                xij.add(j);
                i+=0.25;
            }

            return xij;
        }


    }

