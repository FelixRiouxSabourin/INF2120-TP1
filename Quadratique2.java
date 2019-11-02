import java.util.ArrayList;

/*
CLASSE QUADRATIQUE
Cette classe est lancee lorsque le degree (d) est egal a 2.
 */

public class Quadratique2 extends Mere {

    /*
    Va determiner les valeurs pour la methode quadratique et stocker dans variables de classe
    Inclut : y, a, b, c, xi, yij
     */
    public void fillYij(double d) {
        //pour toutes les valeurs de y
        double deltai;
        double deltai1;
        double deltaiTrema;
        //creer yij
        this.yij = new ArrayList();

        for (int k = 0; k < this.yi.size() - d; k++) {
            //calculer xi
            deltai = this.yi.get(k + 1) - this.yi.get(k);
            deltai1 = this.yi.get(k + 2) - this.yi.get(k + 1);
            deltaiTrema = deltai1 - deltai;
            //calculer a
            this.a = deltaiTrema / (2 * this.h * this.h);
            //calculer b
            this.b = (deltai / this.h) - (this.a * (this.xi.get(k) + this.xi.get(k + 1)));
            this.c = this.yi.get(k) - (this.b * this.xi.get(k)) - (this.a * this.xi.get(k) * this.xi.get(k));
            //calculer les yij
            //3 valeurs a calculer
            this.yij.add((this.a * this.xij.get(k * 3) * this.xij.get(k * 3)) + (this.b * this.xij.get(k * 3)) + this.c);
            this.yij.add((this.a * this.xij.get((k * 3) + 1) * this.xij.get((k * 3) + 1)) + (this.b * this.xij.get((k * 3) + 1)) + this.c);
            this.yij.add((this.a * this.xij.get((k * 3) + 2) * this.xij.get((k * 3) + 2)) + (this.b * this.xij.get((k * 3) + 2)) + this.c);
        }
    }

    //constructeur
    public Quadratique2 (double h, double x0, ArrayList<Double> yi){
        super(h,x0,yi);
    }
    public Quadratique2 (){
        super();
    }
}
