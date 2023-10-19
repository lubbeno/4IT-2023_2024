package lubos.sukup.prvypolrok.les;

import java.util.Objects;

public class Strom implements SpolocnyInterface{

    private int vyska;
    private String typ;
    private String nazov;

    public Strom(){}

    public Strom(int vyska, String typ, String nazov) {
        this.vyska = vyska;
        this.typ = typ;
        this.nazov = nazov;
    }

    public int getVyska() {
        return vyska;
    }

    public String getTyp() {
        return typ;
    }

    public String getNazov() {
        return nazov;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Strom strom = (Strom) o;
        return vyska == strom.vyska && Objects.equals(typ, strom.typ) && Objects.equals(nazov, strom.nazov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vyska, typ, nazov);
    }

    @Override
    public String toString() {
        return "Strom{" +
                "vyska=" + vyska +
                ", typ='" + typ + '\'' +
                ", nazov='" + nazov + '\'' +
                '}';
    }
}
