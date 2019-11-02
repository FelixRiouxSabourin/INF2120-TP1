import java.util.ArrayList;

/*
CLASSE CUBIQUE
Cette classe est lancee lorsque le degree (d) est egal a 3.
 */

public class Cubique3 extends Mere {

    /*
    Va determiner les valeurs pour la methode cubique et les stocker dans des variables de classe.
    Inclut: y, yij, a, b, c, d, xi, xij
     */
    public void fillYij(double d) {
        //pour toutes les valeurs de y
        double deltai;
        double deltai1;
        double deltai2;
        double deltaiTrema;
        double deltai1Trema;
        double deltai2Trema;
        //creer yij
        this.yij = new ArrayList();

        for (int k = 0; k < this.yi.size() - d; k++) {
            //calculer xi
            deltai = this.yi.get(k + 1) - this.yi.get(k);
            deltai1 = this.yi.get(k + 2) - this.yi.get(k + 1);
            deltai2 = this.yi.get(k + 3) - this.yi.get(k + 2);
            deltaiTrema = deltai1 - deltai;
            deltai1Trema = deltai2 - deltai1;
            deltai2Trema = deltai1Trema - deltaiTrema;
            //calculer a
            this.a = deltai2Trema / (6 * this.h * this.h * this.h);

            //calculer b
            this.b = (deltaiTrema / (2 * this.h * this.h)) - (this.a * (3*(this.xi.get(k)
                    + h)));
            this.c = (deltai/h) - (this.b * (this.xi.get(k) + this.xi.get(k + 1)))
                    - (this.a * (this.xi.get(k)*this.xi.get(k) + this.xi.get(k)*this.xi.get(k+1)
                    + this.xi.get(k+1)*this.xi.get(k+1)));
            this.d = this.yi.get(k) - (this.c * this.xi.get(k)) - (this.b * this.xi.get(k) * this.xi.get(k))
                    - (this.a * this.xi.get(k) * this.xi.get(k) * this.xi.get(k));
            //calculer les yij
            //3 valeurs a calculer
            this.yij.add((this.a * this.xij.get((k * 3)) * this.xij.get((k * 3)) * this.xij.get((k * 3)))
                    + (this.b * this.xij.get((k * 3)) * this.xij.get((k * 3)))
                    + (this.c * this.xij.get((k * 3))) + this.d);
            this.yij.add((this.a * this.xij.get((k * 3) + 1) * this.xij.get((k * 3) + 1) * this.xij.get((k * 3) + 1))
                    + (this.b * this.xij.get((k * 3) + 1) * this.xij.get((k * 3) + 1))
                    + (this.c * this.xij.get((k * 3) + 1)) + this.d);
            this.yij.add((this.a * this.xij.get((k * 3) + 2) * this.xij.get((k * 3) + 2) * this.xij.get((k * 3) + 2))
                    + (this.b * this.xij.get((k * 3) + 2) * this.xij.get((k * 3) + 2))
                    + (this.c * this.xij.get((k * 3) + 2)) + this.d);
        }
    }

    //constructeur
    public Cubique3 (double h, double x0, ArrayList<Double> yi){
        super(h,x0,yi);
    }

}
