/*  Nama File   : Titik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik 
    Pembuat     : Puti Shasta Khafiyani - 24060124140132
    Tanggal     : 19/02/2026                                    */

public class MTitik {
    public static void main(String[] args){
    Titik T1 = new Titik();
    T1.setAbsis(3);
    T1.setOrdinat(5);
    T1.printTitik();
    T1.geser(2, 7);
    T1.printTitik();
    }
}
