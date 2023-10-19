package lubos.sukup.prvypolrok.parkovisko;

import java.util.ArrayList;
import java.util.List;

public class Parkovisko {

    public static void main(String[] args) {

        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto();

        Kolobezka k1 = new Kolobezka();
        Kolobezka k2 = new Kolobezka();
        Kolobezka k3 = new Kolobezka();



        List<Priblizovadlo> parkovisko = new ArrayList<>();
        parkovisko.add(a1);
        parkovisko.add(a2);
        parkovisko.add(a3);
        parkovisko.add(k1);
        parkovisko.add(k2);
        parkovisko.add(k3);


    }
}
