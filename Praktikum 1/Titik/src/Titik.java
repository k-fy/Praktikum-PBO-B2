/*  Nama File   : Titik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik 
    Pembuat     : Puti Shasta Khafiyani - 24060124140132
    Tanggal     : 19/02/2026                                    */

public class Titik {
    /*          ATRIBUT          */
    double absis;
    double ordinat;

    /*          METHOD           */
    /* KONSTRUKTOR untuk membuat titik (0,0) */
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    /* FUNCTION mengembalikan nilai absis */
    double getAbsis(){
        return absis;
    }

    /* FUNCTION mengembalikan nilai ordinat */
    double getOrdinat(){
        return ordinat;
    }

    /* PROCEDURE mengeset absis titik dengan nilai baru x */
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}