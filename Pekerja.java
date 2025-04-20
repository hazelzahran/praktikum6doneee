import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    protected double gaji;
    protected LocalDate tahunMasuk;
    protected int jumlahAnak;

    // Konstruktor dengan tambahan gaji, tahun masuk, dan jumlah anak
    public Pekerja(double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    // Menghitung lama kerja dalam tahun
    public int getLamaKerja() {
        return (int) ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
    }

    // Bonus berdasarkan lama kerja
    public double getBonus() {
        int lama = getLamaKerja();
        if (lama <= 5) return 0.05 * gaji;
        else if (lama <= 10) return 0.1 * gaji;
        else return 0.15 * gaji;
    }

    // Pendapatan = tunjangan + bonus + tunjangan anak
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    // Menampilkan data pekerja
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "tahun masuk\t: " + tahunMasuk + "\n" +
               "jumlah anak\t: " + jumlahAnak + "\n" +
               "gaji\t\t: " + gaji;
    }
}
