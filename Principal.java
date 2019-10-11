import java.io.FileNotFoundException;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        Mere echantillon =  new Mere();

        System.out.println(echantillon.d(echantillon.nomFichier()));

    }


}
