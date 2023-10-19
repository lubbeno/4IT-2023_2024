package lubos.sukup.prvypolrok.automobil;

import java.util.*;

public class Opakovanie {

    // main metoda sem
    // vytvorte si novu triedu s nazvom Automobil. ma parametre znacka,
    // jeNastartovane, aktualnaRychlost, vytvorite gettre settre
    // metody nastartovatAuto, pohybAuta(int )

  //  Vytvorte list do ktoreho vlozite 4 objekty automobil.

 //   vypocitate priemernu rychlost.

    public static void main(String[] args) {

        Automobil a1 = new Automobil("Skoda");
        Automobil a2 = new Automobil("VW");
        Automobil a3 = new Automobil("VW");

        LinkedList ls = new LinkedList();




        List<Automobil> automobilList = new LinkedList<>();


        automobilList.addAll(Arrays.asList(a1,a2,a3));
        int sucetRychlosti=0;
        for (Automobil automobil : automobilList) {
            automobil.nastartovatAuto();
            automobil.pohybAuta(37);
            sucetRychlosti += automobil.getAktualnaRychlos();
        }

        double priemenaRychlost = (double)sucetRychlosti / automobilList.size();
        System.out.println("priemerna rychlost aut v listu je "  + priemenaRychlost);


        System.out.println("list: " + automobilList);


        Set<Automobil> sets = new HashSet<>();
        sets.addAll(Arrays.asList(a1,a2,a3));
        System.out.println(sets.size());
        System.out.println(sets.toString());

        Map<String,String> mapa = new HashMap<>();
        mapa.put("jedna", "Lubos");





    }
}
