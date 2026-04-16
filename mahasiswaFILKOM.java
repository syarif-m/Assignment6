public class mahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;
    private String status;
    mahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
        this.status = prodi() + ", 20" + angkatan();
    }
    String angkatan() {
        return nim.substring(0, 2);
    }
    String prodi() {
        String kodeProdi = nim.substring(6, 7);
        switch (kodeProdi) {
            case "2":
                return "Teknik Informatika";
            case "3":
                return "Teknik Komputer";
            case "4":
                return "Sistem Informasi";
            case "6":
                return "Pendidikan Teknologi Informasi";
            case "7":
                return "Teknologi Informasi";
            default:
                return "Prodi tidak ditemukan";
        }
    }

    public String getStatus() {
        return status;
    }

    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }
    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + getNim() + "\nIPK: " + getIpk() + "\nStatus: " + getStatus();
    }

}
