
package Pertemuan7;

class Mobil {
    String warna;
    int tahun;

    void tampilkanInfo() {
        System.out.println("Mobil saya Warna: " + warna + ", Tahun: " + tahun);
    }
}

public class Soal1 {
    public static void main(String[] args) {
        // Class Mobil diubah menjadi objek menggunakan keyword new
        Mobil m1 = new Mobil();
        m1.warna = "Merah";
        m1.tahun = 2022;
        m1.tampilkanInfo();
    }
}