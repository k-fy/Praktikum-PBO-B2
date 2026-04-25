// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Kucing extends Anabul {
 
    public Kucing(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) berbunyi: Meong!");
    }
}