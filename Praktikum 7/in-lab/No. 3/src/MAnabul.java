public class MAnabul {
 
    public static void main(String[] args) {

        Anabul[] daftarAnabul = {
            new Kucing("Mimi"),
            new Anjing("Rex"),
            new Burung("Tweety"),
            new Kucing("Kitty"),
            new Anjing("Doggo")
        };
 
        System.out.println(" ===    SIMULASI BUNYI & GERAKAN ANABUL    === ");
 
        for (Anabul a : daftarAnabul) {
            System.out.println("----------------------------------------");
            a.bersuara();
            a.gerak();
        }
 
        System.out.println("========================================");
    }
}