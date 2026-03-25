/* Nama File    : AngkaSial.java
 * Deskripsi    : Program untuk menunjukkan penggunaan exception pada angka sial di Java
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 * 
 * JAWABAN
 1. Ketika eksepsi terjadi, apakah baris 12 dieksekusi?
   -> Tidak. Saat angka 13 diproses, terjadi exception sehingga program
   langsung pindah ke baris catch dan baris 12 tidak dijalankan.

2. Apakah baris 21 dieksekusi?
   -> Iya. Baris 21 itu ada di dalam catch sehingga tetap dijalankan
   saat exception terjadi. Jadi, meskipun terjadi exception, 
   pesan "hati-hati memasukkan angka!!!" tetap akan ditampilkan.
 */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}