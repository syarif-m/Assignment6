
import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja < 6) {
            return gaji * 0.05;
        } else if (tahunKerja >= 6 && tahunKerja < 11) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }
    public double getTunjangan() {
        double tunjangan = super.getTunjangan();
        if (jumlahAnak > 0) {
            tunjangan += jumlahAnak * 20;
        }
        return tunjangan;
    }
    public double getPendapatan() {
        return gaji + getBonus() + getTunjangan();
    }
    public String toString() {
        return super.toString() + "\nJumlah Anak: " + getJumlahAnak() + "\nTahun Masuk: " + getTahunMasuk() + "\nGaji: " + getGaji();
    }
}