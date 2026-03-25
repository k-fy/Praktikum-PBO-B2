/* Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan penggunaan asersi dalam Java
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0){
            System.out.println("x bilang positif");
        }
        else{
            assert (x > 0) : "ada kesalahan";
            System.out.println("x bilang negatif");

        }
    }
}