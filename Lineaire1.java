import java.util.ArrayList;

/*
CLASSE LINEAIRE
Cette classe est lancee lorsque le degree (d) est egal a 1.
 */

public class Lineaire1 extends Mere {


    //constructeur
    public Lineaire1 (double h, double x0, ArrayList<Double> yi){
        super(h,x0,yi);
    }
    public Lineaire1 (){
        super();
    }

    /*
    Va determiner les valeurs pour la methode lineaire et les stocker dans les variables de classe.
    Inclut: a, b, yij, xi.
     */
    public void fillYij(double d) {
        //pour toutes les valeurs de y
        double deltai;
        //creer yij
        this.yij = new ArrayList();

        for (int k = 0; k < this.yi.size() - d; k++) {
            //calculer xi
            deltai = this.yi.get(k + 1) - this.yi.get(k);
            //calculer a
            this.a = deltai / this.h;
            //calculer b
            this.b = this.yi.get(k) - (this.a * this.xi.get(k));
            //calculer les yij
            //3 valeurs a calculer
            this.yij.add((this.a * this.xij.get(k * 3)) + this.b);
            this.yij.add((this.a * this.xij.get((k * 3) + 1)) + this.b);
            this.yij.add((this.a * this.xij.get((k * 3) + 2)) + this.b);
        }
    }
}
