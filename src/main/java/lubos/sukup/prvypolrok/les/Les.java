package lubos.sukup.prvypolrok.les;

import java.util.ArrayList;
import java.util.List;

public class Les {

    public static void main(String[] args) {

        Strom s1= new Strom(14,"listnaty","dub");
        Strom s2= new Strom();
        Strom s3= new Strom();
        Strom s4= new Strom();

        Krik k1 = new Krik();
        Krik k2 = new Krik();


        List<SpolocnyInterface> les = new ArrayList<>();
        les.add(s1);
        les.add(s2);
        les.add(s3);
        les.add(s4);
        les.add(k1);

        for (SpolocnyInterface le : les) {
            if (le instanceof Strom){
                System.out.println(((Strom) le).getTyp());
            }else if(le instanceof Krik){
                System.out.println( "Krik " + ((Krik) le).getVyskaKrika());
            }
        }
    }
}
