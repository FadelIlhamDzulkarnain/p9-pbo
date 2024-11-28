package Tugas;

public class Tes {
    public static void main(String[] args) {
        // Membuat objek MultiTabungan dengan saldo awal 1.000.000 IDR
        MultiTabungan tabungan = new MultiTabungan(1000000);

        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + tabungan.getSaldo() + " IDR");

        // Menyimpan uang dalam AUD
        tabungan.simpanUang(100, "AUD");
        System.out.println("Setelah menambah 100 AUD, saldo: " + tabungan.getSaldo() + " IDR");

        // Menyimpan uang dalam USD
        tabungan.simpanUang(100, "USD");
        System.out.println("Setelah menambah 100 USD, saldo: " + tabungan.getSaldo() + " IDR");

        // Mengambil uang dalam IDR
        if (tabungan.ambilUang(500000, "IDR")) {
            System.out.println("Setelah mengambil 500.000 IDR, saldo: " + tabungan.getSaldo() + " IDR");
        }

        // Mengambil uang dalam AUD
        if (tabungan.ambilUang(50, "AUD")) {
            System.out.println("Setelah mengambil 50 AUD, saldo: " + tabungan.getSaldo() + " IDR");
        }

        // Mengambil uang dalam USD
        if (tabungan.ambilUang(30, "USD")) {
            System.out.println("Setelah mengambil 30 USD, saldo: " + tabungan.getSaldo() + " IDR");
        }
    }
}