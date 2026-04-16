class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    public String getNama() {
        return nama;
    }
    boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }
    public double getPendapatan() {
        return getTunjangan();
    }
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nJenis Kelamin: " + (getJenisKelamin() ? "Laki-laki" : "Perempuan") + "\nNIK: " + getNik() + "\nMenikah: " + (getMenikah() ? "Ya" : "Tidak") + "\nPendapatan: " + getPendapatan();
    }

    
}
