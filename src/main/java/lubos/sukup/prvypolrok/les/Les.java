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
        les.add(k2);
        les.add(s4);
        les.add(k1);

        for (SpolocnyInterface le : les) {
            SpolocnyInterface zListu = le;
            if( zListu instanceof Strom) {
                Strom stromZListu = (Strom) zListu;
                System.out.println(stromZListu.getTyp());
            }
           else{
               Krik krikZlistu = (Krik) zListu;
                System.out.println("vyska kriku " + krikZlistu.getVyskaKrika());
                }
        }










    }
}
