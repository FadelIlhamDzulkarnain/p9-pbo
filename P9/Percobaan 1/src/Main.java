public class Main {
    public static void main(String[] args) {
        Mahasiswa1 mhs1 = new Mahasiswa1(23600032, "Ilham");
        System.out.println("NRP: " + mhs1.getNrp());
        System.out.println("Nama: " + mhs1.getNama());

        mhs1.setNrp(51);         mhs1.setNama("Ham");

        System.out.println("NRP setelah diubah: " + mhs1.getNrp());
        System.out.println("Nama setelah diubah: " + mhs1.getNama());
    }
}

