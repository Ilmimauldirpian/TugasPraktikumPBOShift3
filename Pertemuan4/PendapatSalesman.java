/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class PendapatSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari ini: Rp ");
        long penjualan = input.nextLong();

        long uangJasa = 0;
        double persentaseKomisi = 0;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persentaseKomisi = 0.10;
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            uangJasa = 200000;
            persentaseKomisi = 0.15;
        } else {
            uangJasa = 300000;
            persentaseKomisi = 0.20;
        }

        double uangKomisi = persentaseKomisi * penjualan;
        double totalPendapatan = uangJasa + uangKomisi;

        System.out.println("Uang Jasa        : Rp " + uangJasa);
        System.out.println("Uang Komisi      : Rp " + uangKomisi);
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
    }
}