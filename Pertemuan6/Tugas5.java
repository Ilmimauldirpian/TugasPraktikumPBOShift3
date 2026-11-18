/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] barang = new int[baris][kolom];

        int total = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {

                System.out.print("Jumlah barang baris " +
                        (i + 1) + " kolom " + (j + 1) + ": ");

                barang[i][j] = input.nextInt();

                total += barang[i][j];
            }
        }

        System.out.println("\n=== DATA BARANG ===");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(barang[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal seluruh barang: " + total);

        input.close();
    }
}