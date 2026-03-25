/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk menunjukkan penggunaan asersi dalam Java
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 * 
 * 
 * JAWABAN
Penggunaan assert kurang tepat karena assert dipakai untuk memeriksa input jari-jari
Assert hanya digunakan untuk debugging, bukan untuk menangani error yang mungkin terjadi pada program.
Akibatnya, jika jari-jari yang dimasukkan adalah 0, maka program akan menghasilkan error 
dan tidak menghitung keliling lingkaran dengan benar.
*/

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}