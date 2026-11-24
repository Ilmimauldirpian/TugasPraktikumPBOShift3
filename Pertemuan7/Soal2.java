
package Pertemuan7;
class PersegiPanjang {
    // Method untuk menghitung keliling persegi panjang
    int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }
}

public class Soal2 {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        int keliling = pp.hitungKeliling(10, 5);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}