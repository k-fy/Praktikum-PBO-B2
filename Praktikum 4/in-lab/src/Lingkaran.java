/* Nama File    : Lingkaran.java
 * Deskripsi    : File atribut dan method dalam class Lingkaran
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class Lingkaran extends BangunDatar{
    // Atribut untuk jari-jari lingkaran
    private double jari;

    // Konstruktor default
    public Lingkaran(){
        setJmlSisi(1);
    }

    // Konstruktor dengan parameter untuk diameter, warna, dan border
    public Lingkaran (double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter/2;
    }

    // Getter dan Setter
    public double getJari (){
        return jari; 
    }

    // Setter untuk jari-jari
    public void setJari(double jari){
        this.jari = jari;
    }

    // Metode untuk menghitung luas dan keliling lingkaran
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // Metode untuk menghitung keliling lingkaran
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // Override metode printInfo untuk menampilkan informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
