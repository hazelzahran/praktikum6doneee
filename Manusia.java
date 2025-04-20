public class Manusia {
    // Atribut dasar manusia
    protected String nama;
    protected boolean jenisKelamin; // true = laki-laki, false = perempuan
    protected String nik;
    protected boolean menikah;

    // Konstruktor untuk inisialisasi data
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    // Menghitung tunjangan berdasarkan status pernikahan dan jenis kelamin
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        }
        return 15;
    }

    // Total pendapatan hanya dari tunjangan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Menampilkan informasi manusia
    public String toString() {
        return "nama\t\t: " + nama + "\n" +
               "nik\t\t: " + nik + "\n" +
               "jenisKelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
               "pendapatan\t: " + getPendapatan();
    }
}
