// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal : 06/05/26

public abstract class Anabul {
    protected String panggilan;
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public String toString() {
        return panggilan + " (" + this.getClass().getSimpleName() + ", " + bobot + " kg)";
    }
}