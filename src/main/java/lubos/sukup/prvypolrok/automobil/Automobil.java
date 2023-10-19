package lubos.sukup.prvypolrok.automobil;

import java.util.Objects;

public class Automobil {

   private String znacka;
   private boolean jeNastartovane;
   private int aktualnaRychlos;

    public Automobil(String znacka) {
        this.znacka = znacka;
        this.jeNastartovane = false;
        this.aktualnaRychlos = 0;
    }

    public String getZnacka() {
        return znacka;
    }

    public boolean isJeNastartovane() {
        return jeNastartovane;
    }

    public void setJeNastartovane(boolean jeNastartovane) {
        this.jeNastartovane = jeNastartovane;
    }

    public int getAktualnaRychlos() {
        return aktualnaRychlos;
    }

    public void setAktualnaRychlos(int aktualnaRychlos) {
        this.aktualnaRychlos = aktualnaRychlos;
    }

  public void nastartovatAuto() {
        if(!jeNastartovane){
            jeNastartovane = true;
        }
    }

    public void pohybAuta(int rychlost){
        if(jeNastartovane){
            aktualnaRychlos = aktualnaRychlos + rychlost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return jeNastartovane == automobil.jeNastartovane && aktualnaRychlos == automobil.aktualnaRychlos && Objects.equals(znacka, automobil.znacka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(znacka, jeNastartovane, aktualnaRychlos);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "znacka='" + znacka + '\'' +
                ", jeNastartovane=" + jeNastartovane +
                ", aktualnaRychlos=" + aktualnaRychlos +
                '}';
    }
}
