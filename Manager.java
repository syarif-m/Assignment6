public class Manager extends Manusia {
    private double gaji;
    private String departemen;

    Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, String departemen) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.departemen = departemen;
    }
    public double getGaji() {
        return gaji;
    }
    public String getDepartemen() {
        return departemen;
    }
    public double getTunjangan() {
        double tunjangan = super.getTunjangan();
        tunjangan += gaji * 0.1; 
        return tunjangan;
    }
    public double getPendapatan() {
        return gaji + getTunjangan() + super.getTunjangan();
    }
    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + getDepartemen();
    }
}