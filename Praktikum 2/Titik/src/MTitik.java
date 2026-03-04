/*  Nama File       : Titik.java
    Deskripsi       : berisi atribut dan method dalam class titik 
    Pembuat         : Puti Shasta Khafiyani - 24060124140132
    Tanggal         : 25/02/2026
*/

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.geser(3,4);
        T1.printTitik();
        System.out.println("Kuadran Titik ada pada: " + T1.getKuadran());
        System.out.println("Jarak Titik dari pusat: " + T1.getJarakPusat());

        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(4);
        System.out.println("Jarak Titik adalah : " + T1.getJarak(T2));

        T1.refleksiX();
        T1.printTitik();

        T1.refleksiY();
        T1.printTitik();

        Titik A = T2.getRefleksiX();
        A.printTitik();

        Titik B = T2.getRefleksiY();
        B.printTitik();


    }
}

