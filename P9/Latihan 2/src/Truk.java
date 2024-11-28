package Latihan2;

public class Truk {
    private double muatan = 0.0;
    private double muatanmaks;

    public Truk(double beratmaks) {
        this.muatanmaks = kiloToNewts(beratmaks);
    }

    public double getMuatan() {
        return newtsToKilo(muatan);
    }
    public double getMuatanMaks() {
        return Math.round(newtsToKilo(muatanmaks) * 10.0) / 10.0;
    }
    public boolean tambahMuatan(double berat) {
        double beratDalamNewts = kiloToNewts(berat);
        if (muatan + beratDalamNewts <= muatanmaks) {
            muatan += beratDalamNewts;
            return true;
        } else {
            return false;
        }
    }
    public double kiloToNewts(double berat) {
        return berat * 9.8; // 1 kilogram = 9.8 newton
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8; // 1 newton = 1/9.8 kilogram
    }
}