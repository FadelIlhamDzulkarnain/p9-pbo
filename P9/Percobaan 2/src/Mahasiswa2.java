package Percobaan2;

public class Mahasiswa2 {
    private int nrp;
    private String nama;

    public Mahasiswa2() {
        this.nrp = 532630051;
        this.nama = "Ilham";
    }

    public Mahasiswa2(String nama) {
        this.nrp = 532630061;
        this.nama = nama;
    }

    public Mahasiswa2(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Getter untuk NRP
    public int getNrp() {
        return nrp;
    }

    // Setter untuk NRP
    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Setter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("NRP: " + nrp);
        System.out.println("Nama: " + nama);
    }
}
