public class Manager extends Pekerja {
    private String departemen;

    // Konstruktor dengan tambahan departemen
    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah, int jumlahAnak) {
        super(gaji, tahun, bulan, tanggal, nama, nik, jenisKelamin, menikah, jumlahAnak);
        this.departemen = departemen;
    }

    // Pendapatan ditambah 10% dari gaji
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + 0.1 * gaji;
    }

    // Menampilkan semua data manager
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "departemen\t: " + departemen;
    }
}
