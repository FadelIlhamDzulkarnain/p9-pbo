package Latihan1;

public class Kalender {
    // Atribut tanggal, bulan, dan tahun dengan akses private
    private int tanggal;
    private int bulan;
    private int tahun;

    // Constructor tanpa parameter yang menginisialisasi tanggal 1-1-2000
    public Kalender() {
        this.tanggal = 1;
        this.bulan = 1;
        this.tahun = 2000;
    }

    // Constructor dengan parameter tanggal saja
    public Kalender(int tanggal) {
        this.tanggal = tanggal;
        this.bulan = 1;
        this.tahun = 2000;
    }

    // Constructor dengan parameter bulan dan tahun saja
    public Kalender(int bulan, int tahun) {
        this.tanggal = 1;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    // Constructor dengan parameter lengkap (tanggal, bulan, dan tahun)
    public Kalender(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    // Getter dan setter untuk setiap atribut
    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Method untuk menampilkan informasi tanggal lengkap
    public void tampilkanTanggal() {
        System.out.println("Tanggal: " + this.tanggal + "-" + this.bulan + "-" + this.tahun);
    }
}
