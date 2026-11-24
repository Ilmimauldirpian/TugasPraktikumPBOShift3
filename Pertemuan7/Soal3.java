/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;
class TebakLahir {
    // Method berparameter bulan dan tanggal untuk menghasilkan kode bulan + tanggal
    int hitungKodeLahir(int bulan, int tanggal) {
        return (bulan * 2 + 5) * 50 + tanggal - 250;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        TebakLahir tl = new TebakLahir();
        int kode = tl.hitungKodeLahir(1, 14);
        System.out.println("Hasil akhir: " + kode);
    }
}