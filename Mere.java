import java.util.ArrayList;

/*
CLASSE MERE
    Cette classe contient toutes les variables de classe heritees
        par les classes Lineaire, Quadratique et Cubique.
    Elle contient les constructeurs, getters et setters.
 */

public class Mere {
    protected double x0;
    protected double h;
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected ArrayList<Double> xij;
    protected ArrayList<Double> xi;
    protected ArrayList<Double> yij;
    protected ArrayList<Double> yi;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    public ArrayList<Double> getYi() {
        return yi;
    }

    public void setYi(ArrayList<Double> yi) {
        this.yi = yi;
    }

    public ArrayList<Double> getYij() {
        return yij;
    }

    public void setYij(ArrayList<Double> yij) {
        this.yij = yij;
    }

    public ArrayList<Double> getXi() {
        return xi;
    }

    public void setXi(ArrayList<Double> xi) {
        this.xi = xi;
    }

    public ArrayList<Double> getXij() {
        return xij;
    }

    public void setXij(ArrayList<Double> xij) {
        this.xij = xij;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


    /*
     Prend l'ArrayList valeursY et retourne l'ArrayList xij
     remplit le ArrayList avec trois valeurs de x entre chaque x
     */
    public void fillXij() {
        this.xij = new ArrayList();
        this.xi = new ArrayList();

        double xtemp = this.x0;
        for (int k = 0; k < this.yi.size() - 1; k++) {
            //claculer xi
            xtemp = xtemp + (k * this.h);
            //add xi
            this.xi.add(xtemp);
            //add les autre calcules
            this.xij.add(xtemp + (0.25 * h));
            this.xij.add(xtemp + (0.5 * h));
            this.xij.add(xtemp + (0.75 * h));
        }
    }


    public void fillYij(double d) {

    }

    public void calculer(double d){

        //calculer les x
        this.fillXij();
        //Remplir yij
        this.fillYij(d);

    }

    //constructeur
    public Mere (double h, double x0, ArrayList<Double> yi){
        this.setH(h);
        this.setX0(x0);
        this.setYi(yi);
    }
    public Mere (){
    }


}

