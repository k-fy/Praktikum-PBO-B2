// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Anjing extends Anabul {
 
    public Anjing(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) berbunyi: Guk-Guk!");
    }
}