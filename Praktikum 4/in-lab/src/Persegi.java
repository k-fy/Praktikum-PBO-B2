/* Nama File    : Persegi.java
 * Deskripsi    : File atribut dan method dalam class Persegi
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class Persegi extends BangunDatar{
    // Atribut untuk panjang sisi persegi
    private double sisi;
    public static int CounterPersegi;

    // Konstruktor default
    public Persegi(){
        setJmlSisi(4);
        CounterPersegi++;
    }

    //  Konstruktor dengan parameter untuk panjang sisi, warna, dan border
    public Persegi (double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
        CounterPersegi++;
    }

    // Getter dan Setter
    public double getSisi(){
        return sisi;
    }

    //  Setter untuk panjang sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    // Menghitung dan mengembalikan luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung dan mengembalikan keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menghitung dan mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return sisi *Math.sqrt(2);
    }

    // Override metode printInfo untuk menampilkan informasi persegi
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil method printInfo dari superclass
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
    
    // Method static untuk mencetak jumlah objek Persegi yang telah dibuat
    public static void printCounterPersegi() {
        System.out.println("Jumlah Objek Persegi: " + CounterPersegi);
    }
    

}
