package Tugas;

public class MultiTabungan {
    // Atribut private saldo yang disimpan dalam IDR
    private int saldo;

    // Konstanta nilai tukar mata uang
    private static final double AUD_TO_IDR = 10000;
    private static final double USD_TO_IDR = 9000;

    // Konstruktor untuk menginisialisasi saldo dalam IDR
    public MultiTabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    // Getter untuk mengambil saldo dalam IDR
    public int getSaldo() {
        return saldo;
    }

    // Metode untuk menyimpan uang dalam satuan mata uang tertentu
    public void simpanUang(int jumlah, String mataUang) {
        if (mataUang.equalsIgnoreCase("IDR")) {
            saldo += jumlah;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            saldo += jumlah * AUD_TO_IDR;
        } else if (mataUang.equalsIgnoreCase("USD")) {
            saldo += jumlah * USD_TO_IDR;
        } else {
            System.out.println("Mata uang tidak valid!");
        }
    }

    // Metode untuk mengambil uang dalam satuan mata uang tertentu
    public boolean ambilUang(int jumlah, String mataUang) {
        int jumlahDalamIDR = 0;

        if (mataUang.equalsIgnoreCase("IDR")) {
            jumlahDalamIDR = jumlah;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            jumlahDalamIDR = (int) (jumlah * AUD_TO_IDR);
        } else if (mataUang.equalsIgnoreCase("USD")) {
            jumlahDalamIDR = (int) (jumlah * USD_TO_IDR);
        } else {
            System.out.println("Mata uang tidak valid!");
            return false;
        }

        if (saldo >= jumlahDalamIDR) {
            saldo -= jumlahDalamIDR;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi!");
            return false;
        }
    }
}

