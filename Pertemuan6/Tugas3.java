/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        int jumlah = 0;
        int ganjil = 0;
        int genap = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen indeks " + i + ": ");
            angka[i] = input.nextInt();

            jumlah += angka[i];

            if (i % 2 == 1) {
                ganjil += angka[i];
            } else {
                genap += angka[i];
            }
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        int indeksTerbesar = 0;
        int indeksTerkecil = 0;

        for (int i = 1; i < n; i++) {

            if (angka[i] > terbesar) {
                terbesar = angka[i];
                indeksTerbesar = i;
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
                indeksTerkecil = i;
            }
        }

        double rataRata = (double) jumlah / n;

        System.out.println("\n=== HASIL ARRAY ===");

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Indeks terbesar: " + indeksTerbesar);

        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Indeks terkecil: " + indeksTerkecil);

        System.out.println("Jumlah seluruh elemen: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Jumlah indeks ganjil: " + ganjil);
        System.out.println("Jumlah indeks genap: " + genap);

        int total = ganjil + genap;

        if (total % 2 == 0) {
            System.out.println("Hasil penjumlahan adalah GENAP");
        } else {
            System.out.println("Hasil penjumlahan adalah GANJIL");
        }

        input.close();
    }
}
