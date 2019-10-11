import java.util.ArrayList;

public class Lineaire1 extends Mere {

    public ArrayList delta(){
        ArrayList delta = new ArrayList();
        for (int i=0;i>valeursY().size();i++){
            double valeur = (double) valeursY().get(i+1);
            valeur -= (double) valeursY().get(i);
            delta.add(valeur);
        }
        return delta;
    }

    public ArrayList a (ArrayList delta){
        delta = delta();
        ArrayList a =new ArrayList();
        for (int i =0; i>delta.size();i++){
            double valeur = (double)delta.get(i)/h();
            a.add(valeur);
        }
        return a;
    }

    public ArrayList b (ArrayList a){
        a = a(delta());
        ArrayList b = new ArrayList();
        for (int i =0 ;i>valeursY().size();i++){
            double partie1 = (double)valeursY().get(i);
            int j =0;
            double partie2 = 0;
            while (j <=a.size()){
            partie2 = h()*x0()*i*((double)a.get(j));
            j++;
            }
            b.add(partie1-partie2);
        }
        return b;
    }

}
