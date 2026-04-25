// NIM  : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Dosen extends CivitasAkademika {
    private String nip;
 
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }
 
    public String getNip() { 
        return nip; 
    }
 
    @Override
    public String getNomor() { 
        return nip; 
    }
}