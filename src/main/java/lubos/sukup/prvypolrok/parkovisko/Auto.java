package lubos.sukup.prvypolrok.parkovisko;

public class Auto  implements Priblizovadlo{

    private String nazov;
    private String typMotora;
    private int maxRychlost;

    public Auto() {
    }

    public Auto(String nazov, String typMotora, int maxRychlost) {
        this.nazov = nazov;
        this.typMotora = typMotora;
        this.maxRychlost = maxRychlost;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getTypMotora() {
        return typMotora;
    }

    public void setTypMotora(String typMotora) {
        this.typMotora = typMotora;
    }

    public int getMaxRychlost() {
        return maxRychlost;
    }

    public void setMaxRychlost(int maxRychlost) {
        this.maxRychlost = maxRychlost;
    }
}
