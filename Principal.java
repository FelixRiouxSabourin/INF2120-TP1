import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        Mere echantillon =  new Mere();

        System.out.println(echantillon.d(echantillon.nomFichier()));

    }


}
