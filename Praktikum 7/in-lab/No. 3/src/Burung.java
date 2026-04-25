// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Burung extends Anabul {
 
    public Burung(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) berbunyi: Cuit!");
    }
}