public class Main {
    public static void main(String[] args) {
        // Test Manusia
        Manusia a = new Manusia("A", "111", true, true);
        Manusia b = new Manusia("B", "111", false, true);
        Manusia c = new Manusia("C", "111", true, false);

        // Test Mahasiswa
        MahasiswaFILKOM d = new MahasiswaFILKOM("165150300111100", 2.9, "D", "111", false, false);
        MahasiswaFILKOM e = new MahasiswaFILKOM("165150300111100", 3.3, "E", "111", true, false);
        MahasiswaFILKOM f = new MahasiswaFILKOM("165150300111100", 3.8, "F", "111", true, false);

        // Test Pekerja
        Pekerja g = new Pekerja(1000, 2023, 4, 20, "G", "111", true, true, 2);
        Pekerja h = new Pekerja(1000, 2016, 4, 20, "H", "111", true, true, 4);
        Pekerja i = new Pekerja(1000, 2004, 4, 20, "I", "111", true, true, 10);

        // Test Manager
        Manager j = new Manager("HRD", 7500, 2010, 4, 20, "J", "111", true, true, 3);

        // Cetak semua hasil toString()
        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(c);
        System.out.println();
        System.out.println(d);
        System.out.println();
        System.out.println(e);
        System.out.println();
        System.out.println(f);
        System.out.println();
        System.out.println(g);
        System.out.println();
        System.out.println(h);
        System.out.println();
        System.out.println(i);
        System.out.println();
        System.out.println(j);
    }
}

