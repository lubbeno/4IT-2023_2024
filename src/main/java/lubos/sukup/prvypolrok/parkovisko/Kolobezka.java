package lubos.sukup.prvypolrok.parkovisko;

public class Kolobezka implements Priblizovadlo {

    private String nazov;
    private int vykonKolobezky;

    public Kolobezka() {
    }

    public Kolobezka(String nazov, int vykonKolobezky) {
        this.nazov = nazov;
        this.vykonKolobezky = vykonKolobezky;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getVykonKolobezky() {
        return vykonKolobezky;
    }

    public void setVykonKolobezky(int vykonKolobezky) {
        this.vykonKolobezky = vykonKolobezky;
    }
}
