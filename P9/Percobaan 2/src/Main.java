package Percobaan2;

public class Main {
    public static void main(String[] args) {

        Mahasiswa2 mhs1 = new Mahasiswa2();
        System.out.println("Mahasiswa 1 - NRP: " + mhs1.getNrp() + ", Nama: " + mhs1.getNama());

        Mahasiswa2 mhs2 = new Mahasiswa2("Yassin");
        System.out.println("Mahasiswa 2 - NRP: " + mhs2.getNrp() + ", Nama: " + mhs2.getNama());

        Mahasiswa2 mhs3 = new Mahasiswa2(12344456, "broSki");
        System.out.println("Mahasiswa 3 - NRP: " + mhs3.getNrp() + ", Nama: " + mhs3.getNama());
    }
}
