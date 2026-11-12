/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;


public class Tugas5 {
    public static void main(String[] args) {
        int n = 5;

        // 1. Half Triangle (5 baris: 1, 3, 5, 7, 9 bintang rata tengah)
        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi agar posisi bintang berada di tengah
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Mencetak bintang ganjil (1, 3, 5, 7, 9)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Full Triangle (Belah ketupat: 1, 3, 5, 3, 1 bintang rata tengah)
        System.out.println("\nFull Triangle");
        int tengah = 3; // Bagian terlebar ada di baris ke-3 (5 bintang)

        // Bagian atas sampai tengah (baris 1 sampai 3)
        for (int i = 1; i <= tengah; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah (baris 2 turun ke 1)
        for (int i = tengah - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}