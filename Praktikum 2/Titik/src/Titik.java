/*  Nama File       : Titik.java
    Deskripsi       : berisi atribut dan method dalam class titik 
    Pembuat         : Puti Shasta Khafiyani - 24060124140132
    Tanggal         : 25/02/2026
*/

public class Titik {
    double absis;
    double ordinat;

    Titik(){
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }
    
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

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat > 0){
            return 3;
        }
        else if (absis > 0 && ordinat > 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis,2) + Math.pow(this.ordinat - T.ordinat,2));
    }

    void refleksiX(){
        ordinat = -ordinat;
    }

    
    void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX() {
        Titik hasil = new Titik();
        hasil.setAbsis(absis);
        hasil.setOrdinat(-ordinat);
        return hasil;
    }

    Titik getRefleksiY() {
        Titik hasil = new Titik();
        hasil.setAbsis(-absis);
        hasil.setOrdinat(ordinat);
        return hasil;
    }
}