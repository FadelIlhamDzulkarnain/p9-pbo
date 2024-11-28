package Latihan1;

public class Kalender {
    private int tanggal;
    private int bulan;
    private int tahun;


    public Kalender() {
        this.tanggal = 1;
        this.bulan = 1;
        this.tahun = 2000;
    }

    public Kalender(int tanggal) {
        this.tanggal = tanggal;
        this.bulan = 1;
        this.tahun = 2000;
    }

    public Kalender(int bulan, int tahun) {
        this.tanggal = 1;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public Kalender(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

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

    public void tampilkanTanggal() {
        System.out.println("Tanggal: " + this.tanggal + "-" +
                this.bulan + "-" + this.tahun);
    }
}