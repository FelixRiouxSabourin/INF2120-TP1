    import java.io.*;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Mere {

        public String nomFichier() {

            System.out.println("Entrez le nom d'un fichier : ");

            Scanner sc = new Scanner(System.in);

            return "src\\" + sc.nextLine();

        }

        public int d(String nom) throws IOException {

            int d = 0;
            nom = nomFichier();


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
            nomFichier = nomFichier();

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

        public double h() {
            ArrayList valeurDouble = new ArrayList();
            double h = 0;
            valeurDouble = valeurDouble(nomFichier());

            h = (double) valeurDouble.get(0);

            return h;
        }

        public double x0() {
            ArrayList valeurDouble = new ArrayList();
            double x0 = 0;
            valeurDouble = valeurDouble(nomFichier());

            x0 = (double) valeurDouble.get(1);


            return x0;

        }
        public ArrayList valeursY(){
            ArrayList valeurDouble = new ArrayList();
            valeurDouble = valeurDouble(nomFichier());
            valeurDouble.remove(0); //supprimer h
            valeurDouble.remove(0); //supprimer x0

            return valeurDouble;

        }
        public ArrayList xij(ArrayList valeursY){

            ArrayList xij = new ArrayList();
            valeursY=valeursY();
            double max = (double) valeursY.get(valeursY.size()-1);
            double i=0;
            double j=0;
            while (i <= max){
                j= x0() + i* h();
                xij.add(j);
                i+=0.25;
            }

            return xij;
        }

    }

