/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;



import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        int banyakAngka = scanner.nextInt();
        int ganjil = 1;
        int totalPenjumlahan = 0;

        for (int i = 1; i <= banyakAngka; i++) {
            System.out.print(ganjil + " ");
            totalPenjumlahan += ganjil;
            ganjil += 2;
        }

        System.out.println("\nTotal penjumlahan : " + totalPenjumlahan);
        scanner.close();
    }
}