public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    // Konstruktor dengan tambahan nim dan ipk
    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah); // Memanggil konstruktor dari kelas induk (Manusia)
        this.nim = nim;
        this.ipk = ipk;
    }

    // Menghitung beasiswa berdasarkan nilai IPK
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) return 50;
        else if (ipk >= 3.5 && ipk <= 4.0) return 75;
        else return 0;
    }

    // Menentukan status mahasiswa berdasarkan digit ke-7 dari NIM
    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        char prodiCode = nim.charAt(6);
        String prodi = switch (prodiCode) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Prodi tidak diketahui";
        };
        return prodi + ", 20" + angkatan;
    }

    // Pendapatan mahasiswa = tunjangan dari induk + beasiswa
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    // Menampilkan data lengkap mahasiswa
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "nim\t\t: " + nim + "\n" +
               "ipk\t\t: " + ipk + "\n" +
               "status\t\t: " + getStatus();
    }
}

